package views;

import Datos.controladores.exceptions.IllegalOrphanException;
import Datos.entidades.Servicios;
import java.util.GregorianCalendar;

public class ViewGestorServicios extends javax.swing.JFrame {

    public ViewGestorServicios() {
        initComponents();
        setTitle("Gestor de servicios");

        // Get real month/year
        realDay = Calendar.getRealDay();
        realMonth = Calendar.getRealMonth();
        realYear = Calendar.getRealYear();
        currentMonth = realMonth;
        currentYear = realYear;

        // Set default value for status
        currentUpgradeStatus = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        labelUsuario = new javax.swing.JLabel();
        labelEmpresa = new javax.swing.JLabel();
        btnLogo = new components.MetroButton();
        pnlHambuergerButton = new javax.swing.JPanel();
        btnHamburgerMenu = new components.MetroButton();
        pnlHamburgerMenu = new javax.swing.JPanel();
        btnMenuCitas = new components.MetroButton();
        btnGestorEmpleados = new components.MetroButton();
        btnGestorServicios = new components.MetroButton();
        pnlButtonsSection = new javax.swing.JPanel();
        btnAgregarServicio = new components.MetroButton();
        btnModificarServicio = new components.MetroButton();
        btnEliminarServicio = new components.MetroButton();
        tfNombreServicio = new javax.swing.JTextField();
        labelNombreServicio = new javax.swing.JLabel();
        tfPrecio = new javax.swing.JTextField();
        tfDuracion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlScheduleSection = new javax.swing.JPanel();
        scrollPnlSchedule = new javax.swing.JScrollPane();
        tblSchedule = new components.table.TableSchedule(1, ViewMenuCitas.controlServicios.listar());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        /*pnlMain.setBackground(new java.awt.Color(153, 255, 204));*/
        pnlMain.setForeground(new java.awt.Color(153, 255, 204));

        pnlHeader.setBackground(new java.awt.Color(255, 255, 255));
        pnlHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlHeader.setForeground(new java.awt.Color(255, 255, 255));
        pnlHeader.setPreferredSize(new java.awt.Dimension(881, 50));

        labelUsuario.setBackground(new java.awt.Color(0, 0, 0));
        labelUsuario.setText("Herman Flores");

        labelEmpresa.setBackground(new java.awt.Color(0, 0, 0));
        labelEmpresa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelEmpresa.setText("Barber Brothers");

        btnLogo.setBackground(new java.awt.Color(255, 255, 255));
        btnLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barber_brothers_logo.png"))); // NOI18N
        btnLogo.setColorBorde(null);
        btnLogo.setColorHover(new java.awt.Color(255, 255, 255));
        btnLogo.setColorNormal(new java.awt.Color(255, 255, 255));
        btnLogo.setColorPressed(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
                pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelEmpresa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 441, Short.MAX_VALUE)
                                .addComponent(labelUsuario)
                                .addGap(104, 104, 104))
        );
        pnlHeaderLayout.setVerticalGroup(
                pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlHeaderLayout.createSequentialGroup()
                                .addContainerGap(13, Short.MAX_VALUE)
                                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                                                .addComponent(labelUsuario)
                                                .addGap(16, 16, 16))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                                                .addComponent(labelEmpresa)
                                                .addGap(11, 11, 11))))
                        .addGroup(pnlHeaderLayout.createSequentialGroup()
                                .addComponent(btnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
        );

        pnlHambuergerButton.setBackground(new java.awt.Color(255, 255, 255));
        pnlHambuergerButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlHambuergerButton.setForeground(new java.awt.Color(255, 255, 255));
        pnlHambuergerButton.setPreferredSize(new java.awt.Dimension(50, 50));

        btnHamburgerMenu.setBackground(new java.awt.Color(255, 255, 255));
        btnHamburgerMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu-dark.png"))); // NOI18N
        btnHamburgerMenu.setColorBorde(null);
        btnHamburgerMenu.setColorHover(new java.awt.Color(153, 153, 153));
        btnHamburgerMenu.setColorNormal(new java.awt.Color(255, 255, 255));
        btnHamburgerMenu.setColorPressed(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout pnlHambuergerButtonLayout = new javax.swing.GroupLayout(pnlHambuergerButton);
        pnlHambuergerButton.setLayout(pnlHambuergerButtonLayout);
        pnlHambuergerButtonLayout.setHorizontalGroup(
                pnlHambuergerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlHambuergerButtonLayout.createSequentialGroup()
                                .addComponent(btnHamburgerMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlHambuergerButtonLayout.setVerticalGroup(
                pnlHambuergerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlHambuergerButtonLayout.createSequentialGroup()
                                .addComponent(btnHamburgerMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlHamburgerMenu.setBackground(new java.awt.Color(255, 255, 255));
        pnlHamburgerMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlHamburgerMenu.setForeground(new java.awt.Color(255, 255, 255));
        pnlHamburgerMenu.setPreferredSize(new java.awt.Dimension(50, 2));

        /*btnMenuCitas.setBackground(new java.awt.Color(255, 255, 255));
        btnMenuCitas.setForeground(new java.awt.Color(0, 0, 0));*/
        btnMenuCitas.setText("C");
        btnMenuCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuCitasActionPerformed(evt);
            }
        });

        /*btnGestorEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        btnGestorEmpleados.setForeground(new java.awt.Color(0, 0, 0));*/
        btnGestorEmpleados.setText("E");
        btnGestorEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestorEmpleadosActionPerformed(evt);
            }
        });

        /*btnGestorServicios.setBackground(new java.awt.Color(255, 255, 255));
        btnGestorServicios.setForeground(new java.awt.Color(0, 0, 0));*/
        btnGestorServicios.setText("S");
        btnGestorServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestorServiciosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHamburgerMenuLayout = new javax.swing.GroupLayout(pnlHamburgerMenu);
        pnlHamburgerMenu.setLayout(pnlHamburgerMenuLayout);
        pnlHamburgerMenuLayout.setHorizontalGroup(
                pnlHamburgerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlHamburgerMenuLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlHamburgerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnMenuCitas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnGestorEmpleados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnGestorServicios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        pnlHamburgerMenuLayout.setVerticalGroup(
                pnlHamburgerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlHamburgerMenuLayout.createSequentialGroup()
                                .addComponent(btnMenuCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGestorEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGestorServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        /*pnlButtonsSection.setBackground(new java.awt.Color(204, 204, 204));*/
        pnlButtonsSection.setForeground(new java.awt.Color(204, 204, 204));

        btnAgregarServicio.setText("Agregar servicio");
        btnAgregarServicio.setColorBorde(null);
        btnAgregarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarServicioActionPerformed(evt);
            }
        });

        btnModificarServicio.setText("Modificar servicio");
        btnModificarServicio.setColorBorde(null);
        btnModificarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarServicioActionPerformed(evt);
            }
        });

        btnEliminarServicio.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminarServicio.setText("Eliminar servicio");
        btnEliminarServicio.setColorBorde(null);
        btnEliminarServicio.setColorHover(new java.awt.Color(102, 0, 0));
        btnEliminarServicio.setColorNormal(new java.awt.Color(204, 0, 0));
        btnEliminarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarServicioActionPerformed(evt);
            }
        });

        labelNombreServicio.setBackground(new java.awt.Color(0, 0, 0));
        labelNombreServicio.setText("Nombre del servicio");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Precio unitario");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Duracion (en minutos)");

        javax.swing.GroupLayout pnlButtonsSectionLayout = new javax.swing.GroupLayout(pnlButtonsSection);
        pnlButtonsSection.setLayout(pnlButtonsSectionLayout);
        pnlButtonsSectionLayout.setHorizontalGroup(
                pnlButtonsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlButtonsSectionLayout.createSequentialGroup()
                                .addGroup(pnlButtonsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlButtonsSectionLayout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(pnlButtonsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(tfNombreServicio)
                                                        .addComponent(labelNombreServicio)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2)
                                                        .addComponent(tfPrecio)
                                                        .addComponent(tfDuracion)))
                                        .addGroup(pnlButtonsSectionLayout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addGroup(pnlButtonsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnEliminarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnModificarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnAgregarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(75, Short.MAX_VALUE))
        );
        pnlButtonsSectionLayout.setVerticalGroup(
                pnlButtonsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlButtonsSectionLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(labelNombreServicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNombreServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                                .addComponent(btnAgregarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))
        );

        pnlScheduleSection.setBackground(new java.awt.Color(204, 204, 204));
        pnlScheduleSection.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlScheduleSection.setForeground(new java.awt.Color(204, 204, 204));

        scrollPnlSchedule.setViewportView(tblSchedule);
        tblSchedule.applyRender();

        javax.swing.GroupLayout pnlScheduleSectionLayout = new javax.swing.GroupLayout(pnlScheduleSection);
        pnlScheduleSection.setLayout(pnlScheduleSectionLayout);
        pnlScheduleSectionLayout.setHorizontalGroup(
                pnlScheduleSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlScheduleSectionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPnlSchedule)
                                .addContainerGap())
        );
        pnlScheduleSectionLayout.setVerticalGroup(
                pnlScheduleSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlScheduleSectionLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(scrollPnlSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
                pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlMainLayout.createSequentialGroup()
                                                .addComponent(pnlHambuergerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlMainLayout.createSequentialGroup()
                                                .addComponent(pnlHamburgerMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(pnlButtonsSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(pnlScheduleSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, 0))
        );
        pnlMainLayout.setVerticalGroup(
                pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pnlHambuergerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pnlHamburgerMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                                        .addComponent(pnlScheduleSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(pnlMainLayout.createSequentialGroup()
                                                .addComponent(pnlButtonsSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 29, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Falta implementar el controlador
     *
     * @param evt
     */
    private void btnEliminarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarServicioActionPerformed
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblSchedule.getModel();
        int row = tblSchedule.getSelectedRow();

        if (row != -1) {
            // Este es el id del servicio
            String value = model.getValueAt(row, 0).toString();

            if (!value.isEmpty()) {
                final int confirm = javax.swing.JOptionPane.showConfirmDialog(
                        this,
                        "Seguro que quiere eliminarlo?",
                        "Eliminar servicio",
                        javax.swing.JOptionPane.WARNING_MESSAGE,
                        javax.swing.JOptionPane.YES_NO_OPTION
                );

                if (confirm == javax.swing.JOptionPane.YES_OPTION) {
                    System.out.println("Eliminar servicio");

                    // Accion de eliminar servicio
                    try {
                        ViewMenuCitas.controlServicios.eliminar(Integer.valueOf(value));
                        model.removeRow(row);
                        javax.swing.JOptionPane.showMessageDialog(
                                this,
                                "Se elimino correctamente"
                        );
                    } catch (IllegalOrphanException e) {
                        javax.swing.JOptionPane.showMessageDialog(
                                this,
                                "No se pudo eliminar porque hay una cita para ese servicio!"
                        );

                    }

                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(
                        this,
                        "Error al eliminar el servicio"
                );
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "No se ha seleccionado ningun servicio!"
            );
        }
    }//GEN-LAST:event_btnEliminarServicioActionPerformed

    /**
     * Falta implementar el controlador
     *
     * @param evt
     */
    private void btnModificarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarServicioActionPerformed
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblSchedule.getModel();
        int row = tblSchedule.getSelectedRow();

        if (currentUpgradeStatus) {
            try {
                // if (servicioModificar != null) {
                // Luego ya que se selecciona y se modifica el servicio
                // se viene aqui para modificarlo en el controlador
                System.out.println("Modificar servicio - controlador");
                btnAgregarServicio.setEnabled(true);

                String nombre = tfNombreServicio.getText();
                double precio = Double.parseDouble(tfPrecio.getText());
                int duracion = Integer.parseInt(tfDuracion.getText());
                // Settearlo todo esto al 'servicioModificar'
                // Llamar al controlador
                if (!nombre.equals("")) {
                    String id = model.getValueAt(row, 0).toString();

                    Servicios servicioCorrecto = new Servicios();
                    for (Object obj : ViewMenuCitas.controlServicios.listar()) {
                        Servicios ser = (Servicios) obj;
                        if (ser.getIdServicio().equals(Integer.valueOf(id))) {
                            servicioCorrecto = ser;
                        }
                    }

                    servicioCorrecto.setNombre(nombre);
                    servicioCorrecto.setPrecioUnitario(precio);
                    servicioCorrecto.setDuracion(duracion);

                    ViewMenuCitas.controlServicios.modificar(servicioCorrecto);

                    currentUpgradeStatus = false;
                    tfNombreServicio.setText("");
                    tfPrecio.setText("");
                    tfDuracion.setText("");

                    javax.swing.JOptionPane.showMessageDialog(
                            this,
                            "Se modifico correctamente"
                    );
                    ViewGestorServicios vgs = new ViewGestorServicios();
                    vgs.setVisible(true);
                    this.dispose();
                } else {
                    javax.swing.JOptionPane.showMessageDialog(
                            this,
                            "Campos vacios!, por favor llenelos"
                    );
                }
            } catch (NumberFormatException ex) {
                javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Solo se admiten numeros en el precio y duracion!"
                );
            }
        } else {
            // Primero se selecciona el servicio de la tabla
            if (row != -1) {
                System.out.println("Modificar servicio - seleccion");
                btnAgregarServicio.setEnabled(false);
                String id = model.getValueAt(row, 0).toString();

                // Aqui conseguir al servicio por id
                // Aqui settear el servicio con esto
                // servicioModificar = ***;
                // Aqui remplazar el servicio conseguido
                String nombre = (String) model.getValueAt(row, 1);
                double precio = (double) model.getValueAt(row, 2);
                int duracion = (int) model.getValueAt(row, 3);

                currentUpgradeStatus = true;
                tfNombreServicio.setText(nombre);
                tfPrecio.setText("" + precio);
                tfDuracion.setText("" + duracion);
            } else {
                javax.swing.JOptionPane.showMessageDialog(
                        this,
                        "No se ha seleccionado ningun servicio!"
                );
            }
        }
    }//GEN-LAST:event_btnModificarServicioActionPerformed

    /**
     * Falta implementar el controlador
     *
     * @param evt
     */
    private void btnAgregarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarServicioActionPerformed
        System.out.println("Agregar servicio");

        try {
            String nombre = tfNombreServicio.getText();
            double precio = Double.parseDouble(tfPrecio.getText());
            int duracion = Integer.parseInt(tfDuracion.getText());

            if (!nombre.equals("")) {
                System.out.println("Nombre: " + nombre + ", Precio: " + precio + ", Duracion: " + duracion);

                // Llamar al controlador
                ViewMenuCitas.controlServicios.agregar(ViewMenuCitas.controlServicios.listar().size(),
                        nombre,
                        precio,
                        duracion);

                tfNombreServicio.setText("");
                tfPrecio.setText("");
                tfDuracion.setText("");

                javax.swing.JOptionPane.showMessageDialog(
                        this,
                        "Se agrego correctamente"
                );

                ViewGestorServicios vgs = new ViewGestorServicios();
                vgs.setVisible(true);
                this.dispose();

            } else {
                javax.swing.JOptionPane.showMessageDialog(
                        this,
                        "Nombre vacio!"
                );
            }
        } catch (NumberFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Solo se admiten numeros en el precio y duracion!"
            );
        }
    }//GEN-LAST:event_btnAgregarServicioActionPerformed

    private void btnMenuCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuCitasActionPerformed
        ViewMenuCitas vmc = new ViewMenuCitas();
        vmc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuCitasActionPerformed

    private void btnGestorEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestorEmpleadosActionPerformed
        ViewGestorEmpleados vge = new ViewGestorEmpleados();
        vge.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGestorEmpleadosActionPerformed

    private void btnGestorServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestorServiciosActionPerformed
        // Aqui nada porque ya andamos aqui
    }//GEN-LAST:event_btnGestorServiciosActionPerformed

    public static class Calendar {

        private static GregorianCalendar c = new GregorianCalendar();

        public static int getRealDay() {
            return c.get(GregorianCalendar.DAY_OF_MONTH);
        }

        public static int getRealMonth() {
            return c.get(GregorianCalendar.MONTH);
        }

        public static int getRealYear() {
            return c.get(GregorianCalendar.YEAR);
        }

        public static int getNod(int year, int month) {
            GregorianCalendar calendar = new GregorianCalendar(year, month, 1);
            return calendar.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        }

        public static int getSom(int year, int month) {
            GregorianCalendar calendar = new GregorianCalendar(year, month, 1);
            return calendar.get(GregorianCalendar.DAY_OF_WEEK);
        }
    }

    // private Servicio servicioModificar = null;
    private boolean currentUpgradeStatus;
    private int realYear, realMonth, realDay, currentYear, currentMonth;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.MetroButton btnAgregarServicio;
    private components.MetroButton btnEliminarServicio;
    private components.MetroButton btnGestorEmpleados;
    private components.MetroButton btnGestorServicios;
    private components.MetroButton btnHamburgerMenu;
    private components.MetroButton btnLogo;
    private components.MetroButton btnMenuCitas;
    private components.MetroButton btnModificarServicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelEmpresa;
    private javax.swing.JLabel labelNombreServicio;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel pnlButtonsSection;
    private javax.swing.JPanel pnlHambuergerButton;
    private javax.swing.JPanel pnlHamburgerMenu;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlScheduleSection;
    private javax.swing.JScrollPane scrollPnlSchedule;
    private components.table.TableSchedule tblSchedule;
    private javax.swing.JTextField tfDuracion;
    private javax.swing.JTextField tfNombreServicio;
    private javax.swing.JTextField tfPrecio;
    // End of variables declaration//GEN-END:variables
}
