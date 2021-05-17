package Modelos;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OperarProgreso {

    private Modelo pro = null;

    public Modelo BuscarProgreso(String cedula, int id) {

        this.pro = pro;
        ResultSet rs = null;

        Modelo pro = new Modelo();
        BDConex bd = new BDConex();

        rs = bd.consultar("SELECT * FROM `estudiantes`, `docentes` WHERE `docentes`.`id_usuario`= "+ id +" and `docentes`.`id`=`estudiantes`.`id_docente` and `estudiantes`.`borrado_e`=0 and `estudiantes`.`cedula_e`= \""+ cedula +"\"");

        try {
            if (rs.first()) {
                rs.beforeFirst();
                rs.next();
                pro.setProgreso(rs.getInt("estudiantes.progreso"));
            } else {
                
                JOptionPane.showMessageDialog(null, "El estudiante no está registrado o quizá no sea suyo \n                    ¡Intente Nuevamente!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                pro = null;
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return pro;
    }
    
    public boolean modificar(String cedula, int progreso) {
        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        
        op = bd.ejecutar("UPDATE estudiantes SET progreso=\"" + progreso + "\" WHERE borrado_e = 0 AND cedula_e = \"" + cedula + "\"");

        if (op > 0) {
            correcto = true;
            JOptionPane.showMessageDialog(null, "El progreso del estudiante fué registrado", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Ocurrio un Error al modificar el progreso  \n           Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }

        bd.desconectar();
        return correcto;
    }
}
