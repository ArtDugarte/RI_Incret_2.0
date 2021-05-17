package Modelos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.mysql.jdbc.PreparedStatement;

public class DesplegableDocentes {
    
   public ArrayList DesplegableDocentes() {
		  
        ArrayList docentes = new ArrayList<>();
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
                
		    result = bd.consultar("SELECT * FROM `docentes` WHERE `borrado`=0");
		   
		    while(result.next()== true){
                        iv = new Modelo();
                        iv.setId_docente(Integer.parseInt(result.getString("id")));
                        iv.setNombre(result.getString("nombre"));
                        iv.setApellido(result.getString("apellido"));
		          
                        docentes.add(iv);
		    }  
                }
            }catch (SQLException e) {
                
                System.out.println(e);
                
                }finally{
            
                    try {
                        
                        connection.close();
                        bd.desconectar();
                    
                    }catch (SQLException e){
		    
                        e.printStackTrace();
		    }
		}
        return docentes;
    }
}