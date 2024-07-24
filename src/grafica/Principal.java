package grafica;

import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import logica.Contacto;
import logica.Fecha;
import logica.Tarea;
import logica.ListaContactos;
import logica.ListaTareas;
import persistencia.Registro;

public class Principal extends javax.swing.JFrame {

    int mouseX, mouseY, mouseXEnPantalla, mouseYEnPantalla;
    public static ListaTareas listaTareas;
    public static ListaContactos listaContactos;
    String defaultExceptionMessage;

    public Principal() {
        initComponents();
        defaultExceptionMessage = "Entrada no válida";
        listaTareas = Registro.getInstancia().getTareas();
        DefaultTableModel modelo = (DefaultTableModel) tblTareas.getModel();
        for (Tarea t : listaTareas.getLista()) {
            modelo.addRow(new Object[]{t.getNombre(), t.traducirPrioridad(), t.getContacto().getNombre(), t.getVencimiento().toString(), t.traducirPendiente()});
        }
        tblTareas.setModel(modelo);
        listaContactos = Registro.getInstancia().getContactos();
        for (Contacto c : listaContactos.getLista()) {
            cbxContactos.addItem(c.getNombre());
            cbxBorrarContacto.addItem(c.getNombre());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        pnlBarra = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlMinimizar = new javax.swing.JPanel();
        lblMinimizar = new javax.swing.JLabel();
        pnlCerrar = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        pnlTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTareas = new javax.swing.JTable();
        pnlBorrarTarea = new javax.swing.JPanel();
        lblBorrarTarea = new javax.swing.JLabel();
        cbxFiltro = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        pnlMarcarRealizada = new javax.swing.JPanel();
        lblMarcarRealizada = new javax.swing.JLabel();
        pnlSubtareas = new javax.swing.JPanel();
        lblSubtareas = new javax.swing.JLabel();
        pnlTareas = new javax.swing.JPanel();
        lblTareas = new javax.swing.JLabel();
        pnlDetalleContacto = new javax.swing.JPanel();
        lblDetalleContacto = new javax.swing.JLabel();
        pnlManejar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtNombreTarea = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbxPrioridad = new javax.swing.JComboBox<>();
        pnlAgregarTarea = new javax.swing.JPanel();
        lblAgregarTarea = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbxContactos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbxDia = new javax.swing.JComboBox<>();
        cbxMes = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtNombreContacto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        pnlAgregarContacto = new javax.swing.JPanel();
        lblAgregarContacto = new javax.swing.JLabel();
        cbxBorrarContacto = new javax.swing.JComboBox<>();
        pnlBorrarContacto = new javax.swing.JPanel();
        lblBorrarContacto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda");
        setUndecorated(true);
        setResizable(false);

        background.setBackground(java.awt.Color.white);
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBarra.setBackground(java.awt.Color.gray);
        pnlBarra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlBarraMouseDragged(evt);
            }
        });
        pnlBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlBarraMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        jLabel1.setText("Agenda");

        javax.swing.GroupLayout pnlBarraLayout = new javax.swing.GroupLayout(pnlBarra);
        pnlBarra.setLayout(pnlBarraLayout);
        pnlBarraLayout.setHorizontalGroup(
            pnlBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarraLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(625, Short.MAX_VALUE))
        );
        pnlBarraLayout.setVerticalGroup(
            pnlBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(pnlBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 30));

        pnlMinimizar.setBackground(java.awt.Color.gray);
        pnlMinimizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMinimizar.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimizar.setText("-");
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseExited(evt);
            }
        });
        pnlMinimizar.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        background.add(pnlMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 30, 30));

        pnlCerrar.setBackground(java.awt.Color.gray);
        pnlCerrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCerrar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setText("x");
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCerrarMouseExited(evt);
            }
        });
        pnlCerrar.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        background.add(pnlCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 30, 30));

        pnlTabla.setBackground(new java.awt.Color(153, 153, 153));

        tblTareas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tblTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Prioridad", "Contacto", "Fecha", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTareas.setAutoscrolls(false);
        tblTareas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tblTareas);

        pnlBorrarTarea.setBackground(java.awt.Color.gray);

        lblBorrarTarea.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblBorrarTarea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBorrarTarea.setText("Borrar tarea");
        lblBorrarTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBorrarTareaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBorrarTareaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBorrarTareaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlBorrarTareaLayout = new javax.swing.GroupLayout(pnlBorrarTarea);
        pnlBorrarTarea.setLayout(pnlBorrarTareaLayout);
        pnlBorrarTareaLayout.setHorizontalGroup(
            pnlBorrarTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBorrarTareaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBorrarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlBorrarTareaLayout.setVerticalGroup(
            pnlBorrarTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBorrarTarea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cbxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas", "Pendientes", "Realizadas" }));
        cbxFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFiltroActionPerformed(evt);
            }
        });

        jLabel14.setText("Filtrar por:");

        pnlMarcarRealizada.setBackground(java.awt.Color.gray);

        lblMarcarRealizada.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblMarcarRealizada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMarcarRealizada.setText("Marcar como realizada");
        lblMarcarRealizada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMarcarRealizadaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMarcarRealizadaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMarcarRealizadaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlMarcarRealizadaLayout = new javax.swing.GroupLayout(pnlMarcarRealizada);
        pnlMarcarRealizada.setLayout(pnlMarcarRealizadaLayout);
        pnlMarcarRealizadaLayout.setHorizontalGroup(
            pnlMarcarRealizadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMarcarRealizada, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        pnlMarcarRealizadaLayout.setVerticalGroup(
            pnlMarcarRealizadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMarcarRealizada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlSubtareas.setBackground(java.awt.Color.gray);

        lblSubtareas.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblSubtareas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtareas.setText("Subtareas");
        lblSubtareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSubtareasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSubtareasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSubtareasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlSubtareasLayout = new javax.swing.GroupLayout(pnlSubtareas);
        pnlSubtareas.setLayout(pnlSubtareasLayout);
        pnlSubtareasLayout.setHorizontalGroup(
            pnlSubtareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSubtareas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );
        pnlSubtareasLayout.setVerticalGroup(
            pnlSubtareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSubtareas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlTareas.setBackground(java.awt.Color.gray);

        lblTareas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTareas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTareas.setText("TAREAS");
        lblTareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTareasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTareasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTareasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlTareasLayout = new javax.swing.GroupLayout(pnlTareas);
        pnlTareas.setLayout(pnlTareasLayout);
        pnlTareasLayout.setHorizontalGroup(
            pnlTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlTareasLayout.setVerticalGroup(
            pnlTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTareas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
        );

        pnlDetalleContacto.setBackground(java.awt.Color.gray);

        lblDetalleContacto.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblDetalleContacto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDetalleContacto.setText("Detalle contacto");
        lblDetalleContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDetalleContactoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDetalleContactoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDetalleContactoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlDetalleContactoLayout = new javax.swing.GroupLayout(pnlDetalleContacto);
        pnlDetalleContacto.setLayout(pnlDetalleContactoLayout);
        pnlDetalleContactoLayout.setHorizontalGroup(
            pnlDetalleContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDetalleContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlDetalleContactoLayout.setVerticalGroup(
            pnlDetalleContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDetalleContacto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlTablaLayout = new javax.swing.GroupLayout(pnlTabla);
        pnlTabla.setLayout(pnlTablaLayout);
        pnlTablaLayout.setHorizontalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addGroup(pnlTablaLayout.createSequentialGroup()
                        .addComponent(pnlTareas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTablaLayout.createSequentialGroup()
                                .addComponent(pnlDetalleContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlMarcarRealizada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlSubtareas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlBorrarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTablaLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        pnlTablaLayout.setVerticalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBorrarTarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMarcarRealizada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSubtareas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTareas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDetalleContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(7, 7, 7))
        );

        background.add(pnlTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 500, 520));

        pnlManejar.setBackground(java.awt.Color.lightGray);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText(" Nueva Tarea");

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Prioridad");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nombre");

        cbxPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta", "Media", "Baja" }));

        pnlAgregarTarea.setBackground(java.awt.Color.gray);
        pnlAgregarTarea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAgregarTarea.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAgregarTarea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregarTarea.setText("+");
        lblAgregarTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarTareaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAgregarTareaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAgregarTareaMouseExited(evt);
            }
        });
        pnlAgregarTarea.add(lblAgregarTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Contacto");

        cbxContactos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Dia");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Mes");

        cbxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cbxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMesActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Año");

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText(" Nuevo Contacto");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Nombre");

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Mail");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Número");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Dirección");

        pnlAgregarContacto.setBackground(java.awt.Color.gray);
        pnlAgregarContacto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAgregarContacto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAgregarContacto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregarContacto.setText("Agregar");
        lblAgregarContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarContactoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAgregarContactoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAgregarContactoMouseExited(evt);
            }
        });
        pnlAgregarContacto.add(lblAgregarContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 20));

        pnlBorrarContacto.setBackground(java.awt.Color.gray);

        lblBorrarContacto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBorrarContacto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBorrarContacto.setText("Borrar contacto");
        lblBorrarContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBorrarContactoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBorrarContactoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBorrarContactoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlBorrarContactoLayout = new javax.swing.GroupLayout(pnlBorrarContacto);
        pnlBorrarContacto.setLayout(pnlBorrarContactoLayout);
        pnlBorrarContactoLayout.setHorizontalGroup(
            pnlBorrarContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBorrarContacto, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnlBorrarContactoLayout.setVerticalGroup(
            pnlBorrarContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBorrarContacto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlManejarLayout = new javax.swing.GroupLayout(pnlManejar);
        pnlManejar.setLayout(pnlManejarLayout);
        pnlManejarLayout.setHorizontalGroup(
            pnlManejarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManejarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlManejarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlManejarLayout.createSequentialGroup()
                        .addComponent(cbxBorrarContacto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlBorrarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlManejarLayout.createSequentialGroup()
                        .addGroup(pnlManejarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlManejarLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(pnlManejarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlManejarLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbxContactos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnlManejarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pnlManejarLayout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtNombreTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlManejarLayout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cbxPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pnlManejarLayout.createSequentialGroup()
                                        .addGroup(pnlManejarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlManejarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(cbxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(pnlManejarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pnlAgregarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2))))
                            .addComponent(jLabel5)
                            .addGroup(pnlManejarLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(pnlManejarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlManejarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(pnlManejarLayout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtNumero))
                                        .addGroup(pnlManejarLayout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtDireccion))
                                        .addGroup(pnlManejarLayout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtMail))
                                        .addGroup(pnlManejarLayout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtNombreContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(pnlAgregarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlManejarLayout.setVerticalGroup(
            pnlManejarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManejarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlManejarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombreTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlManejarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlManejarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxContactos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlManejarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlManejarLayout.createSequentialGroup()
                        .addGroup(pnlManejarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlManejarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnlAgregarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlManejarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNombreContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlManejarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlManejarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlManejarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlAgregarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(pnlManejarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlBorrarContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxBorrarContacto))
                .addContainerGap())
        );

        background.add(pnlManejar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 250, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBarraMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_pnlBarraMousePressed

    private void pnlBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBarraMouseDragged
        mouseXEnPantalla = evt.getXOnScreen();
        mouseYEnPantalla = evt.getYOnScreen();
        this.setLocation(mouseXEnPantalla - mouseX, mouseYEnPantalla - mouseY);
    }//GEN-LAST:event_pnlBarraMouseDragged

    private void lblMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseEntered
        pnlMinimizar.setBackground(Color.lightGray);
    }//GEN-LAST:event_lblMinimizarMouseEntered

    private void lblMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseExited
        pnlMinimizar.setBackground(Color.gray);
    }//GEN-LAST:event_lblMinimizarMouseExited

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseEntered
        pnlCerrar.setBackground(Color.red);
        lblCerrar.setForeground(Color.white);
    }//GEN-LAST:event_lblCerrarMouseEntered

    private void lblCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseExited
        pnlCerrar.setBackground(Color.gray);
        lblCerrar.setForeground(Color.black);
    }//GEN-LAST:event_lblCerrarMouseExited

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblAgregarTareaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarTareaMouseExited
        pnlAgregarTarea.setBackground(Color.gray);
    }//GEN-LAST:event_lblAgregarTareaMouseExited

    private void lblAgregarTareaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarTareaMouseEntered
        pnlAgregarTarea.setBackground(Color.white);
    }//GEN-LAST:event_lblAgregarTareaMouseEntered

    private void lblAgregarTareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarTareaMouseClicked
        try {
            for (Tarea t : listaTareas.getLista()) {
                if (txtNombreTarea.getText().equals(t.getNombre())) {
                    defaultExceptionMessage = "Ya existe una tarea con ese nombre";
                    throw new Exception();
                }
            }
            String nombre;

            if (txtNombreTarea.getText().equals("") == false) {
                nombre = txtNombreTarea.getText();
            } else {
                throw new Exception();
            }

            int prioridad = Tarea.traducirPrioridad(cbxPrioridad.getSelectedItem().toString());

            int dia = Integer.valueOf(cbxDia.getSelectedItem().toString());
            int mes = Integer.valueOf(cbxMes.getSelectedItem().toString());
            int anio = Integer.valueOf(txtAnio.getText());
            Fecha vencimiento = new Fecha(dia, mes, anio);

            Contacto contacto = new Contacto();
            if (cbxContactos.getSelectedItem().toString().equals("Ninguno") == false) {
                String nombreContacto = cbxContactos.getSelectedItem().toString();
                for (Contacto c : listaContactos.getLista()) {
                    if (c.getNombre().equals(nombreContacto)) {
                        contacto = c;
                    }
                }
            }
            Tarea tarea = new Tarea(nombre, prioridad, vencimiento, true, contacto);
            listaTareas.agregar(tarea);
            Registro.getInstancia().setTareas(listaTareas);
            DefaultTableModel modelo = (DefaultTableModel) tblTareas.getModel();
            modelo.addRow(new Object[]{tarea.getNombre(), tarea.traducirPrioridad(), tarea.getContacto().getNombre(), tarea.getVencimiento().toString(), "Pendiente"});
            tblTareas.setModel(modelo);
            System.out.println(listaTareas);
            txtNombreTarea.setText(null);
            txtAnio.setText(null);
            cbxMes.setSelectedIndex(0);
            cbxDia.setSelectedIndex(0);
            cbxContactos.setSelectedIndex(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, defaultExceptionMessage);
            defaultExceptionMessage = "Entrada no válida";
            System.out.println(e);
        }
    }//GEN-LAST:event_lblAgregarTareaMouseClicked

    private void cbxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMesActionPerformed
        int[] mesesDe30 = {4, 6, 9, 11};
        int[] mesesDe31 = {1, 3, 5, 7, 8, 10, 12};
        for (int n : mesesDe30) {
            if (Integer.valueOf(cbxMes.getSelectedItem().toString()) == n) {
                if (cbxDia.getComponentCount() != 30) {
                    cbxDia.removeAllItems();
                    for (int i = 1; i <= 30; i++) {
                        cbxDia.addItem(String.valueOf(i));
                    }
                }
            }
        }
        for (int n : mesesDe31) {
            if (Integer.valueOf(cbxMes.getSelectedItem().toString()) == n) {
                cbxDia.removeAllItems();
                for (int i = 1; i <= 31; i++) {
                    cbxDia.addItem(String.valueOf(i));
                }
            }
        }
        if (Integer.valueOf(cbxMes.getSelectedItem().toString()) == 2) {
            cbxDia.removeAllItems();
            for (int i = 1; i <= 29; i++) {
                cbxDia.addItem(String.valueOf(i));
            }
        }
    }//GEN-LAST:event_cbxMesActionPerformed

    private void lblBorrarTareaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBorrarTareaMouseEntered
        pnlBorrarTarea.setBackground(Color.lightGray);
    }//GEN-LAST:event_lblBorrarTareaMouseEntered

    private void lblBorrarTareaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBorrarTareaMouseExited
        pnlBorrarTarea.setBackground(Color.gray);
    }//GEN-LAST:event_lblBorrarTareaMouseExited

    private void lblBorrarTareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBorrarTareaMouseClicked
        try {
            Tarea tareaAEliminar = null;
            int row = tblTareas.getSelectedRow();
            String nombre = tblTareas.getValueAt(row, 0).toString();
            DefaultTableModel modelo = null;
            for (Tarea t : listaTareas.getLista()) {
                if (t.getNombre().equals(tblTareas.getValueAt(row, 0).toString())) {
                    tareaAEliminar = t;
                }
            }
            listaTareas.eliminar(tareaAEliminar);
            Registro.getInstancia().setTareas(listaTareas);
            modelo = (DefaultTableModel) tblTareas.getModel();
            modelo.removeRow(row);
            tblTareas.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(rootPane, "Selecciona una tarea");
        }
    }//GEN-LAST:event_lblBorrarTareaMouseClicked

    private void cbxFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFiltroActionPerformed
        try {
            DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nombre", "Prioridad", "Contacto", "Fecha", "Estado"}, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            switch (cbxFiltro.getSelectedItem().toString()) {
                case "Todas":
                    for (Tarea t : listaTareas.getLista()) {
                        modelo.addRow(new Object[]{t.getNombre(), t.traducirPrioridad(), t.getContacto().getNombre(), t.getVencimiento(), t.traducirPendiente()});
                    }
                    break;
                case "Pendientes":
                    for (Tarea t : listaTareas.getLista()) {
                        if (t.isPendiente()) {
                            modelo.addRow(new Object[]{t.getNombre(), t.traducirPrioridad(), t.getContacto().getNombre(), t.getVencimiento().toString(), t.traducirPendiente()});
                        }
                    }
                    break;
                case "Realizadas":
                    for (Tarea t : listaTareas.getLista()) {
                        if (t.isPendiente() == false) {
                            modelo.addRow(new Object[]{t.getNombre(), t.traducirPrioridad(), t.getContacto().getNombre(), t.getVencimiento().toString(), t.traducirPendiente()});
                        }
                    }
                    break;
            }
            tblTareas.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_cbxFiltroActionPerformed

    private void lblMarcarRealizadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMarcarRealizadaMouseClicked
        try {
            DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nombre", "Prioridad", "Contacto", "Fecha", "Estado"}, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            int row = tblTareas.getSelectedRow();
            String nom = tblTareas.getValueAt(row, 0).toString();
            for (Tarea t : listaTareas.getLista()) {
                if (t.getNombre().equals(nom)) {
                    t.setPendiente(false);
                }
            }
            Registro.getInstancia().setTareas(listaTareas);
            tblTareas.removeAll();
            for (Tarea t : listaTareas.getLista()) {
                modelo.addRow(new Object[]{t.getNombre(), t.traducirPrioridad(), t.getContacto().getNombre(), t.getVencimiento().toString(), t.traducirPendiente()});
            }
            tblTareas.setModel(modelo);
            cbxFiltro.setSelectedIndex(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, defaultExceptionMessage);
        }
    }//GEN-LAST:event_lblMarcarRealizadaMouseClicked

    private void lblMarcarRealizadaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMarcarRealizadaMouseEntered
        pnlMarcarRealizada.setBackground(Color.lightGray);
    }//GEN-LAST:event_lblMarcarRealizadaMouseEntered

    private void lblMarcarRealizadaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMarcarRealizadaMouseExited
        pnlMarcarRealizada.setBackground(Color.gray);
    }//GEN-LAST:event_lblMarcarRealizadaMouseExited
    
    private void lblSubtareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSubtareasMouseClicked
        try {
            DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nombre", "Prioridad", "Fecha", "Estado"}, 0){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            int row = tblTareas.getSelectedRow();
            String nom = tblTareas.getValueAt(row, 0).toString();
            Tarea tarea = new Tarea();
            for (Tarea t : listaTareas.getLista()) {
                if (t.getNombre().equals(nom)) {
                    tarea = t;
                }
            }
            if (tarea.getSubtareas().equals(new ArrayList<>()) == false) {
                for (Tarea t : tarea.getSubtareas()) {
                    modelo.addRow(new Object[]{t.getNombre(), t.traducirPrioridad(), t.getVencimiento(), t.traducirPendiente()});
                }
                tblTareas.setModel(modelo);
            }else{
                defaultExceptionMessage = "No hay subtareas";
                throw new Exception();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, defaultExceptionMessage);
            defaultExceptionMessage = "Entrada no válida";
        }
    }//GEN-LAST:event_lblSubtareasMouseClicked

    private void lblSubtareasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSubtareasMouseEntered
        pnlSubtareas.setBackground(Color.lightGray);
    }//GEN-LAST:event_lblSubtareasMouseEntered

    private void lblSubtareasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSubtareasMouseExited
        pnlSubtareas.setBackground(Color.gray);
    }//GEN-LAST:event_lblSubtareasMouseExited

    private void lblTareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTareasMouseClicked
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nombre", "Prioridad", "Contacto", "Fecha", "Estado"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        for (Tarea t : listaTareas.getLista()) {
            modelo.addRow(new Object[]{t.getNombre(), t.traducirPrioridad(), t.getContacto().getNombre(), t.getVencimiento().toString(), t.traducirPendiente()});
        }
        cbxFiltro.setSelectedIndex(0);
        tblTareas.setModel(modelo);
    }//GEN-LAST:event_lblTareasMouseClicked

    private void lblTareasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTareasMouseEntered
        pnlTareas.setBackground(Color.lightGray);
    }//GEN-LAST:event_lblTareasMouseEntered

    private void lblTareasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTareasMouseExited
        pnlTareas.setBackground(Color.gray);
    }//GEN-LAST:event_lblTareasMouseExited

    private void lblDetalleContactoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDetalleContactoMouseClicked
        try {
            DefaultTableModel modelo;
            modelo = new DefaultTableModel(new Object[]{"Nombre", "Mail", "Número", "Dirección"}, 0){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            int row = tblTareas.getSelectedRow();
            String nombreContacto = tblTareas.getValueAt(row, 2).toString();
            String nombreTarea = tblTareas.getValueAt(row, 0).toString();
            Contacto contacto;
            Tarea tarea;
            if (nombreContacto.equals("Ninguno") == false) {
                contacto = new Contacto();
                tarea = new Tarea();
                for (Tarea t : listaTareas.getLista()) {
                    if (t.getNombre().equals(nombreTarea)) {
                        contacto = t.getContacto();
                    }
                }
                modelo.addRow(new Object[]{contacto.getNombre(), contacto.getMail(), contacto.getNumero(), contacto.getDireccion()});
                tblTareas.setModel(modelo);
            } else {
                defaultExceptionMessage = "La tarea no tiene contacto";
                throw new Exception();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, defaultExceptionMessage);
            defaultExceptionMessage = "Entrada no válida";
        }
    }//GEN-LAST:event_lblDetalleContactoMouseClicked

    private void lblDetalleContactoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDetalleContactoMouseEntered
        pnlDetalleContacto.setBackground(Color.lightGray);
    }//GEN-LAST:event_lblDetalleContactoMouseEntered

    private void lblDetalleContactoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDetalleContactoMouseExited
        pnlDetalleContacto.setBackground(Color.gray);
    }//GEN-LAST:event_lblDetalleContactoMouseExited

    private void lblAgregarContactoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarContactoMouseExited
        pnlAgregarContacto.setBackground(Color.gray);
    }//GEN-LAST:event_lblAgregarContactoMouseExited

    private void lblAgregarContactoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarContactoMouseEntered
        pnlAgregarContacto.setBackground(Color.white);
    }//GEN-LAST:event_lblAgregarContactoMouseEntered

    private void lblAgregarContactoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarContactoMouseClicked
        try {
            for (Contacto c : listaContactos.getLista()) {
                if (txtNombreContacto.getText().equals(c.getNombre())) {
                    defaultExceptionMessage = "Ya existe un contacto con ese nombre";
                }
            }
            JTextField[] txts = {txtNombreContacto, txtMail, txtNumero, txtDireccion};
            for (JTextField t : txts) {
                if (t.getText().equals("")) {
                    throw new Exception();
                }
            }
            String nombre = txtNombreContacto.getText();
            if (nombre.equals("Ninguno")) throw new Exception();
            for (Contacto con : listaContactos.getLista()) {
                if (nombre.equals(con.getNombre())) {
                    throw new Exception();
                }
            }
            String mail = txtMail.getText();
            int numero = Integer.valueOf(txtNumero.getText());
            String direccion = txtDireccion.getText();
            
            Contacto contacto = new Contacto(nombre, mail, numero, direccion);
            listaContactos.agregar(contacto);
            Registro.getInstancia().setContactos(listaContactos);
            cbxContactos.addItem(contacto.getNombre());
            for (JTextField txt : txts) {
                txt.setText(null);
            }
            cbxBorrarContacto.addItem(nombre);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, defaultExceptionMessage);
            defaultExceptionMessage = "Entrada no válida";
        }
    }//GEN-LAST:event_lblAgregarContactoMouseClicked

    private void lblBorrarContactoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBorrarContactoMouseClicked
        try {
            Contacto contacto = new Contacto();
            for(Contacto con : listaContactos.getLista()){
                if(con.getNombre().equals(cbxBorrarContacto.getSelectedItem().toString())){
                    contacto = con;
                    cbxBorrarContacto.removeItem(con.getNombre());
                    listaContactos.eliminar(contacto);
                    Registro.getInstancia().setContactos(listaContactos);
                    cbxContactos.removeItem(con.getNombre());
                }
            }
        }catch (Exception e) {
            
        }
    }//GEN-LAST:event_lblBorrarContactoMouseClicked

    private void lblBorrarContactoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBorrarContactoMouseEntered
        pnlBorrarContacto.setBackground(Color.white);
    }//GEN-LAST:event_lblBorrarContactoMouseEntered

    private void lblBorrarContactoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBorrarContactoMouseExited
        pnlBorrarContacto.setBackground(Color.gray);
    }//GEN-LAST:event_lblBorrarContactoMouseExited

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JComboBox<String> cbxBorrarContacto;
    private javax.swing.JComboBox<String> cbxContactos;
    private javax.swing.JComboBox<String> cbxDia;
    private javax.swing.JComboBox<String> cbxFiltro;
    private javax.swing.JComboBox<String> cbxMes;
    private javax.swing.JComboBox<String> cbxPrioridad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAgregarContacto;
    private javax.swing.JLabel lblAgregarTarea;
    private javax.swing.JLabel lblBorrarContacto;
    private javax.swing.JLabel lblBorrarTarea;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblDetalleContacto;
    private javax.swing.JLabel lblMarcarRealizada;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblSubtareas;
    private javax.swing.JLabel lblTareas;
    private javax.swing.JPanel pnlAgregarContacto;
    private javax.swing.JPanel pnlAgregarTarea;
    private javax.swing.JPanel pnlBarra;
    private javax.swing.JPanel pnlBorrarContacto;
    private javax.swing.JPanel pnlBorrarTarea;
    private javax.swing.JPanel pnlCerrar;
    private javax.swing.JPanel pnlDetalleContacto;
    private javax.swing.JPanel pnlManejar;
    private javax.swing.JPanel pnlMarcarRealizada;
    private javax.swing.JPanel pnlMinimizar;
    private javax.swing.JPanel pnlSubtareas;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JPanel pnlTareas;
    private javax.swing.JTable tblTareas;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombreContacto;
    private javax.swing.JTextField txtNombreTarea;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables

}
