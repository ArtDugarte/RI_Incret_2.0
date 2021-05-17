package Vistas;

import Modelos.DesplegableMarca;
import Modelos.DesplegableNombre;
import Modelos.Modelo;
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
import javax.swing.table.DefaultTableModel;

public class Busqueda_Estudiante extends javax.swing.JInternalFrame {

    public Busqueda_Estudiante() {

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Base = new javax.swing.JPanel();
        BusquedaEstu = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        serialBUE = new javax.swing.JTextField();
        numerotlfBUE = new javax.swing.JTextField();
        cedulaBUE = new javax.swing.JTextField();
        nombreBUE = new javax.swing.JTextField();
        apellidoBUE = new javax.swing.JTextField();
        direccionBUE = new javax.swing.JTextField();
        LupaBE = new javax.swing.JButton();
        limpiarBUE = new javax.swing.JButton();
        letra_cedulaBE = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Búsqueda de Estudiantes");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/alumno.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(1024, 700));
        setPreferredSize(new java.awt.Dimension(1024, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Base.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Base.setOpaque(false);
        Base.setLayout(new java.awt.CardLayout());

        BusquedaEstu.setOpaque(false);
        BusquedaEstu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel25.setText("Estudiante");
        BusquedaEstu.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel79.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel79.setText("Ingrese la Cédula del");
        BusquedaEstu.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel80.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel80.setText("Estudiante a Buscar");
        BusquedaEstu.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel81.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel81.setText("Instrumento Asignado,");
        BusquedaEstu.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel82.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel82.setText("Serial N°");
        BusquedaEstu.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        jLabel83.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel83.setText("Nombre");
        BusquedaEstu.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jLabel84.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel84.setText("Apellido");
        BusquedaEstu.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        jLabel85.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel85.setText("Dirección");
        BusquedaEstu.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        jLabel86.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel86.setText("Número Telefónico");
        BusquedaEstu.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        serialBUE.setEditable(false);
        serialBUE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaEstu.add(serialBUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 250, -1));

        numerotlfBUE.setEditable(false);
        numerotlfBUE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaEstu.add(numerotlfBUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 250, -1));

        cedulaBUE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cedulaBUE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaBUEKeyTyped(evt);
            }
        });
        BusquedaEstu.add(cedulaBUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 250, -1));

        nombreBUE.setEditable(false);
        nombreBUE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaEstu.add(nombreBUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 250, -1));

        apellidoBUE.setEditable(false);
        apellidoBUE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaEstu.add(apellidoBUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 250, -1));

        direccionBUE.setEditable(false);
        direccionBUE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaEstu.add(direccionBUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 250, -1));

        LupaBE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/icono_1.png"))); // NOI18N
        LupaBE.setBorderPainted(false);
        LupaBE.setContentAreaFilled(false);
        LupaBE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LupaBE.setFocusPainted(false);
        LupaBE.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/iconoapa.png"))); // NOI18N
        LupaBE.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/iconoapa.png"))); // NOI18N
        LupaBE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LupaBEActionPerformed(evt);
            }
        });
        BusquedaEstu.add(LupaBE, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 40, 40));

        limpiarBUE.setBackground(new java.awt.Color(103, 0, 0));
        limpiarBUE.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarBUE.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBUE.setText("Limpiar");
        limpiarBUE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiarBUE.setFocusPainted(false);
        limpiarBUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBUEActionPerformed(evt);
            }
        });
        BusquedaEstu.add(limpiarBUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        letra_cedulaBE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        letra_cedulaBE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "E-" }));
        letra_cedulaBE.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                letra_cedulaBEItemStateChanged(evt);
            }
        });
        BusquedaEstu.add(letra_cedulaBE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 50, 28));

        Base.add(BusquedaEstu, "card24");

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

    private void cedulaBUEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaBUEKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {

            getToolkit().beep();
            evt.consume();
        }
        if (letra_cedulaBE.getSelectedItem().equals("M-")) {

            if (cedulaBUE.getText().length() > 8) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        } else {
            if (cedulaBUE.getText().length() > 7) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }//GEN-LAST:event_cedulaBUEKeyTyped

    private void LupaBEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LupaBEActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == LupaBE) {

            if (cedulaBUE.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                Modelo Estudiante = new Modelo();
                Estudiante = null;
                OperarEstudiante OP = new OperarEstudiante();
                Estudiante = OP.BuscarEstudiante(letra_cedulaBE.getSelectedItem() + "" + cedulaBUE.getText());

                if (Estudiante != null) {

                    nombreBUE.setText(Estudiante.getNombre());
                    apellidoBUE.setText(Estudiante.getApellido());
                    numerotlfBUE.setText(Estudiante.getNumTlf());
                    direccionBUE.setText(Estudiante.getDirec());
                    Modelo Instrumento = new Modelo();
                    Instrumento = null;
                    OperarInstrumento OP2 = new OperarInstrumento();
                    Instrumento = OP2.BuscarSerial(Estudiante.getid_estudiante());
                    serialBUE.setText(Instrumento.getSerial());
                }
            }
        }
    }//GEN-LAST:event_LupaBEActionPerformed

    private void limpiarBUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBUEActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarBUE) {
            nombreBUE.setText("");
            cedulaBUE.setText("");
            serialBUE.setText("");
            apellidoBUE.setText("");
            direccionBUE.setText("");
            numerotlfBUE.setText("");
        }
    }//GEN-LAST:event_limpiarBUEActionPerformed

    private void letra_cedulaBEItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_letra_cedulaBEItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            cedulaBUE.setText("");
        }
    }//GEN-LAST:event_letra_cedulaBEItemStateChanged

    public void limpiarjif() {

        nombreBUE.setText("");
        cedulaBUE.setText("");
        serialBUE.setText("");
        apellidoBUE.setText("");
        direccionBUE.setText("");
        numerotlfBUE.setText("");
    }

    private String usuario, cedula_estudiante = "", serial_i = "";
    private boolean VolverLogin = true, administrador = false;
    private int id_estudiante = 0, id_instrumento = 0, id_usuario = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Base;
    private javax.swing.JPanel BusquedaEstu;
    private javax.swing.JButton LupaBE;
    private javax.swing.JTextField apellidoBUE;
    private javax.swing.JTextField cedulaBUE;
    private javax.swing.JTextField direccionBUE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> letra_cedulaBE;
    private javax.swing.JButton limpiarBUE;
    private javax.swing.JTextField nombreBUE;
    private javax.swing.JTextField numerotlfBUE;
    private javax.swing.JTextField serialBUE;
    // End of variables declaration//GEN-END:variables
}
