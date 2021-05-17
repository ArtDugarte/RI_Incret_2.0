package Modelos;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OperarEstudiante {

    private Modelo estu = null;

    public Modelo BuscarEstudiante(String cedula) {

        this.estu = estu;
        ResultSet rs = null;

        Modelo estu = new Modelo();
        BDConex bd = new BDConex();

        rs = bd.consultar("SELECT * FROM estudiantes WHERE cedula_e='" + cedula + "' and borrado_e=0");

        try {
            if (rs.first()) {
                rs.beforeFirst();
                rs.next();
                estu.setNombre(rs.getString("nomb_e"));
                estu.setApellido(rs.getString("ape_e"));
                estu.setDirec(rs.getString("direccion"));
                estu.setNumTlf(rs.getString("num_tlf"));
                estu.setTiene_instru(rs.getBoolean("tiene_instrumento"));
                estu.setId_docente(rs.getInt("id_docente"));
                estu.setid_estudiante(rs.getInt("id_e"));
            } else {
                
                JOptionPane.showMessageDialog(null, "El Estudiante no está Registrado \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                estu = null;
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return estu;
    }

    public Modelo BuscarCedula(int id) {

        this.estu = estu;
        ResultSet rs = null;

        Modelo estu = new Modelo();
        BDConex bd = new BDConex();

        rs = bd.consultar("SELECT *\n" + "FROM prestamo P, estudiantes E\n" + "WHERE P.fk_id_instru = '" + id
                + "'\n" + "AND P.fk_id_estu = E.id_e\n" + "AND P.prestamo_terminado =0");

        try {
            if (rs.first()) {
                rs.beforeFirst();
                rs.next();

                estu.setcedula(rs.getString("E.cedula_e"));

            } else {

                estu.setcedula("Este Instrumento no posee un Estudiante");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return estu;
    }

    public boolean borrar(String cedula) {
        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;

        op = bd.ejecutar("UPDATE estudiantes SET borrado_e=1 WHERE cedula_e='" + cedula + "' AND borrado_e=0 AND tiene_instrumento = 0");

        if (op > 0) {
            correcto = true;
            JOptionPane.showMessageDialog(null, "El Estudiante fue borrado exitosamente", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {
             JOptionPane.showMessageDialog(null, "    Ocurrio un Error al borrar al Estudiante  \n Quizá el Estudiante posea algun Instrumento...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        bd.desconectar();
        return correcto;
    }

    public boolean modificar(String nombre, String apellido, String cedula, String direccion, String telefono, int id, int id_d) {
        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        
        op = bd.ejecutar("UPDATE estudiantes SET nomb_e=\"" + nombre + "\",ape_e=\"" + apellido
        + "\",cedula_e=\"" + cedula + "\",num_tlf=\"" + telefono + "\",direccion=\"" + direccion
        + "\", id_docente=\"" +id_d +"\" WHERE borrado_e = 0 AND id_e = " + id + "");

        if (op > 0) {
            correcto = true;
            JOptionPane.showMessageDialog(null, "El Estudiante se modificó exitosamente", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Ocurrio un Error al modificar al Estudiante  \n           Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }

        bd.desconectar();
        return correcto;
    }

    public boolean RegistrarEstudiante(String nombre, String apellido, String cedula, String tlf, String direccion, String id) {
        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        Modelo estu = null;

        estu = buscar_estudiante(cedula);

        if (estu == null) {

            op = bd.ejecutar("INSERT INTO `ri_incret`.`estudiantes` (`id_e`, `nomb_e`, `ape_e`, `cedula_e`, `num_tlf`,`direccion`, `id_docente`, `progreso`, `tiene_instrumento`, `borrado_e`) VALUES (NULL, '"+nombre+"', '"+apellido+"', '"+cedula+"', '"+tlf+"', '"+direccion+"', '"+Integer.parseInt(id)+"', '0', '0', '0');");

            if (op > 0) {

                correcto = true;
                JOptionPane.showMessageDialog(null, "El Estudiante se registró exitosamente", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
            } else {

                JOptionPane.showMessageDialog(null, "Ocurrio un Error al registrar el Estudiante", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Esta Cédula ya está Registrada \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }

        bd.desconectar();
        return correcto;
    }

    public Modelo buscar_estudiante(String cedula) {

        this.estu = estu;
        ResultSet rs = null;

        Modelo estu = new Modelo();
        BDConex bd = new BDConex();

        rs = bd.consultar("SELECT * FROM estudiantes WHERE cedula_e='" + cedula + "' and borrado_e=0");

        try {
            if (rs.first()) {
                rs.beforeFirst();
                rs.next();
                estu.setNombre(rs.getString("nomb_e"));
                estu.setApellido(rs.getString("ape_e"));
                estu.setDirec(rs.getString("direccion"));
                estu.setNumTlf(rs.getString("num_tlf"));
                estu.setTiene_instru(rs.getBoolean("tiene_instrumento"));
                estu.setid_estudiante(rs.getInt("id_e"));
            } else {
                estu = null;
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return estu;
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

                result = bd.consultar("SELECT * FROM `estudiantes`,`docentes` WHERE `borrado_e`=0 and `estudiantes`.`id_docente`=`docentes`.`id` ORDER BY nomb_e");

                while (result.next() == true) {
                    iv = new Modelo();
                    iv.setNombre(result.getString("estudiantes.nomb_e"));
                    iv.setApellido(result.getString("estudiantes.ape_e"));
                    iv.setcedula(result.getString("estudiantes.cedula_e"));
                    iv.setDirec(result.getString("estudiantes.direccion"));
                    iv.setNumTlf(result.getString("estudiantes.num_tlf"));
                    iv.setNombre_docente(result.getString("docentes.nombre")+" "+ result.getString("docentes.apellido"));
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
    
    public ArrayList BuscarconMatriz(int id) {

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

                result = bd.consultar("SELECT * FROM `estudiantes`, `docentes` WHERE `docentes`.`id_usuario`= "+ id +" and `docentes`.`id`=`estudiantes`.`id_docente` and `estudiantes`.`borrado_e`=0");

                while (result.next() == true) {
                    iv = new Modelo();
                    iv.setNombre(result.getString("estudiantes.nomb_e"));
                    iv.setApellido(result.getString("estudiantes.ape_e"));
                    iv.setcedula(result.getString("estudiantes.cedula_e"));
                    iv.setDirec(result.getString("estudiantes.direccion"));
                    iv.setNumTlf(result.getString("estudiantes.num_tlf"));
                    iv.setProgreso(result.getInt("estudiantes.progreso"));
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
