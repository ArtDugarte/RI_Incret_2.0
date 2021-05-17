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

public class Listado_PresAtra extends javax.swing.JInternalFrame {

    public Listado_PresAtra() {

        initComponents();
        obtenerMatrizPrestamoRetardado();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Base = new javax.swing.JPanel();
        ListaPrestamosRetra = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TablaPR = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Listado Prestamos Retrasados");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/devolucion.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(1024, 700));
        setPreferredSize(new java.awt.Dimension(1024, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Base.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Base.setOpaque(false);
        Base.setLayout(new java.awt.CardLayout());

        ListaPrestamosRetra.setOpaque(false);
        ListaPrestamosRetra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel23.setText("Préstamos Retrasados");
        ListaPrestamosRetra.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jScrollPane6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        TablaPR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TablaPR.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TablaPR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario de Turno", "Cédula del Estudiente", "Serial del Instrumento", "Fecha de Entrega", "Fecha de Devolución"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaPR.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane6.setViewportView(TablaPR);

        ListaPrestamosRetra.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 80, 610, 450));

        Base.add(ListaPrestamosRetra, "card22");

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

    public void obtenerMatrizPrestamoRetardado() {

        OperarPrestamo prestamoR = new OperarPrestamo();
        ArrayList<Modelo> miLista = prestamoR.BuscarconMatriz2();
        DefaultTableModel model = (DefaultTableModel) TablaPR.getModel();
        model.setRowCount(0);
        for (int i = 0; i < miLista.size(); i++) {

            model.addRow(new Object[]{miLista.get(i).getusuario(), miLista.get(i).getcedula(), miLista.get(i).getSerial(), miLista.get(i).getfecha_entrega(), miLista.get(i).getFecha_devolucion()});
        }
    }

    private String usuario, cedula_estudiante = "", serial_i = "";
    private boolean VolverLogin = true, administrador = false;
    private int id_estudiante = 0, id_instrumento = 0, id_usuario = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Base;
    private javax.swing.JPanel ListaPrestamosRetra;
    private javax.swing.JTable TablaPR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane6;
    // End of variables declaration//GEN-END:variables
}
