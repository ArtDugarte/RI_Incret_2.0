package Vistas;

import Modelos.DesplegableMarca;
import Modelos.DesplegableNombre;
import Modelos.Modelo;
import Modelos.OperarInstrumento;
import Modelos.OperarNombreInstrumento;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Instrumento extends javax.swing.JInternalFrame {

    public Instrumento() {

        initComponents();
        cargarCBNombres();
        cargarCBMarcas();
        TextoIDM.setVisible(false);
        TextoIDN.setVisible(false);
        serialRI.setText("");
        colorRI.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Base = new javax.swing.JPanel();
        RegistrarInstru = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        colorRI = new javax.swing.JTextField();
        serialRI = new javax.swing.JTextField();
        limpiarRI = new javax.swing.JButton();
        RegistrarI = new javax.swing.JButton();
        listaRI1 = new javax.swing.JComboBox<>();
        listaRI2 = new javax.swing.JComboBox<>();
        TextoIDM = new javax.swing.JTextField();
        TextoIDN = new javax.swing.JTextField();
        ModificarInstru = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        colorMI = new javax.swing.JTextField();
        serialMI = new javax.swing.JTextField();
        nombreMI = new javax.swing.JTextField();
        marcaMI = new javax.swing.JTextField();
        limpiarMI = new javax.swing.JButton();
        ModificarI = new javax.swing.JButton();
        lupaMI = new javax.swing.JButton();
        BorrarIntru = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        lupaBI = new javax.swing.JButton();
        limpiarBI = new javax.swing.JButton();
        BorrarInstrumento = new javax.swing.JButton();
        colorBI = new javax.swing.JTextField();
        serialBI = new javax.swing.JTextField();
        nombreBI = new javax.swing.JTextField();
        marcaBI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Desplegable1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Instrumento");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/instrumento.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(1024, 700));
        setPreferredSize(new java.awt.Dimension(1024, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Base.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Base.setOpaque(false);
        Base.setLayout(new java.awt.CardLayout());

        RegistrarInstru.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RegistrarInstru.setOpaque(false);
        RegistrarInstru.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel8.setText("Instrumento");
        RegistrarInstru.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 210, -1));

        jLabel44.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel44.setText("Color");
        RegistrarInstru.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 70, -1));

        jLabel45.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel45.setText("Serial");
        RegistrarInstru.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel46.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel46.setText("Nombre");
        RegistrarInstru.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel47.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel47.setText("Marca");
        RegistrarInstru.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 30));

        colorRI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        colorRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorRIActionPerformed(evt);
            }
        });
        colorRI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                colorRIKeyTyped(evt);
            }
        });
        RegistrarInstru.add(colorRI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 230, -1));

        serialRI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RegistrarInstru.add(serialRI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 230, -1));

        limpiarRI.setBackground(new java.awt.Color(103, 0, 0));
        limpiarRI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarRI.setForeground(new java.awt.Color(255, 255, 255));
        limpiarRI.setText("Limpiar");
        limpiarRI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiarRI.setFocusPainted(false);
        limpiarRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarRIActionPerformed(evt);
            }
        });
        RegistrarInstru.add(limpiarRI, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        RegistrarI.setBackground(new java.awt.Color(103, 0, 0));
        RegistrarI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        RegistrarI.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarI.setText("Registrar");
        RegistrarI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistrarI.setFocusPainted(false);
        RegistrarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarIActionPerformed(evt);
            }
        });
        RegistrarInstru.add(RegistrarI, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, -1, -1));

        listaRI1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        listaRI1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaRI1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaRI1ItemStateChanged(evt);
            }
        });
        RegistrarInstru.add(listaRI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 230, -1));

        listaRI2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        listaRI2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaRI2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaRI2ItemStateChanged(evt);
            }
        });
        RegistrarInstru.add(listaRI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 230, -1));

        TextoIDM.setEditable(false);
        RegistrarInstru.add(TextoIDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 10, -1));

        TextoIDN.setEditable(false);
        RegistrarInstru.add(TextoIDN, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 250, 10, 20));

        Base.add(RegistrarInstru, "card7");

        ModificarInstru.setOpaque(false);
        ModificarInstru.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel11.setText("Instrumento");
        ModificarInstru.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel57.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel57.setText("Ingrese el serial del");
        ModificarInstru.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel58.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel58.setText("instrumento a modificar");
        ModificarInstru.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel59.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel59.setText("Nombre");
        ModificarInstru.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        jLabel60.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel60.setText("Marca");
        ModificarInstru.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        jLabel61.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel61.setText("Color");
        ModificarInstru.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        colorMI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ModificarInstru.add(colorMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 210, -1));

        serialMI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ModificarInstru.add(serialMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 280, -1));

        nombreMI.setEditable(false);
        nombreMI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ModificarInstru.add(nombreMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 210, -1));

        marcaMI.setEditable(false);
        marcaMI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ModificarInstru.add(marcaMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 210, -1));

        limpiarMI.setBackground(new java.awt.Color(103, 0, 0));
        limpiarMI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarMI.setForeground(new java.awt.Color(255, 255, 255));
        limpiarMI.setText("Limpiar");
        limpiarMI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiarMI.setFocusPainted(false);
        limpiarMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarMIActionPerformed(evt);
            }
        });
        ModificarInstru.add(limpiarMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        ModificarI.setBackground(new java.awt.Color(103, 0, 0));
        ModificarI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ModificarI.setForeground(new java.awt.Color(255, 255, 255));
        ModificarI.setText("Modificar");
        ModificarI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModificarI.setFocusPainted(false);
        ModificarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarIActionPerformed(evt);
            }
        });
        ModificarInstru.add(ModificarI, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, -1, -1));

        lupaMI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/icono_1.png"))); // NOI18N
        lupaMI.setBorderPainted(false);
        lupaMI.setContentAreaFilled(false);
        lupaMI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lupaMI.setFocusPainted(false);
        lupaMI.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/iconoapa.png"))); // NOI18N
        lupaMI.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/iconoapa.png"))); // NOI18N
        lupaMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupaMIActionPerformed(evt);
            }
        });
        ModificarInstru.add(lupaMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 40, 40));

        Base.add(ModificarInstru, "card10");

        BorrarIntru.setOpaque(false);
        BorrarIntru.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel16.setText("Instrumento");
        BorrarIntru.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel73.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel73.setText("Ingrese el serial del");
        BorrarIntru.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel74.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel74.setText("instrumento a borrar");
        BorrarIntru.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel75.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel75.setText("Nombre");
        BorrarIntru.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        jLabel76.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel76.setText("Marca");
        BorrarIntru.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        jLabel77.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel77.setText("Color");
        BorrarIntru.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        lupaBI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lupaBI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/icono_1.png"))); // NOI18N
        lupaBI.setBorderPainted(false);
        lupaBI.setContentAreaFilled(false);
        lupaBI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lupaBI.setFocusPainted(false);
        lupaBI.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/iconoapa.png"))); // NOI18N
        lupaBI.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/iconoapa.png"))); // NOI18N
        lupaBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupaBIActionPerformed(evt);
            }
        });
        BorrarIntru.add(lupaBI, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 40, 40));

        limpiarBI.setBackground(new java.awt.Color(103, 0, 0));
        limpiarBI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarBI.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBI.setText("Limpiar");
        limpiarBI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiarBI.setFocusPainted(false);
        limpiarBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBIActionPerformed(evt);
            }
        });
        BorrarIntru.add(limpiarBI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        BorrarInstrumento.setBackground(new java.awt.Color(103, 0, 0));
        BorrarInstrumento.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        BorrarInstrumento.setForeground(new java.awt.Color(255, 255, 255));
        BorrarInstrumento.setText("Borrar");
        BorrarInstrumento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BorrarInstrumento.setFocusPainted(false);
        BorrarInstrumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarInstrumentoActionPerformed(evt);
            }
        });
        BorrarIntru.add(BorrarInstrumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, -1, -1));

        colorBI.setEditable(false);
        colorBI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BorrarIntru.add(colorBI, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 240, -1));

        serialBI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BorrarIntru.add(serialBI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 240, -1));

        nombreBI.setEditable(false);
        nombreBI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nombreBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreBIActionPerformed(evt);
            }
        });
        BorrarIntru.add(nombreBI, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 240, -1));

        marcaBI.setEditable(false);
        marcaBI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BorrarIntru.add(marcaBI, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 240, -1));

        Base.add(BorrarIntru, "card15");

        jLayeredPane1.add(Base, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 660, 570));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/1_1.png"))); // NOI18N
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, 0, 1020, 670));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 700, 700));

        jPanel1.setBackground(new java.awt.Color(103, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Desplegable1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Desplegable1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registrar", "Modificar", "Borrar" }));
        Desplegable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Desplegable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Desplegable1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Desplegable1ItemStateChanged(evt);
            }
        });
        jPanel1.add(Desplegable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 300, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione una Operación");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 300, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/Logo_base.png"))); // NOI18N
        jLabel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 670));

        getAccessibleContext().setAccessibleName("Instrumentos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Desplegable1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Desplegable1ItemStateChanged

        JComboBox cb = (JComboBox) evt.getSource();
        if (cb.getSelectedItem().equals("Registrar")) {

            RegistrarInstru.setVisible(true);
            ModificarInstru.setVisible(false);
            BorrarIntru.setVisible(false);
            serialRI.setText("");
            colorRI.setText("");
            cargarCBNombres();
            cargarCBMarcas();
        }
        if (cb.getSelectedItem().equals("Modificar")) {

            RegistrarInstru.setVisible(false);
            ModificarInstru.setVisible(true);
            BorrarIntru.setVisible(false);
            serialMI.setText("");
            nombreMI.setText("");
            marcaMI.setText("");
            colorMI.setText("");
            lupaMI.setEnabled(true);
            serial_i = "";

        }
        if (cb.getSelectedItem().equals("Borrar")) {

            RegistrarInstru.setVisible(false);
            ModificarInstru.setVisible(false);
            BorrarIntru.setVisible(true);
            serialBI.setText("");
            nombreBI.setText("");
            marcaBI.setText("");
            colorBI.setText("");
        }

    }//GEN-LAST:event_Desplegable1ItemStateChanged

    private void colorRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorRIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorRIActionPerformed

    private void colorRIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_colorRIKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isLetter(c)) {

            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_colorRIKeyTyped

    private void limpiarRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarRIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarRI) {
            serialRI.setText("");
            colorRI.setText("");
        }
    }//GEN-LAST:event_limpiarRIActionPerformed

    private void RegistrarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == RegistrarI) {

            if (serialRI.getText().equals("") || colorRI.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Alguno de los Campos está Vacío. \n          Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {

                OperarInstrumento OP = new OperarInstrumento();
                OP.RegistrarInstrumento(Integer.parseInt(TextoIDN.getText()), Integer.parseInt(TextoIDM.getText()), colorRI.getText().toUpperCase(), serialRI.getText().toUpperCase());
            }
        }
    }//GEN-LAST:event_RegistrarIActionPerformed

    private void listaRI1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaRI1ItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {

            TextoIDN.setText(listaN.get(listaRI1.getSelectedIndex()).getId_nombre() + "");
        }
    }//GEN-LAST:event_listaRI1ItemStateChanged

    private void listaRI2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaRI2ItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {

            TextoIDM.setText(listaM.get(listaRI2.getSelectedIndex()).getId_marca() + "");
        }
    }//GEN-LAST:event_listaRI2ItemStateChanged

    private void limpiarMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarMIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarMI) {
            serialMI.setText("");
            nombreMI.setText("");
            marcaMI.setText("");
            colorMI.setText("");
            lupaMI.setEnabled(true);
            serial_i = "";
        }
    }//GEN-LAST:event_limpiarMIActionPerformed

    private void ModificarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == ModificarI) {

            if (serialMI.getText().equals("") || colorMI.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Alguno de los Campos está Vacío. \n          Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                if (!serial_i.equals(serialMI.getText().toUpperCase())) {

                    Modelo Instrumento = new Modelo();
                    Instrumento = null;

                    OperarInstrumento OP = new OperarInstrumento();
                    Instrumento = OP.buscar_instrumento(serialMI.getText().toUpperCase());

                    if (Instrumento == null) {

                        OP = new OperarInstrumento();
                        OP.modificar(serialMI.getText().toUpperCase(), colorMI.getText().toUpperCase(), id_instrumento);
                    } else {
                        JOptionPane.showMessageDialog(null, "Este Serial ya está Registrado \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    OperarInstrumento OP = new OperarInstrumento();
                    OP.modificar(serialMI.getText().toUpperCase(), colorMI.getText().toUpperCase(), id_instrumento);
                }
            }
        }
    }//GEN-LAST:event_ModificarIActionPerformed

    private void lupaMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupaMIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == lupaMI) {

            if (serialMI.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                id_instrumento = 0;
                Modelo Instrumento = new Modelo();
                Instrumento = null;
                OperarInstrumento OP = new OperarInstrumento();
                Instrumento = OP.BuscarInstrumento(serialMI.getText().toUpperCase());

                if (Instrumento != null) {

                    id_instrumento = Instrumento.getid_instru();
                    nombreMI.setText(Instrumento.getNombre_instrumento());
                    marcaMI.setText(Instrumento.getMarca_instrumento());
                    colorMI.setText(Instrumento.getColor());
                    lupaMI.setEnabled(false);
                    serial_i = serialMI.getText().toUpperCase();
                }
            }
        }
    }//GEN-LAST:event_lupaMIActionPerformed

    private void lupaBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupaBIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == lupaBI) {

            if (serialBI.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                Modelo Instrumento = new Modelo();
                Instrumento = null;
                OperarInstrumento OP = new OperarInstrumento();
                Instrumento = OP.BuscarInstrumento(serialBI.getText().toUpperCase());

                if (Instrumento != null) {

                    nombreBI.setText(Instrumento.getNombre_instrumento());
                    marcaBI.setText(Instrumento.getMarca_instrumento());
                    colorBI.setText(Instrumento.getColor());
                }
            }
        }
    }//GEN-LAST:event_lupaBIActionPerformed

    private void limpiarBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarBI) {
            serialBI.setText("");
            nombreBI.setText("");
            marcaBI.setText("");
            colorBI.setText("");
        }
    }//GEN-LAST:event_limpiarBIActionPerformed

    private void BorrarInstrumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarInstrumentoActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == BorrarInstrumento) {

            if (serialBI.getText().equals("") || nombreBI.getText().equals("") || marcaBI.getText().equals("") || colorBI.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Alguno de los Campos está Vacío. \n          Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                OperarInstrumento OP = new OperarInstrumento();
                OP.borrar(serialBI.getText().toUpperCase());
            }
        }
    }//GEN-LAST:event_BorrarInstrumentoActionPerformed

    private void nombreBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreBIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreBIActionPerformed

    public void limpiarjif() {
        
        RegistrarInstru.setVisible(true);
        ModificarInstru.setVisible(false);
        BorrarIntru.setVisible(false);
        serialRI.setText("");
        colorRI.setText("");
        cargarCBNombres();
        cargarCBMarcas();
    }

    public void cargarCBNombres() {

        listaRI1.removeAllItems();
        DesplegableNombre nombres = new DesplegableNombre();
        listaN = nombres.DesplegableNombre();

        if (listaN.size() > 0) {

            for (int i = 0; i < listaN.size(); i++) {

                listaRI1.addItem(listaN.get(i).getNombre_instrumento());
                TextoIDN.setText(listaN.get(i).getId_nombre() + "");
            }

            TextoIDN.setText(listaN.get(0).getId_nombre() + "");
        }
    }

    public void cargarCBMarcas() {

        listaRI2.removeAllItems();
        DesplegableMarca marcas = new DesplegableMarca();
        listaM = marcas.DesplegableMarca();

        if (listaM.size() > 0) {
            for (int i = 0; i < listaM.size(); i++) {

                listaRI2.addItem(listaM.get(i).getMarca_instrumento());
                TextoIDM.setText(listaM.get(i).getId_marca() + "");
            }
            TextoIDM.setText(listaM.get(0).getId_marca() + "");
        }
    }

    ArrayList< Modelos.Modelo> listaN;
    ArrayList< Modelos.Modelo> listaM;
    private String usuario, cedula_estudiante = "", serial_i = "";
    private boolean VolverLogin = true, administrador = false;
    private int id_estudiante = 0, id_instrumento = 0, id_usuario = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Base;
    private javax.swing.JButton BorrarInstrumento;
    private javax.swing.JPanel BorrarIntru;
    private javax.swing.JComboBox<String> Desplegable1;
    private javax.swing.JButton ModificarI;
    private javax.swing.JPanel ModificarInstru;
    private javax.swing.JButton RegistrarI;
    private javax.swing.JPanel RegistrarInstru;
    private javax.swing.JTextField TextoIDM;
    private javax.swing.JTextField TextoIDN;
    private javax.swing.JTextField colorBI;
    private javax.swing.JTextField colorMI;
    private javax.swing.JTextField colorRI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiarBI;
    private javax.swing.JButton limpiarMI;
    private javax.swing.JButton limpiarRI;
    private javax.swing.JComboBox<String> listaRI1;
    private javax.swing.JComboBox<String> listaRI2;
    private javax.swing.JButton lupaBI;
    private javax.swing.JButton lupaMI;
    private javax.swing.JTextField marcaBI;
    private javax.swing.JTextField marcaMI;
    private javax.swing.JTextField nombreBI;
    private javax.swing.JTextField nombreMI;
    private javax.swing.JTextField serialBI;
    private javax.swing.JTextField serialMI;
    private javax.swing.JTextField serialRI;
    // End of variables declaration//GEN-END:variables
}
