package views;

import Datos.entidades.Empleado;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Optional;

public class ViewGestorEmpleados extends javax.swing.JFrame {

    public ViewGestorEmpleados() {
        initComponents();
        setTitle("Gestor de empleados");

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
        btnAgregarEmpleado = new components.MetroButton();
        btnModificarEmpleado = new components.MetroButton();
        btnEliminarEmpleado = new components.MetroButton();
        tfNombreEmpleado = new javax.swing.JTextField();
        jbTipoEmpleado = new javax.swing.JComboBox<>();
        labelNombreEmpleado = new javax.swing.JLabel();
        labelTipoEmpleado = new javax.swing.JLabel();
        pnlScheduleSection = new javax.swing.JPanel();
        scrollPnlSchedule = new javax.swing.JScrollPane();
        tblSchedule = new components.table.TableSchedule(0, ViewMenuCitas.controlEmpleados.listar());

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

        btnAgregarEmpleado.setText("Agregar empleado");
        btnAgregarEmpleado.setColorBorde(null);
        btnAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpleadoActionPerformed(evt);
            }
        });

        btnModificarEmpleado.setText("Modificar empleado");
        btnModificarEmpleado.setColorBorde(null);
        btnModificarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEmpleadoActionPerformed(evt);
            }
        });

        btnEliminarEmpleado.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminarEmpleado.setText("Eliminar empleado");
        btnEliminarEmpleado.setColorBorde(null);
        btnEliminarEmpleado.setColorHover(new java.awt.Color(102, 0, 0));
        btnEliminarEmpleado.setColorNormal(new java.awt.Color(204, 0, 0));
        btnEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleadoActionPerformed(evt);
            }
        });

        tfNombreEmpleado.setText("");

        jbTipoEmpleado.setModel(
                new javax.swing.DefaultComboBoxModel<>(
                        new String[]{
                            "Barbero",
                            "Administrador"
                        }
                )
        );

        labelNombreEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        labelNombreEmpleado.setText("Nombre del empleado");

        labelTipoEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        labelTipoEmpleado.setText("Tipo de empleado");

        javax.swing.GroupLayout pnlButtonsSectionLayout = new javax.swing.GroupLayout(pnlButtonsSection);
        pnlButtonsSection.setLayout(pnlButtonsSectionLayout);
        pnlButtonsSectionLayout.setHorizontalGroup(
                pnlButtonsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlButtonsSectionLayout.createSequentialGroup()
                                .addGroup(pnlButtonsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlButtonsSectionLayout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(pnlButtonsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tfNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jbTipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labelNombreEmpleado)
                                                        .addComponent(labelTipoEmpleado)))
                                        .addGroup(pnlButtonsSectionLayout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addGroup(pnlButtonsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnModificarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(75, Short.MAX_VALUE))
        );
        pnlButtonsSectionLayout.setVerticalGroup(
                pnlButtonsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlButtonsSectionLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(labelNombreEmpleado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(labelTipoEmpleado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbTipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                                .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                                .addGap(0, 27, Short.MAX_VALUE))))
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
    private void btnEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoActionPerformed
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblSchedule.getModel();
        int row = tblSchedule.getSelectedRow();

        if (row != -1) {
            // Este es el id del empleado
            String value = model.getValueAt(row, 0).toString();

            if (!value.isEmpty()) {
                final int confirm = javax.swing.JOptionPane.showConfirmDialog(
                        this,
                        "Seguro que quiere eliminarlo?",
                        "Eliminar empleado",
                        javax.swing.JOptionPane.WARNING_MESSAGE,
                        javax.swing.JOptionPane.YES_NO_OPTION
                );

                if (confirm == javax.swing.JOptionPane.YES_OPTION) {
                    System.out.println("Eliminar empleado");

                    try {
                        ViewMenuCitas.controlEmpleados.eliminar(Integer.valueOf(value));
                        // Accion de eliminar empleado
                        model.removeRow(row);

                        javax.swing.JOptionPane.showMessageDialog(
                                this,
                                "Se elimino correctamente"
                        );
                    } catch(Exception e) {
                        javax.swing.JOptionPane.showMessageDialog(
                                this,
                                "No se pudo eliminar porque hay una cita para ese empleado!"
                        );
                    }

                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(
                        this,
                        "Error al eliminar el empleado"
                );
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "No se ha seleccionado ningun empleado!"
            );
        }
    }//GEN-LAST:event_btnEliminarEmpleadoActionPerformed

    /**
     * Falta implementar el controlador
     *
     * @param evt
     */
    private void btnModificarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEmpleadoActionPerformed
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblSchedule.getModel();
        int row = tblSchedule.getSelectedRow();

        if (currentUpgradeStatus) {
            // if (empleadoModificar != null) {
            // Luego ya que se selecciona y se modifica el empleado
            // se viene aqui para modificarlo en el controlador
            System.out.println("Modificar empleado - controlador");
            btnAgregarEmpleado.setEnabled(true);

            String nombre = tfNombreEmpleado.getText();
            String tipo = jbTipoEmpleado.getSelectedItem().toString();
            // Settearlo todo esto al 'empleadoModificar'
            // Llamar al controlador
            if (!nombre.equals("")) {
                String id = model.getValueAt(row, 0).toString();

                Empleado empleadoCorrecto = new Empleado();
                for (Object obj : ViewMenuCitas.controlEmpleados.listar()) {
                    Empleado emp = (Empleado) obj;
                    if (emp.getIdUsuario().equals(Integer.valueOf(id))) {
                        empleadoCorrecto = emp;
                    }
                }

                empleadoCorrecto.setNombreCompleto(nombre);
                empleadoCorrecto.setTipoEmpleado(String.valueOf(tipo.charAt(0)));

                ViewMenuCitas.controlEmpleados.modificar(empleadoCorrecto);

                currentUpgradeStatus = false;
                tfNombreEmpleado.setText("");
                jbTipoEmpleado.setSelectedItem("Barbero");

                ViewGestorEmpleados vge = new ViewGestorEmpleados();
                vge.setVisible(true);
                this.dispose();

                javax.swing.JOptionPane.showMessageDialog(
                        this,
                        "Se modifico correctamente"
                );
            } else {
                javax.swing.JOptionPane.showMessageDialog(
                        this,
                        "Nombre vacio!"
                );
            }
        } else {
            // Primero se selecciona el empleado de la tabla
            if (row != -1) {
                System.out.println("Modificar empleado - seleccion");
                btnAgregarEmpleado.setEnabled(false);
                String id = model.getValueAt(row, 0).toString();

                // Aqui conseguir al empleado por id
                // Aqui settear el empleado con esto
                // empleadoModificar = ***;
                // Aqui remplazar el empleado conseguido
                String nombre = (String) model.getValueAt(row, 1);
                String tipo = (String) model.getValueAt(row, 3);

                currentUpgradeStatus = true;
                tfNombreEmpleado.setText(nombre);
                jbTipoEmpleado.setSelectedItem(tipo);

            } else {
                javax.swing.JOptionPane.showMessageDialog(
                        this,
                        "No se ha seleccionado ningun empleado!"
                );
            }
        }
    }//GEN-LAST:event_btnModificarEmpleadoActionPerformed

    /**
     * Falta implementar el controlador
     *
     * @param evt
     */
    private void btnAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoActionPerformed
        String nombre = tfNombreEmpleado.getText();
        String tipo = jbTipoEmpleado.getSelectedItem().toString();

        if (!nombre.equals("")) {
            System.out.println("Nombre: " + nombre + ", Tipo: " + tipo);

            // Llamar al controlador
            Date date = new Date();
            ViewMenuCitas.controlEmpleados.agregar(ViewMenuCitas.controlEmpleados.listar().size(),
                    nombre,
                    date,
                    String.valueOf(tipo.charAt(0)));

            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Se agrego correctamente"
            );

            ViewGestorEmpleados vge = new ViewGestorEmpleados();
            vge.setVisible(true);
            this.dispose();
        } else {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Nombre vacio!"
            );
        }
    }//GEN-LAST:event_btnAgregarEmpleadoActionPerformed

    private void btnMenuCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuCitasActionPerformed
        ViewMenuCitas vmc = new ViewMenuCitas();
        vmc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuCitasActionPerformed

    private void btnGestorEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestorEmpleadosActionPerformed
        // Aqui nada porque ya andamos aqui
    }//GEN-LAST:event_btnGestorEmpleadosActionPerformed

    private void btnGestorServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestorServiciosActionPerformed
        ViewGestorServicios vgs = new ViewGestorServicios();
        vgs.setVisible(true);
        this.dispose();
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

    // private Empleado empleadoModificar = null;
    private boolean currentUpgradeStatus;
    private int realYear, realMonth, realDay, currentYear, currentMonth;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.MetroButton btnAgregarEmpleado;
    private components.MetroButton btnEliminarEmpleado;
    private components.MetroButton btnGestorEmpleados;
    private components.MetroButton btnGestorServicios;
    private components.MetroButton btnHamburgerMenu;
    private components.MetroButton btnLogo;
    private components.MetroButton btnMenuCitas;
    private components.MetroButton btnModificarEmpleado;
    private javax.swing.JComboBox<String> jbTipoEmpleado;
    private javax.swing.JLabel labelEmpresa;
    private javax.swing.JLabel labelNombreEmpleado;
    private javax.swing.JLabel labelTipoEmpleado;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel pnlButtonsSection;
    private javax.swing.JPanel pnlHambuergerButton;
    private javax.swing.JPanel pnlHamburgerMenu;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlScheduleSection;
    private javax.swing.JScrollPane scrollPnlSchedule;
    private components.table.TableSchedule tblSchedule;
    private javax.swing.JTextField tfNombreEmpleado;
    // End of variables declaration//GEN-END:variables
}
