package principal;

import MDI.MDI;
import Modelos.BDConex;
import Vistas.login;
import javax.swing.JOptionPane;

public class principal {

    public static void main(String[] args) {

        login login;
        MDI MDI;

        BDConex Conexion = new BDConex();

        login = new login();
        login.setVisible(true);

        while (login.InicioCorrecto() == false) {
            System.out.print("");
        }

        if (login.InicioCorrecto() == true) {

            MDI = new MDI(login.get_administrador(), login.getid_usuario());
            MDI.setusuario(login.get_usuario());
            MDI.setadministrador(login.get_administrador());
            MDI.setid_usuario(login.getid_usuario());
            MDI.setVisible(true);
            login.dispose();
        }
    }
}
