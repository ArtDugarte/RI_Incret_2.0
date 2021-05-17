package Vistas;

import Modelos.OperarNombreInstrumento;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Nombre_Instrumento extends javax.swing.JInternalFrame {

    public Nombre_Instrumento() {

        initComponents();
        obtenerMatrizNombreInstru();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Base = new javax.swing.JPanel();
        RegistrarNombreInstru = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        nombreI = new javax.swing.JTextField();
        limpiarNI = new javax.swing.JButton();
        RegistrarNI = new javax.swing.JButton();
        BorrarNomInsrtu = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        nombreBNI = new javax.swing.JTextField();
        limpiarBNI = new javax.swing.JButton();
        BorrarNomInstru = new javax.swing.JButton();
        ListadoNombInstru = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaNI = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Desplegable1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Nombres de Instrumentos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/nombre_i.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(1024, 700));
        setPreferredSize(new java.awt.Dimension(1024, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Base.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Base.setOpaque(false);
        Base.setLayout(new java.awt.CardLayout());

        RegistrarNombreInstru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistrarNombreInstru.setOpaque(false);
        RegistrarNombreInstru.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel6.setText("Nombre del Instrumento");
        jLabel6.setToolTipText("");
        RegistrarNombreInstru.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 420, -1));

        jLabel42.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel42.setText("Nombre ");
        RegistrarNombreInstru.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        nombreI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RegistrarNombreInstru.add(nombreI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 260, -1));

        limpiarNI.setBackground(new java.awt.Color(103, 0, 0));
        limpiarNI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarNI.setForeground(new java.awt.Color(255, 255, 255));
        limpiarNI.setText("Limpiar");
        limpiarNI.setBorderPainted(false);
        limpiarNI.setFocusPainted(false);
        limpiarNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarNIActionPerformed(evt);
            }
        });
        RegistrarNombreInstru.add(limpiarNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        RegistrarNI.setBackground(new java.awt.Color(103, 0, 0));
        RegistrarNI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        RegistrarNI.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarNI.setText("Registrar");
        RegistrarNI.setBorderPainted(false);
        RegistrarNI.setFocusPainted(false);
        RegistrarNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarNIActionPerformed(evt);
            }
        });
        RegistrarNombreInstru.add(RegistrarNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, -1, -1));

        Base.add(RegistrarNombreInstru, "card5");

        BorrarNomInsrtu.setOpaque(false);
        BorrarNomInsrtu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel14.setText("Nombre del Instrumento");
        BorrarNomInsrtu.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel71.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel71.setText("Nombre");
        BorrarNomInsrtu.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        nombreBNI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BorrarNomInsrtu.add(nombreBNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 260, -1));

        limpiarBNI.setBackground(new java.awt.Color(103, 0, 0));
        limpiarBNI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarBNI.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBNI.setText("Limpiar");
        limpiarBNI.setBorderPainted(false);
        limpiarBNI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiarBNI.setFocusPainted(false);
        limpiarBNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBNIActionPerformed(evt);
            }
        });
        BorrarNomInsrtu.add(limpiarBNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        BorrarNomInstru.setBackground(new java.awt.Color(103, 0, 0));
        BorrarNomInstru.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        BorrarNomInstru.setForeground(new java.awt.Color(255, 255, 255));
        BorrarNomInstru.setText("Borrar");
        BorrarNomInstru.setBorderPainted(false);
        BorrarNomInstru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BorrarNomInstru.setFocusPainted(false);
        BorrarNomInstru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarNomInstruActionPerformed(evt);
            }
        });
        BorrarNomInsrtu.add(BorrarNomInstru, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, -1, -1));

        Base.add(BorrarNomInsrtu, "card13");

        ListadoNombInstru.setOpaque(false);
        ListadoNombInstru.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel19.setText("Nombre de los Instrumentos");
        ListadoNombInstru.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        TablaNI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TablaNI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TablaNI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "     Nombres"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaNI.setFocusable(false);
        TablaNI.setGridColor(new java.awt.Color(0, 0, 0));
        TablaNI.getTableHeader().setResizingAllowed(false);
        TablaNI.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TablaNI);

        ListadoNombInstru.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 80, 610, 450));

        Base.add(ListadoNombInstru, "card18");

        jLayeredPane1.add(Base, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 660, 570));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/1_1.png"))); // NOI18N
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, 0, 1020, 670));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 700, 700));

        jPanel1.setBackground(new java.awt.Color(103, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Desplegable1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Desplegable1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registrar", "Borrar", "Listado" }));
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarNIActionPerformed

        nombreI.setText("");
    }//GEN-LAST:event_limpiarNIActionPerformed

    private void RegistrarNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarNIActionPerformed

        if (nombreI.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {
            OperarNombreInstrumento OP = new OperarNombreInstrumento();
            OP.RegistrarNombreInstrumento(nombreI.getText().toUpperCase());
            nombreI.setText("");
        }
    }//GEN-LAST:event_RegistrarNIActionPerformed

    private void limpiarBNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBNIActionPerformed

        nombreBNI.setText("");
    }//GEN-LAST:event_limpiarBNIActionPerformed

    private void BorrarNomInstruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarNomInstruActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == BorrarNomInstru) {

            if (nombreBNI.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                OperarNombreInstrumento OP = new OperarNombreInstrumento();
                OP.borrar(nombreBNI.getText().toUpperCase());
                nombreBNI.setText("");
            }
        }
    }//GEN-LAST:event_BorrarNomInstruActionPerformed

    private void Desplegable1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Desplegable1ItemStateChanged

        JComboBox cb = (JComboBox) evt.getSource();
        if (cb.getSelectedItem().equals("Registrar")) {

            RegistrarNombreInstru.setVisible(true);
            BorrarNomInsrtu.setVisible(false);
            nombreBNI.setText("");
            nombreI.setText("");
            ListadoNombInstru.setVisible(false);
            

        }
        if (cb.getSelectedItem().equals("Borrar")) {

            RegistrarNombreInstru.setVisible(false);
            BorrarNomInsrtu.setVisible(true);
            nombreBNI.setText("");
            nombreI.setText("");ListadoNombInstru.setVisible(false);
            
        }
        if (cb.getSelectedItem().equals("Listado")) {

            RegistrarNombreInstru.setVisible(false);
            BorrarNomInsrtu.setVisible(false);
            ListadoNombInstru.setVisible(true);
            obtenerMatrizNombreInstru();
        }
    }//GEN-LAST:event_Desplegable1ItemStateChanged

    public void obtenerMatrizNombreInstru() {

        OperarNombreInstrumento nombre_instru = new OperarNombreInstrumento();
        ArrayList<Modelos.Modelo> miLista = nombre_instru.BuscarconMatriz();
        DefaultTableModel model = (DefaultTableModel) TablaNI.getModel();
        model.setRowCount(0);
        for (int i = 0; i < miLista.size(); i++) {

            model.addRow(new Object[]{miLista.get(i).getNombre_instrumento()});
        }
    }

    public void limpiarjif() {

        RegistrarNombreInstru.setVisible(true);
        BorrarNomInsrtu.setVisible(false);
        nombreBNI.setText("");
        nombreI.setText("");
        Desplegable1.setSelectedItem("Registrar");
        obtenerMatrizNombreInstru();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Base;
    private javax.swing.JPanel BorrarNomInsrtu;
    private javax.swing.JButton BorrarNomInstru;
    private javax.swing.JComboBox<String> Desplegable1;
    private javax.swing.JPanel ListadoNombInstru;
    private javax.swing.JButton RegistrarNI;
    private javax.swing.JPanel RegistrarNombreInstru;
    private javax.swing.JTable TablaNI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiarBNI;
    private javax.swing.JButton limpiarNI;
    private javax.swing.JTextField nombreBNI;
    private javax.swing.JTextField nombreI;
    // End of variables declaration//GEN-END:variables
}
