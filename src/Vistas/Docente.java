package Vistas;

import Modelos.DesplegableMarca;
import Modelos.DesplegableNombre;
import Modelos.Modelo;
import Modelos.OperarDocente;
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

public class Docente extends javax.swing.JInternalFrame {

    public Docente() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Base = new javax.swing.JPanel();
        RegistrarEstu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        numerotlfE = new javax.swing.JTextField();
        cedulaE = new javax.swing.JTextField();
        nombreE = new javax.swing.JTextField();
        apellidoE = new javax.swing.JTextField();
        DireccionE = new javax.swing.JTextField();
        limpiarE = new javax.swing.JButton();
        registrarE = new javax.swing.JButton();
        letra_cedula = new javax.swing.JComboBox<>();
        num_tlf = new javax.swing.JComboBox<>();
        ModificarEstu = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        numerotlfME = new javax.swing.JTextField();
        cedulaME = new javax.swing.JTextField();
        nombreME = new javax.swing.JTextField();
        apellidoME = new javax.swing.JTextField();
        direccionME = new javax.swing.JTextField();
        lupaME = new javax.swing.JButton();
        limpiarME = new javax.swing.JButton();
        ModificarE = new javax.swing.JButton();
        letra_cedulaME = new javax.swing.JComboBox<>();
        num_tlfME = new javax.swing.JComboBox<>();
        BorrarEstu = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        nombreBE = new javax.swing.JTextField();
        apellidoBE = new javax.swing.JTextField();
        direccionBE = new javax.swing.JTextField();
        numerotlfBE = new javax.swing.JTextField();
        limpiarBE = new javax.swing.JButton();
        BorrarEstudiante = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        cedulaBE = new javax.swing.JTextField();
        letra_cedulaB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Desplegable1 = new javax.swing.JComboBox<>();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Docentes");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/profesor.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(1024, 700));
        setPreferredSize(new java.awt.Dimension(1024, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Base.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Base.setOpaque(false);
        Base.setLayout(new java.awt.CardLayout());

        RegistrarEstu.setOpaque(false);
        RegistrarEstu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel5.setText("Docente");
        RegistrarEstu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 150, -1));

        jLabel37.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel37.setText("N??mero de Tel??fono");
        RegistrarEstu.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        jLabel38.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel38.setText("C??dula del Docente");
        RegistrarEstu.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel39.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel39.setText("Nombre");
        RegistrarEstu.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jLabel40.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel40.setText("Apellido");
        RegistrarEstu.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jLabel41.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel41.setText("Direcci??n");
        RegistrarEstu.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        numerotlfE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        numerotlfE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numerotlfEActionPerformed(evt);
            }
        });
        numerotlfE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numerotlfEKeyTyped(evt);
            }
        });
        RegistrarEstu.add(numerotlfE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 260, -1));

        cedulaE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cedulaE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaEKeyTyped(evt);
            }
        });
        RegistrarEstu.add(cedulaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 260, -1));

        nombreE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RegistrarEstu.add(nombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 260, -1));

        apellidoE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RegistrarEstu.add(apellidoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 260, -1));

        DireccionE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RegistrarEstu.add(DireccionE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 260, -1));

        limpiarE.setBackground(new java.awt.Color(103, 0, 0));
        limpiarE.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarE.setForeground(new java.awt.Color(255, 255, 255));
        limpiarE.setText("Limpiar");
        limpiarE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiarE.setFocusPainted(false);
        limpiarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarEActionPerformed(evt);
            }
        });
        RegistrarEstu.add(limpiarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, -1, -1));

        registrarE.setBackground(new java.awt.Color(103, 0, 0));
        registrarE.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        registrarE.setForeground(new java.awt.Color(255, 255, 255));
        registrarE.setText("Registrar");
        registrarE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarE.setFocusPainted(false);
        registrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEActionPerformed(evt);
            }
        });
        RegistrarEstu.add(registrarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, -1, -1));

        letra_cedula.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        letra_cedula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "E-" }));
        letra_cedula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        letra_cedula.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                letra_cedulaItemStateChanged(evt);
            }
        });
        RegistrarEstu.add(letra_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 50, 28));

        num_tlf.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        num_tlf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0424", "0414", "0412", "0426", "0416", "0251", "0252", "0253" }));
        num_tlf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistrarEstu.add(num_tlf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 70, 28));

        Base.add(RegistrarEstu, "card4");

        ModificarEstu.setOpaque(false);
        ModificarEstu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel10.setText("Docente");
        ModificarEstu.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jLabel51.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel51.setText("N??mero de Tel??fono");
        ModificarEstu.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, -1, -1));

        jLabel53.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel53.setText("Nombre");
        ModificarEstu.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        jLabel54.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel54.setText("Apellido");
        ModificarEstu.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        jLabel55.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel55.setText("Direcci??n");
        ModificarEstu.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        jLabel56.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel56.setText("Ingrese la C??dula del");
        ModificarEstu.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel52.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel52.setText("Docente a Modificar");
        ModificarEstu.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        numerotlfME.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        numerotlfME.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numerotlfMEKeyTyped(evt);
            }
        });
        ModificarEstu.add(numerotlfME, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 240, 30));

        cedulaME.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cedulaME.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaMEKeyTyped(evt);
            }
        });
        ModificarEstu.add(cedulaME, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 260, -1));

        nombreME.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ModificarEstu.add(nombreME, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 240, 30));

        apellidoME.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ModificarEstu.add(apellidoME, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 240, 30));

        direccionME.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ModificarEstu.add(direccionME, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 240, 30));

        lupaME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/icono_1.png"))); // NOI18N
        lupaME.setBorderPainted(false);
        lupaME.setContentAreaFilled(false);
        lupaME.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lupaME.setFocusPainted(false);
        lupaME.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/iconoapa.png"))); // NOI18N
        lupaME.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/iconoapa.png"))); // NOI18N
        lupaME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupaMEActionPerformed(evt);
            }
        });
        ModificarEstu.add(lupaME, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 40, 40));

        limpiarME.setBackground(new java.awt.Color(103, 0, 0));
        limpiarME.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarME.setForeground(new java.awt.Color(255, 255, 255));
        limpiarME.setText("Limpiar");
        limpiarME.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiarME.setFocusPainted(false);
        limpiarME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarMEActionPerformed(evt);
            }
        });
        ModificarEstu.add(limpiarME, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        ModificarE.setBackground(new java.awt.Color(103, 0, 0));
        ModificarE.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ModificarE.setForeground(new java.awt.Color(255, 255, 255));
        ModificarE.setText("Modificar");
        ModificarE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModificarE.setFocusPainted(false);
        ModificarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarEActionPerformed(evt);
            }
        });
        ModificarEstu.add(ModificarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, -1, -1));

        letra_cedulaME.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        letra_cedulaME.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "E-" }));
        letra_cedulaME.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        letra_cedulaME.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                letra_cedulaMEItemStateChanged(evt);
            }
        });
        ModificarEstu.add(letra_cedulaME, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 28));

        num_tlfME.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        num_tlfME.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0424", "0414", "0412", "0426", "0416", "0251", "0252", "0253" }));
        num_tlfME.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModificarEstu.add(num_tlfME, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 440, 70, -1));

        Base.add(ModificarEstu, "card9");

        BorrarEstu.setOpaque(false);
        BorrarEstu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel13.setText("Docente");
        BorrarEstu.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel65.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel65.setText("Ingrese la C??dula del");
        BorrarEstu.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel66.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel66.setText("Docente a borrar");
        BorrarEstu.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel67.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel67.setText("Nombre");
        BorrarEstu.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        jLabel68.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel68.setText("Apellido");
        BorrarEstu.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        jLabel69.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel69.setText("Direcci??n");
        BorrarEstu.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        jLabel70.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel70.setText("N??mero Telef??nico");
        BorrarEstu.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, -1));

        nombreBE.setEditable(false);
        nombreBE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BorrarEstu.add(nombreBE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 220, -1));

        apellidoBE.setEditable(false);
        apellidoBE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BorrarEstu.add(apellidoBE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 220, -1));

        direccionBE.setEditable(false);
        direccionBE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BorrarEstu.add(direccionBE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 220, -1));

        numerotlfBE.setEditable(false);
        numerotlfBE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BorrarEstu.add(numerotlfBE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 220, -1));

        limpiarBE.setBackground(new java.awt.Color(103, 0, 0));
        limpiarBE.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarBE.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBE.setText("Limpiar");
        limpiarBE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiarBE.setFocusPainted(false);
        limpiarBE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBEActionPerformed(evt);
            }
        });
        BorrarEstu.add(limpiarBE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        BorrarEstudiante.setBackground(new java.awt.Color(103, 0, 0));
        BorrarEstudiante.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        BorrarEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        BorrarEstudiante.setText("Borrar");
        BorrarEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BorrarEstudiante.setFocusPainted(false);
        BorrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarEstudianteActionPerformed(evt);
            }
        });
        BorrarEstu.add(BorrarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, -1, -1));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/icono_1.png"))); // NOI18N
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setFocusPainted(false);
        jButton10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/iconoapa.png"))); // NOI18N
        jButton10.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/iconoapa.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        BorrarEstu.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 40, 40));

        cedulaBE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cedulaBE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaBEKeyTyped(evt);
            }
        });
        BorrarEstu.add(cedulaBE, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 240, -1));

        letra_cedulaB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        letra_cedulaB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "E-" }));
        letra_cedulaB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        letra_cedulaB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                letra_cedulaBItemStateChanged(evt);
            }
        });
        BorrarEstu.add(letra_cedulaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 50, 28));

        Base.add(BorrarEstu, "card12");

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
        jLabel2.setText("Seleccione una Operaci??n");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 300, -1));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numerotlfEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numerotlfEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numerotlfEActionPerformed

    private void numerotlfEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numerotlfEKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {

            getToolkit().beep();
            evt.consume();
        }

        if (numerotlfE.getText().length() > 6) {

            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_numerotlfEKeyTyped

    private void cedulaEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaEKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {

            getToolkit().beep();
            evt.consume();
        }
        if (letra_cedula.getSelectedItem().equals("M-")) {

            if (cedulaE.getText().length() > 8) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        } else {
            if (cedulaE.getText().length() > 7) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }//GEN-LAST:event_cedulaEKeyTyped

    private void limpiarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarEActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarE) {
            nombreE.setText("");
            apellidoE.setText("");
            cedulaE.setText("");
            numerotlfE.setText("");
            DireccionE.setText("");

        }
    }//GEN-LAST:event_limpiarEActionPerformed

    private void registrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == registrarE) {

            if (nombreE.getText().equals("") || apellidoE.getText().equals("") || cedulaE.getText().equals("") || numerotlfE.getText().equals("") || DireccionE.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Alguno de los Campos est?? Vac??o. \n          Intente Nuevamente...", "??ERROR!", JOptionPane.ERROR_MESSAGE);
            } else if (cedulaE.getText().length() < 7 || numerotlfE.getText().length() < 7) {

                JOptionPane.showMessageDialog(null, "Faltan D??gitos en la C??dula o Tel??fono. \n            Intente Nuevamente...", "??ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {

                OperarDocente OP = new OperarDocente();
                OperarUsuario OP2 = new OperarUsuario();
                OP2.RegistrarUsuario(cedulaE.getText(), cedulaE.getText(), 2);
                OP.RegistrarDocente(nombreE.getText().toUpperCase(), apellidoE.getText().toUpperCase(), letra_cedula.getSelectedItem() + "" + cedulaE.getText(), num_tlf.getSelectedItem() + "" + numerotlfE.getText(), DireccionE.getText().toUpperCase(), OP2.ultimo_id());
            }
        }
    }//GEN-LAST:event_registrarEActionPerformed

    private void letra_cedulaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_letra_cedulaItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {

            cedulaE.setText("");
        }
    }//GEN-LAST:event_letra_cedulaItemStateChanged

    private void numerotlfMEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numerotlfMEKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {

            getToolkit().beep();
            evt.consume();
        }

        if (numerotlfME.getText().length() > 6) {

            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_numerotlfMEKeyTyped

    private void cedulaMEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaMEKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {

            getToolkit().beep();
            evt.consume();
        }
        if (letra_cedulaME.getSelectedItem().equals("M-")) {

            if (cedulaME.getText().length() > 8) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        } else {
            if (cedulaME.getText().length() > 7) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }//GEN-LAST:event_cedulaMEKeyTyped

    private void lupaMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupaMEActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == lupaME) {

            if (cedulaME.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "     El Campo est?? Vac??o. \n      Intente Nuevamente...", "??ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {

                id_docente = 0;
                Modelo Docente = new Modelo();
                Docente = null;
                OperarDocente OP = new OperarDocente();
                Docente = OP.BuscarDocente(letra_cedulaME.getSelectedItem() + "" + cedulaME.getText());

                if (Docente != null) {

                    id_docente = Docente.getId_docente();
                    nombreME.setText(Docente.getNombre());
                    apellidoME.setText(Docente.getApellido());
                    num_tlfME.setSelectedItem(Docente.getNumTlf().substring(0, 4));
                    numerotlfME.setText(Docente.getNumTlf().substring(4));
                    direccionME.setText(Docente.getDirec());
                    cedula_Docente = letra_cedulaME.getSelectedItem() + "" + cedulaME.getText();
                    lupaME.setEnabled(false);
                }
            }
        }
    }//GEN-LAST:event_lupaMEActionPerformed

    private void limpiarMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarMEActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarME) {
            cedulaME.setText("");
            nombreME.setText("");
            apellidoME.setText("");
            direccionME.setText("");
            numerotlfME.setText("");
            lupaME.setEnabled(true);
            cedula_Docente = "";
        }
    }//GEN-LAST:event_limpiarMEActionPerformed

    private void ModificarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarEActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == ModificarE) {

            Modelo Docente = new Modelo();
            Docente = null;

            if (nombreME.getText().equals("") || apellidoME.getText().equals("") || cedulaME.getText().equals("") || direccionME.getText().equals("") || numerotlfME.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Alguno de los Campos est?? Vac??o. \n          Intente Nuevamente...", "??ERROR!", JOptionPane.ERROR_MESSAGE);
            } else if (cedulaME.getText().length() < 7 || numerotlfME.getText().length() < 7) {

                JOptionPane.showMessageDialog(null, "Faltan D??gitos en la C??dula o Tel??fono. \n            Intente Nuevamente...", "??ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                if (!cedula_Docente.equals(letra_cedulaME.getSelectedItem() + "" + cedulaME.getText())) {

                    OperarDocente OP = new OperarDocente();
                    Docente = OP.buscar_docente(letra_cedulaME.getSelectedItem() + "" + cedulaME.getText());

                    if (Docente == null) {

                        OP = new OperarDocente();
                        OP.modificar(nombreME.getText().toUpperCase(), apellidoME.getText().toUpperCase(), letra_cedulaME.getSelectedItem() + "" + cedulaME.getText(), direccionME.getText().toUpperCase(), num_tlfME.getSelectedItem() + "" + numerotlfME.getText(), id_docente);
                    } else {
                        JOptionPane.showMessageDialog(null, "Esta C??dula ya est?? Registrada \n          Intente Nuevamente...", "??ERROR!", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    OperarDocente OP = new OperarDocente();
                    OP.modificar(nombreME.getText().toUpperCase(), apellidoME.getText().toUpperCase(), letra_cedulaME.getSelectedItem() + "" + cedulaME.getText(), direccionME.getText().toUpperCase(), num_tlfME.getSelectedItem() + "" + numerotlfME.getText(), id_docente);
                }
            }
        }
    }//GEN-LAST:event_ModificarEActionPerformed

    private void letra_cedulaMEItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_letra_cedulaMEItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            cedulaME.setText("");
        }
    }//GEN-LAST:event_letra_cedulaMEItemStateChanged

    private void limpiarBEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBEActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarBE) {
            cedulaBE.setText("");
            nombreBE.setText("");
            apellidoBE.setText("");
            direccionBE.setText("");
            numerotlfBE.setText("");
        }
    }//GEN-LAST:event_limpiarBEActionPerformed

    private void BorrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarEstudianteActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == BorrarEstudiante) {

            if (cedulaBE.getText().equals("") || nombreBE.getText().equals("") || apellidoBE.getText().equals("") || direccionBE.getText().equals("") || numerotlfBE.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Alguno de los Campos est?? Vac??o. \n          Intente Nuevamente...", "??ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                OperarDocente OP = new OperarDocente();
                OP.borrar(letra_cedulaB.getSelectedItem() + "" + cedulaBE.getText());
            }
        }
    }//GEN-LAST:event_BorrarEstudianteActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == jButton10) {

            if (cedulaBE.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "     El Campo est?? Vac??o. \n      Intente Nuevamente...", "??ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                Modelo Docente = new Modelo();
                Docente = null;
                OperarDocente OP = new OperarDocente();
                Docente = OP.BuscarDocente(letra_cedulaB.getSelectedItem() + "" + cedulaBE.getText());

                if (Docente != null) {

                    nombreBE.setText(Docente.getNombre());
                    apellidoBE.setText(Docente.getApellido());
                    numerotlfBE.setText(Docente.getNumTlf());
                    direccionBE.setText(Docente.getDirec());
                }
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void cedulaBEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaBEKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {

            getToolkit().beep();
            evt.consume();
        }
        if (letra_cedulaB.getSelectedItem().equals("M-")) {

            if (cedulaBE.getText().length() > 8) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        } else {
            if (cedulaBE.getText().length() > 7) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }//GEN-LAST:event_cedulaBEKeyTyped

    private void letra_cedulaBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_letra_cedulaBItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            cedulaBE.setText("");
        }
    }//GEN-LAST:event_letra_cedulaBItemStateChanged

    private void Desplegable1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Desplegable1ItemStateChanged

        JComboBox cb = (JComboBox) evt.getSource();
        if (cb.getSelectedItem().equals("Registrar")) {
            
            RegistrarEstu.setVisible(true);
            ModificarEstu.setVisible(false);
            BorrarEstu.setVisible(false);
            nombreE.setText("");
            apellidoE.setText("");
            cedulaE.setText("");
            numerotlfE.setText("");
            DireccionE.setText("");
            
        }
        if (cb.getSelectedItem().equals("Modificar")) {
            
            RegistrarEstu.setVisible(false);
            ModificarEstu.setVisible(true);
            BorrarEstu.setVisible(false);
            cedulaME.setText("");
            nombreME.setText("");
            apellidoME.setText("");
            direccionME.setText("");
            numerotlfME.setText("");
            lupaME.setEnabled(true);
            cedula_Docente = "";
            
        }
        if (cb.getSelectedItem().equals("Borrar")) {
            
            RegistrarEstu.setVisible(false);
            ModificarEstu.setVisible(false);
            BorrarEstu.setVisible(true);
            cedulaBE.setText("");
            nombreBE.setText("");
            apellidoBE.setText("");
            direccionBE.setText("");
            numerotlfBE.setText("");
            
        }
    }//GEN-LAST:event_Desplegable1ItemStateChanged

    public void limpiarjif() {

        cedulaBE.setText("");
        nombreBE.setText("");
        apellidoBE.setText("");
        direccionBE.setText("");
        numerotlfBE.setText("");
        cedulaME.setText("");
        nombreME.setText("");
        apellidoME.setText("");
        direccionME.setText("");
        numerotlfME.setText("");
        lupaME.setEnabled(true);
        cedula_Docente = "";
        nombreE.setText("");
        apellidoE.setText("");
        cedulaE.setText("");
        numerotlfE.setText("");
        DireccionE.setText("");
        Desplegable1.setSelectedItem("Registrar");
    }

    private String usuario, cedula_Docente = "", serial_i = "";
    private boolean VolverLogin = true, administrador = false;
    private int id_docente = 0, id_instrumento = 0, id_usuario = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Base;
    private javax.swing.JPanel BorrarEstu;
    private javax.swing.JButton BorrarEstudiante;
    private javax.swing.JComboBox<String> Desplegable1;
    private javax.swing.JTextField DireccionE;
    private javax.swing.JButton ModificarE;
    private javax.swing.JPanel ModificarEstu;
    private javax.swing.JPanel RegistrarEstu;
    private javax.swing.JTextField apellidoBE;
    private javax.swing.JTextField apellidoE;
    private javax.swing.JTextField apellidoME;
    private javax.swing.JTextField cedulaBE;
    private javax.swing.JTextField cedulaE;
    private javax.swing.JTextField cedulaME;
    private javax.swing.JTextField direccionBE;
    private javax.swing.JTextField direccionME;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> letra_cedula;
    private javax.swing.JComboBox<String> letra_cedulaB;
    private javax.swing.JComboBox<String> letra_cedulaME;
    private javax.swing.JButton limpiarBE;
    private javax.swing.JButton limpiarE;
    private javax.swing.JButton limpiarME;
    private javax.swing.JButton lupaME;
    private javax.swing.JTextField nombreBE;
    private javax.swing.JTextField nombreE;
    private javax.swing.JTextField nombreME;
    private javax.swing.JComboBox<String> num_tlf;
    private javax.swing.JComboBox<String> num_tlfME;
    private javax.swing.JTextField numerotlfBE;
    private javax.swing.JTextField numerotlfE;
    private javax.swing.JTextField numerotlfME;
    private javax.swing.JButton registrarE;
    // End of variables declaration//GEN-END:variables
}
