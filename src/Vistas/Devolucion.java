package Vistas;

import Modelos.DesplegableMarca;
import Modelos.DesplegableNombre;
import Modelos.Modelo;
import Modelos.OperarDevolucion;
import Modelos.OperarEstudiante;
import Modelos.OperarInstrumento;
import Modelos.OperarNombreInstrumento;
import Modelos.OperarPrestamo;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Devolucion extends javax.swing.JInternalFrame {

    public Devolucion() {

        initComponents();
        fechadevoD.setText(DameFecha());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Base = new javax.swing.JPanel();
        PanelDevo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        D1 = new javax.swing.JLabel();
        D2 = new javax.swing.JLabel();
        D3 = new javax.swing.JLabel();
        D4 = new javax.swing.JLabel();
        D5 = new javax.swing.JLabel();
        D6 = new javax.swing.JLabel();
        marcainstruD = new javax.swing.JTextField();
        nombreinstruD = new javax.swing.JTextField();
        serialD = new javax.swing.JTextField();
        cedulaD = new javax.swing.JTextField();
        nombreD = new javax.swing.JTextField();
        fechadevoD = new javax.swing.JTextField();
        lupaD1 = new javax.swing.JButton();
        apellidoD = new javax.swing.JTextField();
        limpiarD = new javax.swing.JButton();
        registrarD = new javax.swing.JButton();
        letra_cedulaD = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Devoluciones");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/devolucion.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(1024, 700));
        setPreferredSize(new java.awt.Dimension(1024, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Base.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Base.setOpaque(false);
        Base.setLayout(new java.awt.CardLayout());

        PanelDevo.setOpaque(false);
        PanelDevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setText("Devolución");
        PanelDevo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 200, -1));

        jLabel36.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel36.setText("Fecha de Devolución");
        PanelDevo.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        D1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        D1.setText("Cédula del Estudiante");
        PanelDevo.add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        D2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        D2.setText("Nombre");
        PanelDevo.add(D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        D3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        D3.setText("Apellido");
        PanelDevo.add(D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        D4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        D4.setText("Serial del Instrumento");
        PanelDevo.add(D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        D5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        D5.setText("Nombre del Instrumento");
        PanelDevo.add(D5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        D6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        D6.setText("Marca del Instrumento");
        PanelDevo.add(D6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        marcainstruD.setEditable(false);
        marcainstruD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelDevo.add(marcainstruD, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 250, -1));

        nombreinstruD.setEditable(false);
        nombreinstruD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelDevo.add(nombreinstruD, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 250, -1));

        serialD.setEditable(false);
        serialD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelDevo.add(serialD, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 250, -1));

        cedulaD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cedulaD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaDKeyTyped(evt);
            }
        });
        PanelDevo.add(cedulaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 250, 28));

        nombreD.setEditable(false);
        nombreD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelDevo.add(nombreD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 250, -1));

        fechadevoD.setEditable(false);
        fechadevoD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelDevo.add(fechadevoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 250, -1));

        lupaD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/icono_1.png"))); // NOI18N
        lupaD1.setBorderPainted(false);
        lupaD1.setContentAreaFilled(false);
        lupaD1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lupaD1.setFocusPainted(false);
        lupaD1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/iconoapa.png"))); // NOI18N
        lupaD1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/iconoapa.png"))); // NOI18N
        lupaD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupaD1ActionPerformed(evt);
            }
        });
        PanelDevo.add(lupaD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 40, 40));

        apellidoD.setEditable(false);
        apellidoD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelDevo.add(apellidoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 250, -1));

        limpiarD.setBackground(new java.awt.Color(103, 0, 0));
        limpiarD.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarD.setForeground(new java.awt.Color(255, 255, 255));
        limpiarD.setText("Limpiar");
        limpiarD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiarD.setFocusPainted(false);
        limpiarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarDActionPerformed(evt);
            }
        });
        PanelDevo.add(limpiarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        registrarD.setBackground(new java.awt.Color(103, 0, 0));
        registrarD.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        registrarD.setForeground(new java.awt.Color(255, 255, 255));
        registrarD.setText("Registar");
        registrarD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarD.setFocusPainted(false);
        registrarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarDActionPerformed(evt);
            }
        });
        PanelDevo.add(registrarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, -1, -1));

        letra_cedulaD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        letra_cedulaD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "E-" }));
        letra_cedulaD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        letra_cedulaD.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                letra_cedulaDItemStateChanged(evt);
            }
        });
        PanelDevo.add(letra_cedulaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 50, 28));

        Base.add(PanelDevo, "card3");

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cedulaDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaDKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {

            getToolkit().beep();
            evt.consume();
        }
        if (letra_cedulaD.getSelectedItem().equals("M-")) {

            if (cedulaD.getText().length() > 8) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        } else {
            if (cedulaD.getText().length() > 7) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }//GEN-LAST:event_cedulaDKeyTyped

    private void lupaD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupaD1ActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == lupaD1) {

            if (cedulaD.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                id_estudiante = 0;
                id_instrumento = 0;
                Modelo devolucion = new Modelo();
                devolucion = null;
                OperarDevolucion OP = new OperarDevolucion();
                devolucion = OP.BuscarDevolucion(letra_cedulaD.getSelectedItem() + "" + cedulaD.getText());

                if (devolucion != null) {

                    id_instrumento = devolucion.getid_instru();
                    id_estudiante = devolucion.getid_estudiante();
                    nombreinstruD.setText(devolucion.getNombre_instrumento());
                    marcainstruD.setText(devolucion.getMarca_instrumento());
                    nombreD.setText(devolucion.getNombre());
                    apellidoD.setText(devolucion.getApellido());
                    serialD.setText(devolucion.getSerial());
                    fechadevoD.setText(devolucion.getFecha_devolucion());
                }
            }
        }
    }//GEN-LAST:event_lupaD1ActionPerformed

    private void limpiarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarDActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarD) {
            cedulaD.setText("");
            nombreD.setText("");
            apellidoD.setText("");
            serialD.setText("");
            nombreinstruD.setText("");
            marcainstruD.setText("");
            fechadevoD.setText("");
            fechadevoD.setText(DameFecha());
        }
    }//GEN-LAST:event_limpiarDActionPerformed

    private void registrarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarDActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == registrarD) {

            if (cedulaD.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                OperarDevolucion OP = new OperarDevolucion();
                OP.RegistrarDevolucion(id_estudiante, id_instrumento);
            }
        }
    }//GEN-LAST:event_registrarDActionPerformed

    private void letra_cedulaDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_letra_cedulaDItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            cedulaD.setText("");
        }
    }//GEN-LAST:event_letra_cedulaDItemStateChanged

    public void limpiarjif() {

        cedulaD.setText("");
        nombreD.setText("");
        apellidoD.setText("");
        serialD.setText("");
        nombreinstruD.setText("");
        marcainstruD.setText("");
        fechadevoD.setText("");
        fechadevoD.setText(DameFecha());
    }

    public String DameFecha() {

        String pattern = "dd/MM/yyyy";

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        String t = sdf.format(new Date());
        return t;
    }

    private String usuario, cedula_estudiante = "", serial_i = "";
    private boolean VolverLogin = true, administrador = false;
    private int id_estudiante = 0, id_instrumento = 0, id_usuario = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Base;
    private javax.swing.JLabel D1;
    private javax.swing.JLabel D2;
    private javax.swing.JLabel D3;
    private javax.swing.JLabel D4;
    private javax.swing.JLabel D5;
    private javax.swing.JLabel D6;
    private javax.swing.JPanel PanelDevo;
    private javax.swing.JTextField apellidoD;
    private javax.swing.JTextField cedulaD;
    private javax.swing.JTextField fechadevoD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> letra_cedulaD;
    private javax.swing.JButton limpiarD;
    private javax.swing.JButton lupaD1;
    private javax.swing.JTextField marcainstruD;
    private javax.swing.JTextField nombreD;
    private javax.swing.JTextField nombreinstruD;
    private javax.swing.JButton registrarD;
    private javax.swing.JTextField serialD;
    // End of variables declaration//GEN-END:variables
}
