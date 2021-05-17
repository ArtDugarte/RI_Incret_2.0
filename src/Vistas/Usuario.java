package Vistas;

import Modelos.DesplegableMarca;
import Modelos.DesplegableNombre;
import Modelos.Modelo;
import Modelos.OperarEstudiante;
import Modelos.OperarInstrumento;
import Modelos.OperarNombreInstrumento;
import Modelos.OperarPrestamo;
import Modelos.OperarUsuario;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Usuario extends javax.swing.JInternalFrame {

    public Usuario(int admin) {
       
        initComponents();
        
        if(admin == 0 || admin == 2){
            
            Desplegable1.removeItem("Registrar");
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Base = new javax.swing.JPanel();
        RegistrarUsu = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        nombreRU = new javax.swing.JTextField();
        limpiarRU = new javax.swing.JButton();
        registrarU = new javax.swing.JButton();
        contraseñaRU = new javax.swing.JPasswordField();
        cuadrito = new javax.swing.JCheckBox();
        ModificarUsu = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        nombreMU = new javax.swing.JTextField();
        nuevacontraMU = new javax.swing.JPasswordField();
        contraseñaMU = new javax.swing.JPasswordField();
        limpiarMU = new javax.swing.JButton();
        ModificarU = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Desplegable1 = new javax.swing.JComboBox<>();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Usuarios");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/hombre.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(1024, 700));
        setPreferredSize(new java.awt.Dimension(1024, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Base.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Base.setOpaque(false);
        Base.setLayout(new java.awt.CardLayout());

        RegistrarUsu.setOpaque(false);
        RegistrarUsu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel9.setText("Usuario");
        RegistrarUsu.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 150, -1));

        jLabel48.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel48.setText("Administrador");
        RegistrarUsu.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel49.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel49.setText("Nombre");
        RegistrarUsu.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel50.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel50.setText("Contraseña");
        RegistrarUsu.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        nombreRU.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RegistrarUsu.add(nombreRU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 240, -1));

        limpiarRU.setBackground(new java.awt.Color(103, 0, 0));
        limpiarRU.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarRU.setForeground(new java.awt.Color(255, 255, 255));
        limpiarRU.setText("Limpiar");
        limpiarRU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarRUActionPerformed(evt);
            }
        });
        RegistrarUsu.add(limpiarRU, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));

        registrarU.setBackground(new java.awt.Color(103, 0, 0));
        registrarU.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        registrarU.setForeground(new java.awt.Color(255, 255, 255));
        registrarU.setText("Registrar");
        registrarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarUActionPerformed(evt);
            }
        });
        RegistrarUsu.add(registrarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, -1, -1));

        contraseñaRU.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RegistrarUsu.add(contraseñaRU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 240, -1));

        cuadrito.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cuadrito.setContentAreaFilled(false);
        cuadrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cuadrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/checkbox1-35.png"))); // NOI18N
        cuadrito.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/checkbox2.png"))); // NOI18N
        RegistrarUsu.add(cuadrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 40, 40));

        Base.add(RegistrarUsu, "card8");

        ModificarUsu.setOpaque(false);
        ModificarUsu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel12.setText("Usuario");
        ModificarUsu.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel62.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel62.setText("Nombre de Usuario");
        ModificarUsu.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel63.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel63.setText("Contraseña");
        ModificarUsu.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel64.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel64.setText("Nueva Contraseña");
        ModificarUsu.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        nombreMU.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ModificarUsu.add(nombreMU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 220, -1));

        nuevacontraMU.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ModificarUsu.add(nuevacontraMU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 220, -1));

        contraseñaMU.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ModificarUsu.add(contraseñaMU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 220, -1));

        limpiarMU.setBackground(new java.awt.Color(103, 0, 0));
        limpiarMU.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarMU.setForeground(new java.awt.Color(255, 255, 255));
        limpiarMU.setText("Limpiar");
        limpiarMU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiarMU.setFocusPainted(false);
        limpiarMU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarMUActionPerformed(evt);
            }
        });
        ModificarUsu.add(limpiarMU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        ModificarU.setBackground(new java.awt.Color(103, 0, 0));
        ModificarU.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ModificarU.setForeground(new java.awt.Color(255, 255, 255));
        ModificarU.setText("Modificar");
        ModificarU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModificarU.setFocusPainted(false);
        ModificarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarUActionPerformed(evt);
            }
        });
        ModificarUsu.add(ModificarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, -1, -1));

        Base.add(ModificarUsu, "card11");

        jLayeredPane1.add(Base, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 660, 570));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/1_1.png"))); // NOI18N
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, 0, 1020, 670));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 700, 700));

        jPanel1.setBackground(new java.awt.Color(103, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/Logo_base.png"))); // NOI18N
        jLabel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione una Operación");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 300, -1));

        Desplegable1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Desplegable1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registrar", "Modificar" }));
        Desplegable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Desplegable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Desplegable1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Desplegable1ItemStateChanged(evt);
            }
        });
        jPanel1.add(Desplegable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 300, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Desplegable1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Desplegable1ItemStateChanged

        JComboBox cb = (JComboBox) evt.getSource();
        if (cb.getSelectedItem().equals("Registrar")) {

            RegistrarUsu.setVisible(true);
            ModificarUsu.setVisible(false);
            nombreRU.setText("");
            contraseñaRU.setText("");
            cuadrito.setSelected(false);

        }
        if (cb.getSelectedItem().equals("Modificar")) {

            RegistrarUsu.setVisible(false);
            ModificarUsu.setVisible(true);
            cedula_estudiante = "";
            nombreMU.setText("");
            contraseñaMU.setText("");
            nuevacontraMU.setText("");
        }
    }//GEN-LAST:event_Desplegable1ItemStateChanged

    private void limpiarRUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarRUActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarRU) {
            nombreRU.setText("");
            contraseñaRU.setText("");
            cuadrito.setSelected(false);
        }
    }//GEN-LAST:event_limpiarRUActionPerformed

    private void registrarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarUActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == registrarU) {

            if (nombreRU.getText().equals("") || contraseñaRU.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Alguno de los Campos está Vacío. \n          Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {

                int admin = 0;
                if (cuadrito.isSelected()) {

                    admin = 1;
                }
                OperarUsuario OP = new OperarUsuario();
                OP.RegistrarUsuario(nombreRU.getText(), contraseñaRU.getText(), admin);
            }
        }
    }//GEN-LAST:event_registrarUActionPerformed

    private void limpiarMUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarMUActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarMU) {
            nombreMU.setText("");
            contraseñaMU.setText("");
            nuevacontraMU.setText("");
        }
    }//GEN-LAST:event_limpiarMUActionPerformed

    private void ModificarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarUActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == ModificarU) {

            OperarUsuario OP = new OperarUsuario();

            if (nombreMU.getText().equals("") || contraseñaMU.getText().equals("") || nuevacontraMU.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Alguno de los Campos está Vacío. \n          Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {

                OP.modificar(nombreMU.getText(), contraseñaMU.getText(), nuevacontraMU.getText());
            }
        }
    }//GEN-LAST:event_ModificarUActionPerformed

    public void limpiarjif() {

        nombreMU.setText("");
        contraseñaMU.setText("");
        nuevacontraMU.setText("");
        nombreRU.setText("");
        contraseñaRU.setText("");
        cuadrito.setSelected(false);
        cedula_estudiante = "";
        Desplegable1.setSelectedItem("Registrar");
    }

    private String usuario, cedula_estudiante = "", serial_i = "";
    private boolean VolverLogin = true, administrador = false;
    private int id_estudiante = 0, id_instrumento = 0, id_usuario = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Base;
    private javax.swing.JComboBox<String> Desplegable1;
    private javax.swing.JButton ModificarU;
    private javax.swing.JPanel ModificarUsu;
    private javax.swing.JPanel RegistrarUsu;
    private javax.swing.JPasswordField contraseñaMU;
    private javax.swing.JPasswordField contraseñaRU;
    private javax.swing.JCheckBox cuadrito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiarMU;
    private javax.swing.JButton limpiarRU;
    private javax.swing.JTextField nombreMU;
    private javax.swing.JTextField nombreRU;
    private javax.swing.JPasswordField nuevacontraMU;
    private javax.swing.JButton registrarU;
    // End of variables declaration//GEN-END:variables
}
