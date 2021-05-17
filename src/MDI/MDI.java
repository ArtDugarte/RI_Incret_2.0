package MDI;

import Vistas.Busqueda_Estudiante;
import Vistas.Busqueda_Instrumento;
import Vistas.Busqueda_PresAct;
import Vistas.Devolucion;
import Vistas.Docente;
import Vistas.Estudiante;
import Vistas.Instrumento;
import Vistas.Listado_Docentes;
import Vistas.Listado_Estudiante;
import Vistas.Listado_Instrumento;
import Vistas.Listado_PresAct;
import Vistas.Listado_PresAtra;
import Vistas.Listado_estuXprofe;
import Vistas.Marca_Instrumento;
import Vistas.Nombre_Instrumento;
import Vistas.Prestamo;
import Vistas.Progreso;
import Vistas.Usuario;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MDI extends javax.swing.JFrame {

    public MDI(int admin, int user) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imaganes/icono_titulo.png")).getImage());
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("hh:mm:ss a");
        reloj.setText(formateador.format(LocalDateTime.now()));
        reloj();
        setLocationRelativeTo(null);
        lp = new Listado_estuXprofe(user);
        usu = new Usuario(admin);
        desktopPane.add(nomb_i);
        desktopPane.add(marca_i);
        desktopPane.add(Instru);
        desktopPane.add(presta);
        desktopPane.add(devo);
        desktopPane.add(estu);
        desktopPane.add(le);
        desktopPane.add(li);
        desktopPane.add(lpa);
        desktopPane.add(ldoc);
        desktopPane.add(lpat);
        desktopPane.add(bus_e);
        desktopPane.add(bus_i);
        desktopPane.add(bus_p);
        desktopPane.add(doc);
        desktopPane.add(usu);
        desktopPane.add(pro);
        desktopPane.add(lp);

        if (admin == 0) {

            Academia.setVisible(false);
            profesores.setVisible(false);

        }
        if (admin == 2) {

            Almacen.setVisible(false);
            docente.setVisible(false);
            Busqueda_Avanzada.setVisible(false);
            instrumentos.setVisible(false);
            prestamos_act.setVisible(false);
            prestamos_retra.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        reloj = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        Academia = new javax.swing.JMenu();
        docente = new javax.swing.JMenuItem();
        estudiante = new javax.swing.JMenuItem();
        progreso = new javax.swing.JMenuItem();
        listado_estu = new javax.swing.JMenuItem();
        Almacen = new javax.swing.JMenu();
        prestamo = new javax.swing.JMenuItem();
        devolucion = new javax.swing.JMenuItem();
        nombre = new javax.swing.JMenuItem();
        marca = new javax.swing.JMenuItem();
        instrumento = new javax.swing.JMenuItem();
        Listados = new javax.swing.JMenu();
        estudiantes = new javax.swing.JMenuItem();
        instrumentos = new javax.swing.JMenuItem();
        profesores = new javax.swing.JMenuItem();
        prestamos_act = new javax.swing.JMenuItem();
        prestamos_retra = new javax.swing.JMenuItem();
        Busqueda_Avanzada = new javax.swing.JMenu();
        buscar_estudiantes = new javax.swing.JMenuItem();
        buscar_instrumento = new javax.swing.JMenuItem();
        Prestamo_Act = new javax.swing.JMenuItem();
        usuarios = new javax.swing.JMenu();
        Usu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RI Incret");
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        reloj.setFont(new java.awt.Font("Curlz MT", 1, 60)); // NOI18N
        reloj.setForeground(new java.awt.Color(255, 255, 255));
        reloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reloj.setText("HH:MM:SS AA");
        reloj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        desktopPane.add(reloj);
        reloj.setBounds(420, 260, 410, 120);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/Logo_base.png"))); // NOI18N
        desktopPane.add(jLabel2);
        jLabel2.setBounds(40, 620, 310, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/fondoMDI.jpg"))); // NOI18N
        desktopPane.add(jLabel1);
        jLabel1.setBounds(-440, 0, 2150, 790);

        getContentPane().add(desktopPane);
        desktopPane.setBounds(0, 0, 1200, 779);

        menuBar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        Academia.setMnemonic('f');
        Academia.setText("Academia");
        Academia.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        docente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        docente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/profesor.png"))); // NOI18N
        docente.setText("Docente");
        docente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docenteActionPerformed(evt);
            }
        });
        Academia.add(docente);

        estudiante.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        estudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/alumno.png"))); // NOI18N
        estudiante.setText("Estudiante");
        estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estudianteActionPerformed(evt);
            }
        });
        Academia.add(estudiante);

        progreso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        progreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/progreso.png"))); // NOI18N
        progreso.setText("Progreso");
        progreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progresoActionPerformed(evt);
            }
        });
        Academia.add(progreso);

        listado_estu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        listado_estu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/alumno.png"))); // NOI18N
        listado_estu.setText("Estudiantes del docente");
        listado_estu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listado_estuActionPerformed(evt);
            }
        });
        Academia.add(listado_estu);

        menuBar.add(Academia);

        Almacen.setMnemonic('e');
        Almacen.setText("Almacén");
        Almacen.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        prestamo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        prestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/prestamo.png"))); // NOI18N
        prestamo.setText("Préstamo");
        prestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestamoActionPerformed(evt);
            }
        });
        Almacen.add(prestamo);

        devolucion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        devolucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/devolucion.png"))); // NOI18N
        devolucion.setText("Devolución");
        devolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolucionActionPerformed(evt);
            }
        });
        Almacen.add(devolucion);

        nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/nombre_i.png"))); // NOI18N
        nombre.setText("Nombres de Instrumentos");
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        Almacen.add(nombre);

        marca.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        marca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/marca.png"))); // NOI18N
        marca.setText("Marcas de Instrumentos");
        marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaActionPerformed(evt);
            }
        });
        Almacen.add(marca);

        instrumento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        instrumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/instrumento.png"))); // NOI18N
        instrumento.setText("Instrumento");
        instrumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrumentoActionPerformed(evt);
            }
        });
        Almacen.add(instrumento);

        menuBar.add(Almacen);

        Listados.setMnemonic('h');
        Listados.setText("Listados");
        Listados.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        estudiantes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        estudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/alumno.png"))); // NOI18N
        estudiantes.setText("Estudiantes");
        estudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estudiantesActionPerformed(evt);
            }
        });
        Listados.add(estudiantes);

        instrumentos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        instrumentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/instrumento.png"))); // NOI18N
        instrumentos.setText("Instrumentos");
        instrumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrumentosActionPerformed(evt);
            }
        });
        Listados.add(instrumentos);

        profesores.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        profesores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/profesor.png"))); // NOI18N
        profesores.setText("Profesores");
        profesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesoresActionPerformed(evt);
            }
        });
        Listados.add(profesores);

        prestamos_act.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        prestamos_act.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/prestamo.png"))); // NOI18N
        prestamos_act.setText("Préstamos Activos");
        prestamos_act.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestamos_actActionPerformed(evt);
            }
        });
        Listados.add(prestamos_act);

        prestamos_retra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        prestamos_retra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/devolucion.png"))); // NOI18N
        prestamos_retra.setText("Préstamos Retrasados");
        prestamos_retra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestamos_retraActionPerformed(evt);
            }
        });
        Listados.add(prestamos_retra);

        menuBar.add(Listados);

        Busqueda_Avanzada.setMnemonic('h');
        Busqueda_Avanzada.setText("Búsqueda Avanzada");
        Busqueda_Avanzada.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        buscar_estudiantes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buscar_estudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/alumno.png"))); // NOI18N
        buscar_estudiantes.setText("Estudiantes");
        buscar_estudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_estudiantesActionPerformed(evt);
            }
        });
        Busqueda_Avanzada.add(buscar_estudiantes);

        buscar_instrumento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buscar_instrumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/instrumento.png"))); // NOI18N
        buscar_instrumento.setText("Instrumentos");
        buscar_instrumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_instrumentoActionPerformed(evt);
            }
        });
        Busqueda_Avanzada.add(buscar_instrumento);

        Prestamo_Act.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Prestamo_Act.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/prestamo.png"))); // NOI18N
        Prestamo_Act.setText("Préstamos Activos");
        Prestamo_Act.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prestamo_ActActionPerformed(evt);
            }
        });
        Busqueda_Avanzada.add(Prestamo_Act);

        menuBar.add(Busqueda_Avanzada);

        usuarios.setMnemonic('h');
        usuarios.setText("Usuarios");
        usuarios.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        Usu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Usu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaganes/hombre.png"))); // NOI18N
        Usu.setText("Usuarios");
        Usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuActionPerformed(evt);
            }
        });
        usuarios.add(Usu);

        menuBar.add(usuarios);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed

        nomb_i.setVisible(true);
        nomb_i.limpiarjif();
        nomb_i.obtenerMatrizNombreInstru();
    }//GEN-LAST:event_nombreActionPerformed

    private void marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaActionPerformed

        marca_i.setVisible(true);
        marca_i.limpiarjif();
        marca_i.obtenerMatrizMarcaInstru();
    }//GEN-LAST:event_marcaActionPerformed

    private void instrumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrumentoActionPerformed

        Instru.setVisible(true);
        Instru.limpiarjif();
    }//GEN-LAST:event_instrumentoActionPerformed

    private void prestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestamoActionPerformed

        presta.setid_usuario(id_usuario);
        presta.setVisible(true);
        presta.limpiarjif();
    }//GEN-LAST:event_prestamoActionPerformed

    private void devolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolucionActionPerformed

        devo.setVisible(true);
        devo.limpiarjif();
    }//GEN-LAST:event_devolucionActionPerformed

    private void estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estudianteActionPerformed

        estu.setVisible(true);
        estu.limpiarjif();
        estu.cargarCBDocentes();

    }//GEN-LAST:event_estudianteActionPerformed

    private void estudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estudiantesActionPerformed

        le.setVisible(true);
        le.obtenerMatrizEstudiante();

    }//GEN-LAST:event_estudiantesActionPerformed

    private void instrumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrumentosActionPerformed

        li.setVisible(true);
        li.obtenerMatrizInstrumento();
    }//GEN-LAST:event_instrumentosActionPerformed

    private void prestamos_actActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestamos_actActionPerformed

        lpa.setVisible(true);
        lpa.obtenerMatrizPrestamoActivo();

    }//GEN-LAST:event_prestamos_actActionPerformed

    private void prestamos_retraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestamos_retraActionPerformed

        lpat.setVisible(true);
        lpat.obtenerMatrizPrestamoRetardado();

    }//GEN-LAST:event_prestamos_retraActionPerformed

    private void buscar_estudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_estudiantesActionPerformed

        bus_e.setVisible(true);
        bus_e.limpiarjif();

    }//GEN-LAST:event_buscar_estudiantesActionPerformed

    private void buscar_instrumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_instrumentoActionPerformed

        bus_i.setVisible(true);
        bus_i.limpiarjif();

    }//GEN-LAST:event_buscar_instrumentoActionPerformed

    private void Prestamo_ActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prestamo_ActActionPerformed

        bus_p.setVisible(true);
        bus_p.limpiarjif();

    }//GEN-LAST:event_Prestamo_ActActionPerformed

    private void docenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docenteActionPerformed

        doc.setVisible(true);
        doc.limpiarjif();
    }//GEN-LAST:event_docenteActionPerformed

    private void UsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuActionPerformed
        usu.setVisible(true);
        usu.limpiarjif();
    }//GEN-LAST:event_UsuActionPerformed

    private void progresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progresoActionPerformed

        pro.setVisible(true);
        pro.limpiarjif();
        pro.setId_usuario(id_usuario);

    }//GEN-LAST:event_progresoActionPerformed

    private void profesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profesoresActionPerformed

        ldoc.setVisible(true);
        ldoc.obtenerMatrizDocente();
    }//GEN-LAST:event_profesoresActionPerformed

    private void listado_estuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listado_estuActionPerformed

        lp.setVisible(true);
        lp.obtenerMatrizEstudiante();
    }//GEN-LAST:event_listado_estuActionPerformed

    public void setid_usuario(int id_usuario) {

        this.id_usuario = id_usuario;
    }

    public void setusuario(String usuario) {

        this.usuario = usuario;
    }

    public void setadministrador(int administrador) {

        this.administrador = administrador;
    }

    public void reloj() {

        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("hh:mm:ss a");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                        reloj.setText(formateador.format(LocalDateTime.now()));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread hilo = new Thread(runnable);
        hilo.start();
    }

    Nombre_Instrumento nomb_i = new Nombre_Instrumento();
    Marca_Instrumento marca_i = new Marca_Instrumento();
    Instrumento Instru = new Instrumento();
    Prestamo presta = new Prestamo();
    Devolucion devo = new Devolucion();
    Estudiante estu = new Estudiante();
    Listado_Estudiante le = new Listado_Estudiante();
    Listado_Instrumento li = new Listado_Instrumento();
    Listado_PresAct lpa = new Listado_PresAct();
    Listado_PresAtra lpat = new Listado_PresAtra();
    Listado_Docentes ldoc = new Listado_Docentes();
    Listado_estuXprofe lp;
    Busqueda_Estudiante bus_e = new Busqueda_Estudiante();
    Busqueda_Instrumento bus_i = new Busqueda_Instrumento();
    Busqueda_PresAct bus_p = new Busqueda_PresAct();
    Docente doc = new Docente();
    Usuario usu;
    Progreso pro = new Progreso();
    private String usuario, cedula_estudiante = "", serial_i = "";
    private boolean VolverLogin = true;
    private int id_estudiante = 0, id_instrumento = 0, id_usuario = 0, administrador = 0;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Academia;
    private javax.swing.JMenu Almacen;
    private javax.swing.JMenu Busqueda_Avanzada;
    private javax.swing.JMenu Listados;
    private javax.swing.JMenuItem Prestamo_Act;
    private javax.swing.JMenuItem Usu;
    private javax.swing.JMenuItem buscar_estudiantes;
    private javax.swing.JMenuItem buscar_instrumento;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem devolucion;
    private javax.swing.JMenuItem docente;
    private javax.swing.JMenuItem estudiante;
    private javax.swing.JMenuItem estudiantes;
    private javax.swing.JMenuItem instrumento;
    private javax.swing.JMenuItem instrumentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem listado_estu;
    private javax.swing.JMenuItem marca;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem nombre;
    private javax.swing.JMenuItem prestamo;
    private javax.swing.JMenuItem prestamos_act;
    private javax.swing.JMenuItem prestamos_retra;
    private javax.swing.JMenuItem profesores;
    private javax.swing.JMenuItem progreso;
    private javax.swing.JLabel reloj;
    private javax.swing.JMenu usuarios;
    // End of variables declaration//GEN-END:variables

}
