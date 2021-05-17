package Vistas;

import Modelos.OperarMarcaInstrumento;
import Modelos.OperarNombreInstrumento;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Marca_Instrumento extends javax.swing.JInternalFrame {

    public Marca_Instrumento() {

        initComponents();
        obtenerMatrizMarcaInstru();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Base = new javax.swing.JPanel();
        RegistrarMarcaInstru = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        marcaI = new javax.swing.JTextField();
        limpiarMMI = new javax.swing.JButton();
        RegistrarMI = new javax.swing.JButton();
        BorrarMarcaInstru = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        marcaBMI = new javax.swing.JTextField();
        limpiarBMI = new javax.swing.JButton();
        BorrarMarcaI = new javax.swing.JButton();
        ListadoMarcaInstru = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaMI = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Desplegable1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Marcas de Instrumentos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/marca.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(1024, 700));
        setPreferredSize(new java.awt.Dimension(1024, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Base.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Base.setOpaque(false);
        Base.setLayout(new java.awt.CardLayout());

        RegistrarMarcaInstru.setOpaque(false);
        RegistrarMarcaInstru.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel7.setText("Marca del Instrumento");
        RegistrarMarcaInstru.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 410, -1));

        jLabel43.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel43.setText("Marca");
        RegistrarMarcaInstru.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        marcaI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        marcaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaIActionPerformed(evt);
            }
        });
        RegistrarMarcaInstru.add(marcaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 260, -1));

        limpiarMMI.setBackground(new java.awt.Color(103, 0, 0));
        limpiarMMI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarMMI.setForeground(new java.awt.Color(255, 255, 255));
        limpiarMMI.setText("Limpiar");
        limpiarMMI.setBorderPainted(false);
        limpiarMMI.setFocusPainted(false);
        limpiarMMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarMMIActionPerformed(evt);
            }
        });
        RegistrarMarcaInstru.add(limpiarMMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        RegistrarMI.setBackground(new java.awt.Color(103, 0, 0));
        RegistrarMI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        RegistrarMI.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarMI.setText("Registrar");
        RegistrarMI.setBorderPainted(false);
        RegistrarMI.setFocusPainted(false);
        RegistrarMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarMIActionPerformed(evt);
            }
        });
        RegistrarMarcaInstru.add(RegistrarMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, -1, -1));

        Base.add(RegistrarMarcaInstru, "card6");

        BorrarMarcaInstru.setOpaque(false);
        BorrarMarcaInstru.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel15.setText("Marca del Instrumento");
        BorrarMarcaInstru.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel72.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel72.setText("Marca");
        BorrarMarcaInstru.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        marcaBMI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BorrarMarcaInstru.add(marcaBMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 260, -1));

        limpiarBMI.setBackground(new java.awt.Color(103, 0, 0));
        limpiarBMI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarBMI.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBMI.setText("Limpiar");
        limpiarBMI.setBorderPainted(false);
        limpiarBMI.setFocusPainted(false);
        limpiarBMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBMIActionPerformed(evt);
            }
        });
        BorrarMarcaInstru.add(limpiarBMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        BorrarMarcaI.setBackground(new java.awt.Color(103, 0, 0));
        BorrarMarcaI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        BorrarMarcaI.setForeground(new java.awt.Color(255, 255, 255));
        BorrarMarcaI.setText("Borrar");
        BorrarMarcaI.setBorderPainted(false);
        BorrarMarcaI.setFocusPainted(false);
        BorrarMarcaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarMarcaIActionPerformed(evt);
            }
        });
        BorrarMarcaInstru.add(BorrarMarcaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, -1, -1));

        Base.add(BorrarMarcaInstru, "card14");

        ListadoMarcaInstru.setOpaque(false);
        ListadoMarcaInstru.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel20.setText("Marca de Instrumentos");
        ListadoMarcaInstru.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPane3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        TablaMI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TablaMI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TablaMI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "    Marcas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaMI.setFocusable(false);
        TablaMI.setGridColor(new java.awt.Color(0, 0, 0));
        TablaMI.getTableHeader().setResizingAllowed(false);
        TablaMI.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(TablaMI);

        ListadoMarcaInstru.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 80, 610, 450));

        Base.add(ListadoMarcaInstru, "card19");

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

    private void Desplegable1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Desplegable1ItemStateChanged

        JComboBox cb = (JComboBox) evt.getSource();
        if (cb.getSelectedItem().equals("Registrar")) {

            RegistrarMarcaInstru.setVisible(true);
            BorrarMarcaInstru.setVisible(false);
            marcaBMI.setText("");
            marcaI.setText("");
            ListadoMarcaInstru.setVisible(false);

        }
        if (cb.getSelectedItem().equals("Borrar")) {

            RegistrarMarcaInstru.setVisible(false);
            BorrarMarcaInstru.setVisible(true);
            marcaBMI.setText("");
            marcaI.setText("");
            ListadoMarcaInstru.setVisible(false);
        }
        if (cb.getSelectedItem().equals("Listado")) {

            RegistrarMarcaInstru.setVisible(false);
            BorrarMarcaInstru.setVisible(false);
            ListadoMarcaInstru.setVisible(true);
            obtenerMatrizMarcaInstru();
        }
    }//GEN-LAST:event_Desplegable1ItemStateChanged

    private void marcaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaIActionPerformed

    private void limpiarMMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarMMIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarMMI) {
            marcaI.setText("");
        }
    }//GEN-LAST:event_limpiarMMIActionPerformed

    private void RegistrarMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarMIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == RegistrarMI) {

            if (marcaI.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {

                OperarMarcaInstrumento OP = new OperarMarcaInstrumento();
                OP.RegistrarMarcaInstrumento(marcaI.getText().toUpperCase());
                marcaI.setText("");
            }
        }
    }//GEN-LAST:event_RegistrarMIActionPerformed

    private void limpiarBMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBMIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarBMI) {
            marcaBMI.setText("");
        }
    }//GEN-LAST:event_limpiarBMIActionPerformed

    private void BorrarMarcaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarMarcaIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == BorrarMarcaI) {

            if (marcaBMI.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                OperarMarcaInstrumento OP = new OperarMarcaInstrumento();
                OP.borrar(marcaBMI.getText().toUpperCase());
                marcaBMI.setText("");
            }
        }
    }//GEN-LAST:event_BorrarMarcaIActionPerformed

    public void obtenerMatrizMarcaInstru() {

        OperarMarcaInstrumento marca_instru = new OperarMarcaInstrumento();
        ArrayList<Modelos.Modelo> miLista = marca_instru.BuscarconMatriz();
        DefaultTableModel model = (DefaultTableModel) TablaMI.getModel();
        model.setRowCount(0);
        for (int i = 0; i < miLista.size(); i++) {

            model.addRow(new Object[]{miLista.get(i).getMarca_instrumento()});
        }
    }

    public void limpiarjif() {

        RegistrarMarcaInstru.setVisible(true);
        BorrarMarcaInstru.setVisible(false);
        marcaBMI.setText("");
        marcaI.setText("");
        Desplegable1.setSelectedItem("Registrar");
        obtenerMatrizMarcaInstru();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Base;
    private javax.swing.JButton BorrarMarcaI;
    private javax.swing.JPanel BorrarMarcaInstru;
    private javax.swing.JComboBox<String> Desplegable1;
    private javax.swing.JPanel ListadoMarcaInstru;
    private javax.swing.JButton RegistrarMI;
    private javax.swing.JPanel RegistrarMarcaInstru;
    private javax.swing.JTable TablaMI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton limpiarBMI;
    private javax.swing.JButton limpiarMMI;
    private javax.swing.JTextField marcaBMI;
    private javax.swing.JTextField marcaI;
    // End of variables declaration//GEN-END:variables
}
