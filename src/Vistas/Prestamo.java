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

public class Prestamo extends javax.swing.JInternalFrame {

    public Prestamo() {

        initComponents();
        fechaEP.setText(DameFecha());
        calendario.setMinSelectableDate(new Date());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Base = new javax.swing.JPanel();
        PanelPrestamo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        serial = new javax.swing.JTextField();
        nombreinstru = new javax.swing.JTextField();
        marcainstru = new javax.swing.JTextField();
        Limpiar = new javax.swing.JButton();
        RegistrarP = new javax.swing.JButton();
        cedula = new javax.swing.JTextField();
        nombreestu = new javax.swing.JTextField();
        apellidoestu = new javax.swing.JTextField();
        fechaEP = new javax.swing.JTextField();
        lupa1 = new javax.swing.JButton();
        lupa2 = new javax.swing.JButton();
        calendario = new com.toedter.calendar.JDateChooser();
        letra_cedulaP = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Préstamos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/prestamo.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(1024, 700));
        setPreferredSize(new java.awt.Dimension(1024, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Base.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Base.setOpaque(false);
        Base.setLayout(new java.awt.CardLayout());

        PanelPrestamo.setOpaque(false);
        PanelPrestamo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setText("Préstamo");
        PanelPrestamo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 180, -1));

        jLabel28.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel28.setText("Fecha de Devolución");
        PanelPrestamo.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        jLabel29.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel29.setText("Cédula del Estudiante");
        PanelPrestamo.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel30.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel30.setText("Nombre");
        PanelPrestamo.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel31.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel31.setText("Apellido");
        PanelPrestamo.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel32.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel32.setText("Fecha de Entrega");
        PanelPrestamo.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabel33.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel33.setText("Serial del Intrumento");
        PanelPrestamo.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jLabel34.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel34.setText("Nombre del Intrumento");
        PanelPrestamo.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        jLabel35.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel35.setText("Marca del Intrumento");
        PanelPrestamo.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        serial.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelPrestamo.add(serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 250, -1));

        nombreinstru.setEditable(false);
        nombreinstru.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelPrestamo.add(nombreinstru, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 250, -1));

        marcainstru.setEditable(false);
        marcainstru.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelPrestamo.add(marcainstru, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 250, -1));

        Limpiar.setBackground(new java.awt.Color(103, 0, 0));
        Limpiar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Limpiar.setForeground(new java.awt.Color(255, 255, 255));
        Limpiar.setText("Limpiar");
        Limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Limpiar.setFocusPainted(false);
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        PanelPrestamo.add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        RegistrarP.setBackground(new java.awt.Color(103, 0, 0));
        RegistrarP.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        RegistrarP.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarP.setText("Registar");
        RegistrarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistrarP.setFocusPainted(false);
        RegistrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarPActionPerformed(evt);
            }
        });
        PanelPrestamo.add(RegistrarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, -1, -1));

        cedula.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });
        PanelPrestamo.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 250, -1));

        nombreestu.setEditable(false);
        nombreestu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelPrestamo.add(nombreestu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 250, -1));

        apellidoestu.setEditable(false);
        apellidoestu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelPrestamo.add(apellidoestu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 250, -1));

        fechaEP.setEditable(false);
        fechaEP.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelPrestamo.add(fechaEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 250, -1));

        lupa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/icono_1.png"))); // NOI18N
        lupa1.setBorderPainted(false);
        lupa1.setContentAreaFilled(false);
        lupa1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lupa1.setFocusPainted(false);
        lupa1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/iconoapa.png"))); // NOI18N
        lupa1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/iconoapa.png"))); // NOI18N
        lupa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupa1ActionPerformed(evt);
            }
        });
        PanelPrestamo.add(lupa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 40, -1));

        lupa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/icono_1.png"))); // NOI18N
        lupa2.setBorderPainted(false);
        lupa2.setContentAreaFilled(false);
        lupa2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lupa2.setFocusPainted(false);
        lupa2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/iconoapa.png"))); // NOI18N
        lupa2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/iconoapa.png"))); // NOI18N
        lupa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupa2ActionPerformed(evt);
            }
        });
        PanelPrestamo.add(lupa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 40, 40));

        calendario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelPrestamo.add(calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 250, 30));

        letra_cedulaP.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        letra_cedulaP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "E-" }));
        letra_cedulaP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        letra_cedulaP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                letra_cedulaPItemStateChanged(evt);
            }
        });
        PanelPrestamo.add(letra_cedulaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 150, 50, 28));

        Base.add(PanelPrestamo, "card2");

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

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == Limpiar) {
            nombreestu.setText("");
            nombreinstru.setText("");
            cedula.setText("");
            serial.setText("");
            marcainstru.setText("");
            apellidoestu.setText("");
        }
    }//GEN-LAST:event_LimpiarActionPerformed

    private void RegistrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarPActionPerformed

        JButton bt = (JButton) evt.getSource();

        String fecha_devolucion;

        if (bt == RegistrarP) {

            if (cedula.getText().equals("") || serial.getText().equals("") || calendario.getDate() == null) {

                JOptionPane.showMessageDialog(null, "Alguno de los Campos está Vacío. \n          Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                fecha_devolucion = sdf.format(calendario.getDate());

                OperarPrestamo OP = new OperarPrestamo();
                OP.RegistrarPrestamo(id_usuario, id_estudiante, id_instrumento, fecha_devolucion);
            }
        }
    }//GEN-LAST:event_RegistrarPActionPerformed

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {

            getToolkit().beep();
            evt.consume();
        }
        if (letra_cedulaP.getSelectedItem().equals("M-")) {

            if (cedula.getText().length() > 8) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        } else {
            if (cedula.getText().length() > 7) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }//GEN-LAST:event_cedulaKeyTyped

    private void lupa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupa1ActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == lupa1) {

            if (cedula.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                id_estudiante = 0;
                Modelo Estudiante = new Modelo();
                Estudiante = null;
                OperarEstudiante OP = new OperarEstudiante();
                Estudiante = OP.buscar_estudiante(letra_cedulaP.getSelectedItem() + "" + cedula.getText());

                if (Estudiante != null) {

                    if (Estudiante.isTiene_instru() == true) {

                        JOptionPane.showMessageDialog(null, "Este Estudiante ya tiene un Instrumento Asignado. \n                     Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                    } else {
                        id_estudiante = Estudiante.getid_estudiante();
                        nombreestu.setText(Estudiante.getNombre().toUpperCase());
                        apellidoestu.setText(Estudiante.getApellido().toUpperCase());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Este Estudiante no se encuentra Registrado. \n                 Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_lupa1ActionPerformed

    private void lupa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupa2ActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == lupa2) {

            if (serial.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                id_instrumento = 0;
                Modelo Instrumento = new Modelo();
                Instrumento = null;
                OperarInstrumento OP = new OperarInstrumento();
                Instrumento = OP.buscar_instrumento(serial.getText().toUpperCase());

                if (Instrumento != null) {

                    if (Instrumento.isDisponible() == false) {
                        JOptionPane.showMessageDialog(null, "Este Instrumento ya se encuentra Asignado. \n                   Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                    } else {
                        id_instrumento = Instrumento.getid_instru();
                        nombreinstru.setText(Instrumento.getNombre_instrumento().toUpperCase());
                        marcainstru.setText(Instrumento.getMarca_instrumento().toUpperCase());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Este Instrumento no se encuentra Registrado. \n               Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_lupa2ActionPerformed

    private void letra_cedulaPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_letra_cedulaPItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            cedula.setText("");
        }
    }//GEN-LAST:event_letra_cedulaPItemStateChanged

    public void limpiarjif() {

        nombreestu.setText("");
        nombreinstru.setText("");
        cedula.setText("");
        serial.setText("");
        marcainstru.setText("");
        apellidoestu.setText("");
    }
    
    public String DameFecha() {

        String pattern = "dd/MM/yyyy";

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        String t = sdf.format(new Date());
        return t;
    }

    public void setid_usuario(int id_usuario) {

        this.id_usuario = id_usuario;
    }
    
    private String usuario, cedula_estudiante = "", serial_i = "";
    private boolean VolverLogin = true, administrador = false;
    private int id_estudiante = 0, id_instrumento = 0, id_usuario = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Base;
    private javax.swing.JButton Limpiar;
    private javax.swing.JPanel PanelPrestamo;
    private javax.swing.JButton RegistrarP;
    private javax.swing.JTextField apellidoestu;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField fechaEP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> letra_cedulaP;
    private javax.swing.JButton lupa1;
    private javax.swing.JButton lupa2;
    private javax.swing.JTextField marcainstru;
    private javax.swing.JTextField nombreestu;
    private javax.swing.JTextField nombreinstru;
    private javax.swing.JTextField serial;
    // End of variables declaration//GEN-END:variables
}
