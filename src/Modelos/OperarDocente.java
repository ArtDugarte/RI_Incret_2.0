package Modelos;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OperarDocente {

    private Modelo docente = null;

    public Modelo BuscarDocente(String cedula) {

        this.docente = docente;
        ResultSet rs = null;

        Modelo docente = new Modelo();
        BDConex bd = new BDConex();

        rs = bd.consultar("SELECT * FROM docentes WHERE cedula='" + cedula + "' and borrado=0");

        try {
            if (rs.first()) {
                rs.beforeFirst();
                rs.next();
                docente.setNombre(rs.getString("nombre"));
                docente.setApellido(rs.getString("apellido"));
                docente.setDirec(rs.getString("direccion"));
                docente.setNumTlf(rs.getString("telefono"));
                docente.setId_docente(rs.getInt("id"));
            } else {
                
                JOptionPane.showMessageDialog(null, "El Docente no está Registrado \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                docente = null;
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return docente;
    }

    public Modelo BuscarCedula(int id) {

        this.docente = docente;
        ResultSet rs = null;

        Modelo docente = new Modelo();
        BDConex bd = new BDConex();

        rs = bd.consultar("SELECT *\n" + "FROM prestamo P, estudiantes E\n" + "WHERE P.fk_id_instru = '" + id
                + "'\n" + "AND P.fk_id_estu = E.id_e\n" + "AND P.prestamo_terminado =0");

        try {
            if (rs.first()) {
                rs.beforeFirst();
                rs.next();

                docente.setcedula(rs.getString("E.cedula_e"));

            } else {

                docente.setcedula("Este Instrumento no posee un Estudiante");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return docente;
    }

    public boolean borrar(String cedula) {
        int op = 0;
        String ci = cedula.substring(2);
        BDConex bd = new BDConex();
        boolean correcto = false;

        op = bd.ejecutar("UPDATE docentes SET borrado=1 WHERE cedula='" + cedula + "' AND borrado=0 ");

        if (op > 0) {
            correcto = true;
            JOptionPane.showMessageDialog(null, "El Docente fue borrado exitosamente", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {
             JOptionPane.showMessageDialog(null, "    Ocurrio un Error al borrar al Docente", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        bd.desconectar();
        return correcto;
    }

    public boolean modificar(String nombre, String apellido, String cedula, String direccion, String telefono, int id) {
        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        
        op = bd.ejecutar("UPDATE docentes SET nombre=\"" + nombre + "\",apellido=\"" + apellido
        + "\",cedula=\"" + cedula + "\",telefono=\"" + telefono + "\",direccion=\"" + direccion
        + "\" WHERE borrado = 0 AND id = " + id + "");

        if (op > 0) {
            correcto = true;
            JOptionPane.showMessageDialog(null, "El Docente se modificó exitosamente", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Ocurrio un Error al modificar al Docente  \n           Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }

        bd.desconectar();
        return correcto;
    }

    public boolean RegistrarDocente(String nombre, String apellido, String cedula, String tlf, String direccion,int id_usu) {
        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        Modelo estu = null;

        estu = buscar_docente(cedula);

        if (estu == null) {

            op = bd.ejecutar("INSERT INTO `docentes` (`id`, `nombre`, `apellido`, `cedula`, `telefono`, `direccion`, "
                    + "`borrado`, `id_usuario`) VALUES (NULL, '" + nombre + "', '" + apellido + "',"
                    + " '" + cedula + "', '" + tlf + "', '" + direccion + "', '0', "+ id_usu +");");

            if (op > 0) {

                correcto = true;
                JOptionPane.showMessageDialog(null, "El Docente se registró exitosamente", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
            } else {

                JOptionPane.showMessageDialog(null, "Ocurrio un Error al registrar el Docente", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Esta Cédula ya está Registrada \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }

        bd.desconectar();
        return correcto;
    }

    public Modelo buscar_docente(String cedula) {

        this.docente = docente;
        ResultSet rs = null;

        Modelo docente = new Modelo();
        BDConex bd = new BDConex();

        rs = bd.consultar("SELECT * FROM docentes WHERE cedula='" + cedula + "' and borrado=0");

        try {
            if (rs.first()) {
                rs.beforeFirst();
                rs.next();
                docente.setNombre(rs.getString("nombre"));
                docente.setApellido(rs.getString("apellido"));
                docente.setDirec(rs.getString("direccion"));
                docente.setNumTlf(rs.getString("telefono"));
                docente.setId_docente(rs.getInt("id"));
            } else {
                docente = null;
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return docente;
    }

    public ArrayList BuscarconMatriz() {

        ArrayList lista = new ArrayList<>();
        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        PreparedStatement statement = null;
        ResultSet result = null;
        Connection connection;

        Modelo iv;
        connection = bd.getConexion();

        try {

            if (connection != null) {

                result = bd.consultar("SELECT * FROM `docentes` WHERE `borrado`=0 ORDER BY nombre");

                while (result.next() == true) {
                    iv = new Modelo();
                    iv.setNombre(result.getString("nombre"));
                    iv.setApellido(result.getString("apellido"));
                    iv.setcedula(result.getString("cedula"));
                    iv.setDirec(result.getString("direccion"));
                    iv.setNumTlf(result.getString("telefono"));
                    lista.add(iv);
                }
            }
        } catch (SQLException e) {

            System.out.println(e);

        } finally {

            try {

                connection.close();
                bd.desconectar();

            } catch (SQLException e) {

                e.printStackTrace();
            }
        }
        return lista;
    }
}
