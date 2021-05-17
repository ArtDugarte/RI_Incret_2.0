package Vistas;

import Modelos.DesplegableDocentes;
import Modelos.DesplegableMarca;
import Modelos.DesplegableNombre;
import Modelos.Modelo;
import Modelos.OperarEstudiante;
import Modelos.OperarInstrumento;
import Modelos.OperarNombreInstrumento;
import Modelos.OperarPrestamo;
import Modelos.OperarProgreso;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.Query.gt;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.Query.gt;

public class Progreso extends javax.swing.JInternalFrame implements Printable {

    public Progreso() {

        initComponents();
        ExelenteRP.setVisible(false);
        Muy_BuenoRP.setVisible(false);
        BuenoRP.setVisible(true);
        RegularRP.setVisible(true);
        deficienteRP.setVisible(true);
        Excelente.setVisible(false);
        Muy_Bueno.setVisible(false);
        Bueno.setVisible(true);
        Regular.setVisible(false);
        Deficiente.setVisible(false);
        Logo.setVisible(false);
        ImprimirVP.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        Base = new javax.swing.JPanel();
        Registrar_progre = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        limpiarRP = new javax.swing.JButton();
        RegistrarRP = new javax.swing.JButton();
        LupaRP = new javax.swing.JButton();
        cedulaRP = new javax.swing.JTextField();
        letra_cedulaRP = new javax.swing.JComboBox<>();
        ExelenteRP = new javax.swing.JLabel();
        deficienteRP = new javax.swing.JLabel();
        RegularRP = new javax.swing.JLabel();
        BuenoRP = new javax.swing.JLabel();
        Muy_BuenoRP = new javax.swing.JLabel();
        deficiente = new javax.swing.JRadioButton();
        exelente = new javax.swing.JRadioButton();
        muy_bueno = new javax.swing.JRadioButton();
        bueno = new javax.swing.JRadioButton();
        regular = new javax.swing.JRadioButton();
        Deficiente = new javax.swing.JLabel();
        Regular = new javax.swing.JLabel();
        Bueno = new javax.swing.JLabel();
        Muy_Bueno = new javax.swing.JLabel();
        Excelente = new javax.swing.JLabel();
        Visualizar_progre = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        cedulaVP = new javax.swing.JTextField();
        lupaVP = new javax.swing.JButton();
        limpiarVP = new javax.swing.JButton();
        ImprimirVP = new javax.swing.JButton();
        letra_cedulaVP = new javax.swing.JComboBox<>();
        barra = new javax.swing.JPanel();
        C3 = new javax.swing.JLabel();
        flecha1 = new javax.swing.JLabel();
        C5 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        C4 = new javax.swing.JLabel();
        flecha5 = new javax.swing.JLabel();
        flecha4 = new javax.swing.JLabel();
        flecha3 = new javax.swing.JLabel();
        flecha2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Desplegable1 = new javax.swing.JComboBox<>();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Estudiantes");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/progreso.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(1024, 700));
        setPreferredSize(new java.awt.Dimension(1024, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Base.setBackground(new java.awt.Color(255, 255, 255));
        Base.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Base.setOpaque(false);
        Base.setLayout(new java.awt.CardLayout());

        Registrar_progre.setOpaque(false);
        Registrar_progre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel13.setText("Progreso");
        Registrar_progre.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel65.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel65.setText("Ingrese la Cédula del");
        Registrar_progre.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabel66.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel66.setText("Estudiante a regristrar");
        Registrar_progre.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        limpiarRP.setBackground(new java.awt.Color(103, 0, 0));
        limpiarRP.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarRP.setForeground(new java.awt.Color(255, 255, 255));
        limpiarRP.setText("Limpiar");
        limpiarRP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiarRP.setFocusPainted(false);
        limpiarRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarRPActionPerformed(evt);
            }
        });
        Registrar_progre.add(limpiarRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, -1, -1));

        RegistrarRP.setBackground(new java.awt.Color(103, 0, 0));
        RegistrarRP.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        RegistrarRP.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarRP.setText("Registrar");
        RegistrarRP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistrarRP.setFocusPainted(false);
        RegistrarRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarRPActionPerformed(evt);
            }
        });
        Registrar_progre.add(RegistrarRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, -1, -1));

        LupaRP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/icono_1.png"))); // NOI18N
        LupaRP.setBorderPainted(false);
        LupaRP.setContentAreaFilled(false);
        LupaRP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LupaRP.setFocusPainted(false);
        LupaRP.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/iconoapa.png"))); // NOI18N
        LupaRP.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/iconoapa.png"))); // NOI18N
        LupaRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LupaRPActionPerformed(evt);
            }
        });
        Registrar_progre.add(LupaRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 40, 40));

        cedulaRP.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cedulaRP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaRPKeyTyped(evt);
            }
        });
        Registrar_progre.add(cedulaRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 240, -1));

        letra_cedulaRP.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        letra_cedulaRP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "E-" }));
        letra_cedulaRP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        letra_cedulaRP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                letra_cedulaRPItemStateChanged(evt);
            }
        });
        Registrar_progre.add(letra_cedulaRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 50, 28));

        ExelenteRP.setBackground(new java.awt.Color(204, 255, 153));
        ExelenteRP.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        ExelenteRP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExelenteRP.setText("Excelente");
        ExelenteRP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ExelenteRP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ExelenteRP.setOpaque(true);
        Registrar_progre.add(ExelenteRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 190, 70));

        deficienteRP.setBackground(new java.awt.Color(255, 102, 102));
        deficienteRP.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        deficienteRP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deficienteRP.setText("Deficiente");
        deficienteRP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deficienteRP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deficienteRP.setOpaque(true);
        Registrar_progre.add(deficienteRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 270, 70));

        RegularRP.setBackground(new java.awt.Color(255, 204, 102));
        RegularRP.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        RegularRP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegularRP.setText("Regular");
        RegularRP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RegularRP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RegularRP.setOpaque(true);
        Registrar_progre.add(RegularRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 250, 70));

        BuenoRP.setBackground(new java.awt.Color(153, 204, 255));
        BuenoRP.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        BuenoRP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BuenoRP.setText("Bueno");
        BuenoRP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BuenoRP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BuenoRP.setOpaque(true);
        Registrar_progre.add(BuenoRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 230, 70));

        Muy_BuenoRP.setBackground(new java.awt.Color(255, 255, 153));
        Muy_BuenoRP.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Muy_BuenoRP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Muy_BuenoRP.setText("Muy Bueno");
        Muy_BuenoRP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Muy_BuenoRP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Muy_BuenoRP.setOpaque(true);
        Registrar_progre.add(Muy_BuenoRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 210, 70));

        buttonGroup1.add(deficiente);
        deficiente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        deficiente.setText("Deficiente");
        deficiente.setContentAreaFilled(false);
        deficiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deficiente.setFocusPainted(false);
        deficiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deficienteActionPerformed(evt);
            }
        });
        Registrar_progre.add(deficiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        buttonGroup1.add(exelente);
        exelente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        exelente.setText("Excelente");
        exelente.setContentAreaFilled(false);
        exelente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exelente.setFocusPainted(false);
        exelente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exelenteActionPerformed(evt);
            }
        });
        Registrar_progre.add(exelente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        buttonGroup1.add(muy_bueno);
        muy_bueno.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        muy_bueno.setText("Muy Bueno");
        muy_bueno.setContentAreaFilled(false);
        muy_bueno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        muy_bueno.setFocusPainted(false);
        muy_bueno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muy_buenoActionPerformed(evt);
            }
        });
        Registrar_progre.add(muy_bueno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        buttonGroup1.add(bueno);
        bueno.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bueno.setSelected(true);
        bueno.setText("Bueno");
        bueno.setContentAreaFilled(false);
        bueno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bueno.setFocusPainted(false);
        bueno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buenoActionPerformed(evt);
            }
        });
        Registrar_progre.add(bueno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        buttonGroup1.add(regular);
        regular.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        regular.setText("Regular");
        regular.setContentAreaFilled(false);
        regular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regular.setFocusPainted(false);
        regular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regularActionPerformed(evt);
            }
        });
        Registrar_progre.add(regular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        Deficiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/deficiente.png"))); // NOI18N
        Registrar_progre.add(Deficiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        Regular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/regular.png"))); // NOI18N
        Registrar_progre.add(Regular, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));

        Bueno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/bueno.png"))); // NOI18N
        Registrar_progre.add(Bueno, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        Muy_Bueno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/Muy Bueno.png"))); // NOI18N
        Registrar_progre.add(Muy_Bueno, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, 70));

        Excelente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/Excelente.png"))); // NOI18N
        Registrar_progre.add(Excelente, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

        Base.add(Registrar_progre, "card12");

        Visualizar_progre.setBackground(new java.awt.Color(204, 204, 204));
        Visualizar_progre.setOpaque(false);
        Visualizar_progre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel10.setText("Estudiante");
        Visualizar_progre.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        jLabel56.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel56.setText("Ingrese la Cédula del");
        Visualizar_progre.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        jLabel52.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel52.setText("Estudiante a Visualizar");
        Visualizar_progre.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        cedulaVP.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cedulaVP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaVPKeyTyped(evt);
            }
        });
        Visualizar_progre.add(cedulaVP, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 260, -1));

        lupaVP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/icono_1.png"))); // NOI18N
        lupaVP.setBorderPainted(false);
        lupaVP.setContentAreaFilled(false);
        lupaVP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lupaVP.setFocusPainted(false);
        lupaVP.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/iconoapa.png"))); // NOI18N
        lupaVP.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/iconoapa.png"))); // NOI18N
        lupaVP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupaVPActionPerformed(evt);
            }
        });
        Visualizar_progre.add(lupaVP, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 40, 40));

        limpiarVP.setBackground(new java.awt.Color(103, 0, 0));
        limpiarVP.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarVP.setForeground(new java.awt.Color(255, 255, 255));
        limpiarVP.setText("Limpiar");
        limpiarVP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiarVP.setFocusPainted(false);
        limpiarVP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarVPActionPerformed(evt);
            }
        });
        Visualizar_progre.add(limpiarVP, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, -1, -1));

        ImprimirVP.setBackground(new java.awt.Color(103, 0, 0));
        ImprimirVP.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ImprimirVP.setForeground(new java.awt.Color(255, 255, 255));
        ImprimirVP.setText("Imprimir");
        ImprimirVP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImprimirVP.setFocusPainted(false);
        ImprimirVP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirVPActionPerformed(evt);
            }
        });
        Visualizar_progre.add(ImprimirVP, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, -1, -1));

        letra_cedulaVP.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        letra_cedulaVP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "E-" }));
        letra_cedulaVP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        letra_cedulaVP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                letra_cedulaVPItemStateChanged(evt);
            }
        });
        Visualizar_progre.add(letra_cedulaVP, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 50, 28));

        barra.setBackground(new java.awt.Color(0, 0, 0));
        Visualizar_progre.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 10, 420));

        C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris3.png"))); // NOI18N
        Visualizar_progre.add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 60, -1));

        flecha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png"))); // NOI18N
        Visualizar_progre.add(flecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris5.png"))); // NOI18N
        Visualizar_progre.add(C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 60, -1));

        C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris1.png"))); // NOI18N
        Visualizar_progre.add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 60, -1));

        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris2.png"))); // NOI18N
        Visualizar_progre.add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 60, -1));

        C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris4.png"))); // NOI18N
        Visualizar_progre.add(C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 60, -1));

        flecha5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png"))); // NOI18N
        Visualizar_progre.add(flecha5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        flecha4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png"))); // NOI18N
        Visualizar_progre.add(flecha4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        flecha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png"))); // NOI18N
        Visualizar_progre.add(flecha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        flecha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png"))); // NOI18N
        Visualizar_progre.add(flecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("Deficiente");
        Visualizar_progre.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("Excelente");
        Visualizar_progre.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("Muy Bueno");
        Visualizar_progre.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setText("Bueno");
        Visualizar_progre.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 60, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setText("Regular");
        Visualizar_progre.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        jLabel57.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel57.setText("Estudiante:");
        Visualizar_progre.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jPanel3);

        Visualizar_progre.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, 230, 5));

        jLabel58.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel58.setText("Fecha:");
        Visualizar_progre.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jPanel5);

        Visualizar_progre.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 320, 5));

        jLabel59.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel59.setText("Firma del Docente:");
        Visualizar_progre.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.add(jPanel7);

        Visualizar_progre.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 320, 5));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/Logo_base.png"))); // NOI18N
        Visualizar_progre.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel11.setText("Progreso");
        Visualizar_progre.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel12.setText("del");
        Visualizar_progre.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/Nota.png"))); // NOI18N
        Visualizar_progre.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/Nota2.png"))); // NOI18N
        Visualizar_progre.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        Base.add(Visualizar_progre, "card9");

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
        Desplegable1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registrar", "Visualizar" }));
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

    private void lupaVPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupaVPActionPerformed

        if (cedulaVP.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {
            Modelo Estudiante = new Modelo();
            Estudiante = null;
            OperarProgreso OP = new OperarProgreso();
            Estudiante = OP.BuscarProgreso(letra_cedulaVP.getSelectedItem() + "" + cedulaVP.getText(), id_usuario);

            if (Estudiante != null) {

                ImprimirVP.setEnabled(true);
                lupaVP.setEnabled(false);

                if (Estudiante.getProgreso() == 0) {

                    C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris1.png")));
                    C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris2.png")));
                    C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris3.png")));
                    C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris4.png")));
                    C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris5.png")));
                    flecha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    flecha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    flecha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    flecha4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    flecha5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    barra.setBackground(Color.black);
                    JOptionPane.showMessageDialog(null, "     El Estudiante no tiene algún progreso     ", "¡IMPORTANTE!", JOptionPane.INFORMATION_MESSAGE);
                }
                if (Estudiante.getProgreso() == 1) {

                    C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/1_2.png")));
                    C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris2.png")));
                    C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris3.png")));
                    C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris4.png")));
                    C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris5.png")));
                    flecha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flecha.png")));
                    flecha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    flecha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    flecha4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    flecha5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    barra.setBackground(new Color(103, 0, 0));
                }
                if (Estudiante.getProgreso() == 2) {

                    C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris1.png")));
                    C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/2.png")));
                    C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris3.png")));
                    C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris4.png")));
                    C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris5.png")));
                    flecha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    flecha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flecha.png")));
                    flecha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    flecha4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    flecha5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    barra.setBackground(new Color(103, 0, 0));
                }
                if (Estudiante.getProgreso() == 3) {

                    C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris1.png")));
                    C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris2.png")));
                    C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/3.png")));
                    C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris4.png")));
                    C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris5.png")));
                    flecha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    flecha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    flecha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flecha.png")));
                    flecha4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    flecha5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    barra.setBackground(new Color(103, 0, 0));
                }
                if (Estudiante.getProgreso() == 4) {

                    C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris1.png")));
                    C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris2.png")));
                    C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris3.png")));
                    C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/4.png")));
                    C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris5.png")));
                    flecha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    flecha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    flecha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    flecha4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flecha.png")));
                    flecha5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    barra.setBackground(new Color(103, 0, 0));
                }
                if (Estudiante.getProgreso() == 5) {

                    C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris1.png")));
                    C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris2.png")));
                    C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris3.png")));
                    C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris4.png")));
                    C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/5.png")));
                    flecha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    flecha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    flecha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    flecha4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
                    flecha5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flecha.png")));
                    barra.setBackground(new Color(103, 0, 0));
                }
            }
        }
    }//GEN-LAST:event_lupaVPActionPerformed

    private void limpiarVPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarVPActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarVP) {
            cedulaVP.setText("");
            lupaVP.setEnabled(true);
            cedula_estudiante = "";
            C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris1.png")));
            C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris2.png")));
            C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris3.png")));
            C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris4.png")));
            C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/gris5.png")));
            flecha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
            flecha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
            flecha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
            flecha4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
            flecha5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/flechagris.png")));
            barra.setBackground(Color.black);
            ImprimirVP.setEnabled(false);
        }
    }//GEN-LAST:event_limpiarVPActionPerformed

    private void ImprimirVPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirVPActionPerformed

        try {

            // Open printer dialog and pass JPanel to print
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setPrintable(this);

            if (job.printDialog()) {

                jLabel56.setVisible(false);
                jLabel52.setVisible(false);
                lupaVP.setVisible(false);
                limpiarVP.setVisible(false);
                ImprimirVP.setVisible(false);
                Logo.setVisible(true);
                job.print();
                jLabel56.setVisible(true);
                jLabel52.setVisible(true);
                lupaVP.setVisible(true);
                limpiarVP.setVisible(true);
                ImprimirVP.setVisible(true);
                jLabel1.setVisible(true);
                Logo.setVisible(false);
                ImprimirVP.setEnabled(false);
                lupaVP.setEnabled(true);
            }

        } catch (PrinterException ex) {
            Logger.getLogger(Progreso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ImprimirVPActionPerformed

    private void limpiarRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarRPActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarRP) {
            cedulaRP.setText("");
            bueno.setSelected(true);
            ExelenteRP.setVisible(false);
            Muy_BuenoRP.setVisible(false);
            BuenoRP.setVisible(true);
            RegularRP.setVisible(true);
            deficienteRP.setVisible(true);
            Excelente.setVisible(false);
            Muy_Bueno.setVisible(false);
            Bueno.setVisible(true);
            Regular.setVisible(false);
            Deficiente.setVisible(false);
        }
    }//GEN-LAST:event_limpiarRPActionPerformed

    private void RegistrarRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarRPActionPerformed

        if (cedulaRP.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {
            Modelo Estudiante = new Modelo();
            Estudiante = null;
            OperarProgreso OP = new OperarProgreso();
            int progreso;
            progreso = 0;

            if (deficiente.isSelected()) {
                progreso = 1;
            }
            if (regular.isSelected()) {
                progreso = 2;
            }
            if (bueno.isSelected()) {
                progreso = 3;
            }
            if (muy_bueno.isSelected()) {
                progreso = 4;
            }
            if (exelente.isSelected()) {
                progreso = 5;
            }

            OP.modificar(letra_cedulaRP.getSelectedItem() + "" + cedulaRP.getText(), progreso);

        }
    }//GEN-LAST:event_RegistrarRPActionPerformed

    private void LupaRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LupaRPActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == LupaRP) {

            if (cedulaRP.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                Modelo Estudiante = new Modelo();
                Estudiante = null;
                OperarProgreso OP = new OperarProgreso();
                Estudiante = OP.BuscarProgreso(letra_cedulaRP.getSelectedItem() + "" + cedulaRP.getText(), id_usuario);

                if (Estudiante != null) {

                    if (Estudiante.getProgreso() == 0) {

                        JOptionPane.showMessageDialog(null, "     El Estudiante no tiene algún progreso     ", "¡IMPORTANTE!", JOptionPane.INFORMATION_MESSAGE);
                    }
                    if (Estudiante.getProgreso() == 1) {

                        ExelenteRP.setVisible(false);
                        Muy_BuenoRP.setVisible(false);
                        BuenoRP.setVisible(false);
                        RegularRP.setVisible(false);
                        deficienteRP.setVisible(true);
                        Excelente.setVisible(false);
                        Muy_Bueno.setVisible(false);
                        Bueno.setVisible(false);
                        Regular.setVisible(false);
                        Deficiente.setVisible(true);
                        deficiente.setSelected(true);
                    }
                    if (Estudiante.getProgreso() == 2) {

                        ExelenteRP.setVisible(false);
                        Muy_BuenoRP.setVisible(false);
                        BuenoRP.setVisible(false);
                        RegularRP.setVisible(true);
                        deficienteRP.setVisible(true);
                        Excelente.setVisible(false);
                        Muy_Bueno.setVisible(false);
                        Bueno.setVisible(false);
                        Regular.setVisible(true);
                        Deficiente.setVisible(false);
                        regular.setSelected(true);
                    }
                    if (Estudiante.getProgreso() == 3) {

                        ExelenteRP.setVisible(false);
                        Muy_BuenoRP.setVisible(false);
                        BuenoRP.setVisible(true);
                        RegularRP.setVisible(true);
                        deficienteRP.setVisible(true);
                        Excelente.setVisible(false);
                        Muy_Bueno.setVisible(false);
                        Bueno.setVisible(true);
                        Regular.setVisible(false);
                        Deficiente.setVisible(false);
                        bueno.setSelected(true);
                    }
                    if (Estudiante.getProgreso() == 4) {

                        ExelenteRP.setVisible(false);
                        Muy_BuenoRP.setVisible(true);
                        BuenoRP.setVisible(true);
                        RegularRP.setVisible(true);
                        deficienteRP.setVisible(true);
                        Excelente.setVisible(false);
                        Muy_Bueno.setVisible(true);
                        Bueno.setVisible(false);
                        Regular.setVisible(false);
                        Deficiente.setVisible(false);
                        muy_bueno.setSelected(true);
                    }
                    if (Estudiante.getProgreso() == 5) {

                        ExelenteRP.setVisible(true);
                        Muy_BuenoRP.setVisible(true);
                        BuenoRP.setVisible(true);
                        RegularRP.setVisible(true);
                        deficienteRP.setVisible(true);
                        Excelente.setVisible(true);
                        Muy_Bueno.setVisible(false);
                        Bueno.setVisible(false);
                        Regular.setVisible(false);
                        Deficiente.setVisible(false);
                        exelente.setSelected(true);
                    }
                }
            }
        }
    }//GEN-LAST:event_LupaRPActionPerformed

    private void cedulaRPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaRPKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {

            getToolkit().beep();
            evt.consume();
        }
        if (letra_cedulaRP.getSelectedItem().equals("M-")) {

            if (cedulaRP.getText().length() > 8) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        } else {
            if (cedulaRP.getText().length() > 7) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }//GEN-LAST:event_cedulaRPKeyTyped

    private void letra_cedulaRPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_letra_cedulaRPItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            cedulaRP.setText("");
        }
    }//GEN-LAST:event_letra_cedulaRPItemStateChanged

    private void Desplegable1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Desplegable1ItemStateChanged

        JComboBox cb = (JComboBox) evt.getSource();
        if (cb.getSelectedItem().equals("Registrar")) {

            Visualizar_progre.setVisible(false);
            Registrar_progre.setVisible(true);
        }
        if (cb.getSelectedItem().equals("Visualizar")) {

            Visualizar_progre.setVisible(true);
            Registrar_progre.setVisible(false);
            cedulaVP.setText("");
            lupaVP.setEnabled(true);
            cedula_estudiante = "";
        }
    }//GEN-LAST:event_Desplegable1ItemStateChanged

    private void cedulaVPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaVPKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {

            getToolkit().beep();
            evt.consume();
        }
        if (letra_cedulaVP.getSelectedItem().equals("M-")) {

            if (cedulaVP.getText().length() > 8) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        } else {
            if (cedulaVP.getText().length() > 7) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }//GEN-LAST:event_cedulaVPKeyTyped

    private void letra_cedulaVPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_letra_cedulaVPItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            cedulaVP.setText("");
        }
    }//GEN-LAST:event_letra_cedulaVPItemStateChanged

    private void exelenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exelenteActionPerformed

        if (exelente.isSelected()) {

            ExelenteRP.setVisible(true);
            Muy_BuenoRP.setVisible(true);
            BuenoRP.setVisible(true);
            RegularRP.setVisible(true);
            deficienteRP.setVisible(true);
            Excelente.setVisible(true);
            Muy_Bueno.setVisible(false);
            Bueno.setVisible(false);
            Regular.setVisible(false);
            Deficiente.setVisible(false);
        }
    }//GEN-LAST:event_exelenteActionPerformed

    private void muy_buenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muy_buenoActionPerformed

        if (muy_bueno.isSelected()) {

            ExelenteRP.setVisible(false);
            Muy_BuenoRP.setVisible(true);
            BuenoRP.setVisible(true);
            RegularRP.setVisible(true);
            deficienteRP.setVisible(true);
            Excelente.setVisible(false);
            Muy_Bueno.setVisible(true);
            Bueno.setVisible(false);
            Regular.setVisible(false);
            Deficiente.setVisible(false);
        }

    }//GEN-LAST:event_muy_buenoActionPerformed

    private void buenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buenoActionPerformed

        if (bueno.isSelected()) {

            ExelenteRP.setVisible(false);
            Muy_BuenoRP.setVisible(false);
            BuenoRP.setVisible(true);
            RegularRP.setVisible(true);
            deficienteRP.setVisible(true);
            Excelente.setVisible(false);
            Muy_Bueno.setVisible(false);
            Bueno.setVisible(true);
            Regular.setVisible(false);
            Deficiente.setVisible(false);
        }
    }//GEN-LAST:event_buenoActionPerformed

    private void regularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regularActionPerformed

        if (regular.isSelected()) {

            ExelenteRP.setVisible(false);
            Muy_BuenoRP.setVisible(false);
            BuenoRP.setVisible(false);
            RegularRP.setVisible(true);
            deficienteRP.setVisible(true);
            Excelente.setVisible(false);
            Muy_Bueno.setVisible(false);
            Bueno.setVisible(false);
            Regular.setVisible(true);
            Deficiente.setVisible(false);
        }
    }//GEN-LAST:event_regularActionPerformed

    private void deficienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deficienteActionPerformed

        if (deficiente.isSelected()) {

            ExelenteRP.setVisible(false);
            Muy_BuenoRP.setVisible(false);
            BuenoRP.setVisible(false);
            RegularRP.setVisible(false);
            deficienteRP.setVisible(true);
            Excelente.setVisible(false);
            Muy_Bueno.setVisible(false);
            Bueno.setVisible(false);
            Regular.setVisible(false);
            Deficiente.setVisible(true);
        }
    }//GEN-LAST:event_deficienteActionPerformed

    public void limpiarjif() {

        cedulaRP.setText("");
        cedulaVP.setText("");
        lupaVP.setEnabled(true);
        cedula_estudiante = "";
        Desplegable1.setSelectedItem("Registrar");
    }

    private String usuario, cedula_estudiante = "", serial_i = "";
    private boolean VolverLogin = true, administrador = false;
    private int id_estudiante = 0, id_instrumento = 0, id_usuario = 0;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Base;
    private javax.swing.JLabel Bueno;
    private javax.swing.JLabel BuenoRP;
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C3;
    private javax.swing.JLabel C4;
    private javax.swing.JLabel C5;
    private javax.swing.JLabel Deficiente;
    private javax.swing.JComboBox<String> Desplegable1;
    private javax.swing.JLabel Excelente;
    private javax.swing.JLabel ExelenteRP;
    private javax.swing.JButton ImprimirVP;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton LupaRP;
    private javax.swing.JLabel Muy_Bueno;
    private javax.swing.JLabel Muy_BuenoRP;
    private javax.swing.JButton RegistrarRP;
    private javax.swing.JPanel Registrar_progre;
    private javax.swing.JLabel Regular;
    private javax.swing.JLabel RegularRP;
    private javax.swing.JPanel Visualizar_progre;
    private javax.swing.JPanel barra;
    private javax.swing.JRadioButton bueno;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cedulaRP;
    private javax.swing.JTextField cedulaVP;
    private javax.swing.JRadioButton deficiente;
    private javax.swing.JLabel deficienteRP;
    private javax.swing.JRadioButton exelente;
    private javax.swing.JLabel flecha1;
    private javax.swing.JLabel flecha2;
    private javax.swing.JLabel flecha3;
    private javax.swing.JLabel flecha4;
    private javax.swing.JLabel flecha5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JComboBox<String> letra_cedulaRP;
    private javax.swing.JComboBox<String> letra_cedulaVP;
    private javax.swing.JButton limpiarRP;
    private javax.swing.JButton limpiarVP;
    private javax.swing.JButton lupaVP;
    private javax.swing.JRadioButton muy_bueno;
    private javax.swing.JRadioButton regular;
    // End of variables declaration//GEN-END:variables

    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

        if (pageIndex > 0) {
            return NO_SUCH_PAGE;

        } else {
            Graphics2D g2d = (Graphics2D) graphics;
            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

            // set dimension to scale panel print
            g2d.scale(1.00, 1.00);

            Visualizar_progre.printAll(graphics);

            return PAGE_EXISTS;
        }
    }
}
