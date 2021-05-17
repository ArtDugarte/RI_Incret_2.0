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

public class Busqueda_PresAct extends javax.swing.JInternalFrame {

    public Busqueda_PresAct() {

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Base = new javax.swing.JPanel();
        BusquedaPresAct = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        direccionBPA = new javax.swing.JTextField();
        cedulaBPA = new javax.swing.JTextField();
        nombreEBPA = new javax.swing.JTextField();
        apellidoBPA = new javax.swing.JTextField();
        numerotlfBPA = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        nombreIBPA = new javax.swing.JTextField();
        serialBPA = new javax.swing.JTextField();
        marcaBPA = new javax.swing.JTextField();
        colorBPA = new javax.swing.JTextField();
        fechaDBPA = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        usuBPA = new javax.swing.JTextField();
        fechaEBPA = new javax.swing.JTextField();
        limpiarBPA = new javax.swing.JButton();
        LupaBPA = new javax.swing.JButton();
        letra_cedulaBPA = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Búsqueda de Préstamos Activos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/prestamo.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(1024, 700));
        setPreferredSize(new java.awt.Dimension(1024, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Base.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Base.setOpaque(false);
        Base.setLayout(new java.awt.CardLayout());

        BusquedaPresAct.setOpaque(false);
        BusquedaPresAct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel108.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel108.setText("Préstamo Activo");
        BusquedaPresAct.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel109.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel109.setText("Ingrese la Cédula del");
        BusquedaPresAct.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel110.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel110.setText("Estudiante a Buscar");
        BusquedaPresAct.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel111.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel111.setText("Nombre del Estudiante");
        BusquedaPresAct.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel112.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel112.setText("Apellido del Estudiante");
        BusquedaPresAct.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel114.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel114.setText("Dirección");
        BusquedaPresAct.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel115.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel115.setText("Número Telefónico");
        BusquedaPresAct.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        direccionBPA.setEditable(false);
        direccionBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaPresAct.add(direccionBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 250, -1));

        cedulaBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cedulaBPA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaBPAKeyTyped(evt);
            }
        });
        BusquedaPresAct.add(cedulaBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 250, -1));

        nombreEBPA.setEditable(false);
        nombreEBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaPresAct.add(nombreEBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 250, -1));

        apellidoBPA.setEditable(false);
        apellidoBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaPresAct.add(apellidoBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 250, -1));

        numerotlfBPA.setEditable(false);
        numerotlfBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaPresAct.add(numerotlfBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 250, -1));

        jLabel116.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel116.setText("Registrado por");
        BusquedaPresAct.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        jLabel117.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel117.setText("Fecha de Entrega");
        BusquedaPresAct.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        jLabel118.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel118.setText("Fecha de Devolución");
        BusquedaPresAct.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        jLabel120.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel120.setText("Serial del Instrumento");
        BusquedaPresAct.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        jLabel121.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel121.setText("Color del Instrumento");
        BusquedaPresAct.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        jLabel122.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel122.setText("Marca del Instrumento");
        BusquedaPresAct.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        nombreIBPA.setEditable(false);
        nombreIBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaPresAct.add(nombreIBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 270, -1));

        serialBPA.setEditable(false);
        serialBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaPresAct.add(serialBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 270, -1));

        marcaBPA.setEditable(false);
        marcaBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaPresAct.add(marcaBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 270, -1));

        colorBPA.setEditable(false);
        colorBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaPresAct.add(colorBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 270, -1));

        fechaDBPA.setEditable(false);
        fechaDBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaPresAct.add(fechaDBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 270, -1));

        jLabel104.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel104.setText("Nombre del Instrumento");
        BusquedaPresAct.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        usuBPA.setEditable(false);
        usuBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaPresAct.add(usuBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 270, -1));

        fechaEBPA.setEditable(false);
        fechaEBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaPresAct.add(fechaEBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 250, -1));

        limpiarBPA.setBackground(new java.awt.Color(103, 0, 0));
        limpiarBPA.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarBPA.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBPA.setText("Limpiar");
        limpiarBPA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiarBPA.setFocusPainted(false);
        limpiarBPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBPAActionPerformed(evt);
            }
        });
        BusquedaPresAct.add(limpiarBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        LupaBPA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/icono_1.png"))); // NOI18N
        LupaBPA.setBorderPainted(false);
        LupaBPA.setContentAreaFilled(false);
        LupaBPA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LupaBPA.setFocusPainted(false);
        LupaBPA.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/iconoapa.png"))); // NOI18N
        LupaBPA.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/iconoapa.png"))); // NOI18N
        LupaBPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LupaBPAActionPerformed(evt);
            }
        });
        BusquedaPresAct.add(LupaBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 50, -1));

        letra_cedulaBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        letra_cedulaBPA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "E-" }));
        letra_cedulaBPA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                letra_cedulaBPAItemStateChanged(evt);
            }
        });
        BusquedaPresAct.add(letra_cedulaBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 50, 28));

        Base.add(BusquedaPresAct, "card26");

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

    private void cedulaBPAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaBPAKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {

            getToolkit().beep();
            evt.consume();
        }
        if (letra_cedulaBPA.getSelectedItem().equals("M-")) {

            if (cedulaBPA.getText().length() > 8) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        } else {
            if (cedulaBPA.getText().length() > 7) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }//GEN-LAST:event_cedulaBPAKeyTyped

    private void limpiarBPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBPAActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarBPA) {
            nombreEBPA.setText("");
            apellidoBPA.setText("");
            cedulaBPA.setText("");
            direccionBPA.setText("");
            numerotlfBPA.setText("");
            fechaEBPA.setText("");
            serialBPA.setText("");
            nombreIBPA.setText("");
            marcaBPA.setText("");
            colorBPA.setText("");
            usuBPA.setText("");
            fechaDBPA.setText("");
        }
    }//GEN-LAST:event_limpiarBPAActionPerformed

    private void LupaBPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LupaBPAActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == LupaBPA) {

            if (cedulaBPA.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                Modelo Prestamo = new Modelo();
                Prestamo = null;
                OperarPrestamo OP = new OperarPrestamo();
                Prestamo = OP.BuscarPrestamo(letra_cedulaBPA.getSelectedItem() + "" + cedulaBPA.getText());

                if (Prestamo != null) {

                    nombreEBPA.setText(Prestamo.getNombre());
                    apellidoBPA.setText(Prestamo.getApellido());
                    direccionBPA.setText(Prestamo.getDirec());
                    numerotlfBPA.setText(Prestamo.getNumTlf());
                    serialBPA.setText(Prestamo.getSerial());
                    nombreIBPA.setText(Prestamo.getNombre_instrumento());
                    marcaBPA.setText(Prestamo.getMarca_instrumento());
                    colorBPA.setText(Prestamo.getColor());
                    usuBPA.setText(Prestamo.getusuario());
                    fechaEBPA.setText(Prestamo.getfecha_entrega());
                    fechaDBPA.setText(Prestamo.getFecha_devolucion());
                }
            }
        }
    }//GEN-LAST:event_LupaBPAActionPerformed

    private void letra_cedulaBPAItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_letra_cedulaBPAItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            cedulaBPA.setText("");
        }
    }//GEN-LAST:event_letra_cedulaBPAItemStateChanged

    public void limpiarjif() {

        nombreEBPA.setText("");
        apellidoBPA.setText("");
        cedulaBPA.setText("");
        direccionBPA.setText("");
        numerotlfBPA.setText("");
        fechaEBPA.setText("");
        serialBPA.setText("");
        nombreIBPA.setText("");
        marcaBPA.setText("");
        colorBPA.setText("");
        usuBPA.setText("");
        fechaDBPA.setText("");

    }

    private String usuario, cedula_estudiante = "", serial_i = "";
    private boolean VolverLogin = true, administrador = false;
    private int id_estudiante = 0, id_instrumento = 0, id_usuario = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Base;
    private javax.swing.JPanel BusquedaPresAct;
    private javax.swing.JButton LupaBPA;
    private javax.swing.JTextField apellidoBPA;
    private javax.swing.JTextField cedulaBPA;
    private javax.swing.JTextField colorBPA;
    private javax.swing.JTextField direccionBPA;
    private javax.swing.JTextField fechaDBPA;
    private javax.swing.JTextField fechaEBPA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> letra_cedulaBPA;
    private javax.swing.JButton limpiarBPA;
    private javax.swing.JTextField marcaBPA;
    private javax.swing.JTextField nombreEBPA;
    private javax.swing.JTextField nombreIBPA;
    private javax.swing.JTextField numerotlfBPA;
    private javax.swing.JTextField serialBPA;
    private javax.swing.JTextField usuBPA;
    // End of variables declaration//GEN-END:variables
}
