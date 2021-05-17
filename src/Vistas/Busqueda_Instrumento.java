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

public class Busqueda_Instrumento extends javax.swing.JInternalFrame {

    public Busqueda_Instrumento() {

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Base = new javax.swing.JPanel();
        BusquedaInstru = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        cedulaBUI = new javax.swing.JTextField();
        colorBUI = new javax.swing.JTextField();
        serialBUI = new javax.swing.JTextField();
        nombreBUI = new javax.swing.JTextField();
        marcaBUI = new javax.swing.JTextField();
        LupaBI = new javax.swing.JButton();
        limpiarBUI = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Búsqueda de Instrumentos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/instrumento.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(1024, 700));
        setPreferredSize(new java.awt.Dimension(1024, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Base.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Base.setOpaque(false);
        Base.setLayout(new java.awt.CardLayout());

        BusquedaInstru.setOpaque(false);
        BusquedaInstru.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel26.setText("Instrumento");
        BusquedaInstru.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jLabel87.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel87.setText("Ingrese el Serial del");
        BusquedaInstru.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel88.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel88.setText("Instrumento a Buscar");
        BusquedaInstru.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel89.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel89.setText("Estudiante Asignado,");
        BusquedaInstru.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel90.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel90.setText("Cédula N°");
        BusquedaInstru.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jLabel91.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel91.setText("Nombre");
        BusquedaInstru.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        jLabel92.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel92.setText("Marca");
        BusquedaInstru.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        jLabel93.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel93.setText("Color");
        BusquedaInstru.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        cedulaBUI.setEditable(false);
        cedulaBUI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaInstru.add(cedulaBUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 260, -1));

        colorBUI.setEditable(false);
        colorBUI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaInstru.add(colorBUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 260, -1));

        serialBUI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaInstru.add(serialBUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 260, -1));

        nombreBUI.setEditable(false);
        nombreBUI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaInstru.add(nombreBUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 260, -1));

        marcaBUI.setEditable(false);
        marcaBUI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaInstru.add(marcaBUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 260, -1));

        LupaBI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/icono_1.png"))); // NOI18N
        LupaBI.setContentAreaFilled(false);
        LupaBI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LupaBI.setDefaultCapable(false);
        LupaBI.setFocusPainted(false);
        LupaBI.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/iconoapa.png"))); // NOI18N
        LupaBI.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/iconoapa.png"))); // NOI18N
        LupaBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LupaBIActionPerformed(evt);
            }
        });
        BusquedaInstru.add(LupaBI, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 40, 40));

        limpiarBUI.setBackground(new java.awt.Color(103, 0, 0));
        limpiarBUI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarBUI.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBUI.setText("Limpiar");
        limpiarBUI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiarBUI.setFocusPainted(false);
        limpiarBUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBUIActionPerformed(evt);
            }
        });
        BusquedaInstru.add(limpiarBUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        Base.add(BusquedaInstru, "card25");

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

    private void LupaBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LupaBIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == LupaBI) {

            if (serialBUI.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                Modelo Instrumento = new Modelo();
                Instrumento = null;
                OperarInstrumento OP = new OperarInstrumento();
                Instrumento = OP.BuscarInstrumento(serialBUI.getText().toUpperCase());

                if (Instrumento != null) {

                    nombreBUI.setText(Instrumento.getNombre_instrumento());
                    marcaBUI.setText(Instrumento.getMarca_instrumento());
                    colorBUI.setText(Instrumento.getColor());
                    Modelo Estudiante = new Modelo();
                    Estudiante = null;
                    OperarEstudiante OP2 = new OperarEstudiante();
                    Estudiante = OP2.BuscarCedula(Instrumento.getid_instru());
                    cedulaBUI.setText(Estudiante.getcedula());
                }
            }
        }
    }//GEN-LAST:event_LupaBIActionPerformed

    private void limpiarBUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBUIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarBUI) {
            nombreBUI.setText("");
            cedulaBUI.setText("");
            serialBUI.setText("");
            colorBUI.setText("");
            marcaBUI.setText("");
        }
    }//GEN-LAST:event_limpiarBUIActionPerformed

    public void limpiarjif() {

        nombreBUI.setText("");
        cedulaBUI.setText("");
        serialBUI.setText("");
        colorBUI.setText("");
        marcaBUI.setText("");

    }

    private String usuario, cedula_estudiante = "", serial_i = "";
    private boolean VolverLogin = true, administrador = false;
    private int id_estudiante = 0, id_instrumento = 0, id_usuario = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Base;
    private javax.swing.JPanel BusquedaInstru;
    private javax.swing.JButton LupaBI;
    private javax.swing.JTextField cedulaBUI;
    private javax.swing.JTextField colorBUI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiarBUI;
    private javax.swing.JTextField marcaBUI;
    private javax.swing.JTextField nombreBUI;
    private javax.swing.JTextField serialBUI;
    // End of variables declaration//GEN-END:variables
}
