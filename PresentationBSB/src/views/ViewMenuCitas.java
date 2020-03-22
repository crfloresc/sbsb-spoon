package views;

import java.util.GregorianCalendar;

public class ViewMenuCitas extends javax.swing.JFrame {

    private javax.swing.JLabel lblMonth;
    private javax.swing.JComboBox cmbYear;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnNext;
    private components.table.model.CalendarTableModel mtblCalendar;
    private components.table.model.ScheduleTableModel mtblSchedule;
    private components.table.TableCalendar tblCalendar;
    private javax.swing.JScrollPane stblCalendar;
    private javax.swing.JPanel pnlCalendar;
    private int realYear, realMonth, realDay, currentYear, currentMonth;

    public ViewMenuCitas() {
        initComponents();
        // Create controls
        lblMonth = new javax.swing.JLabel("Enero");
        cmbYear = new javax.swing.JComboBox();
        btnPrev = new components.MetroButton("<-");
        btnNext = new components.MetroButton("->");
        tblCalendar = new components.table.TableCalendar();
        mtblCalendar = (components.table.model.CalendarTableModel) tblCalendar.getModel();
        stblCalendar = new javax.swing.JScrollPane(tblCalendar);

        // Set border
        pnlCalendarSection.setBorder(javax.swing.BorderFactory.createTitledBorder("Calendario"));

        // Register action listeners
        btnPrev.addActionListener(this::btnPrevActionPerformed);
        btnNext.addActionListener(this::btnNextActionPerformed);
        cmbYear.addActionListener(this::cmbYearActionPerformed);
        tblCalendar.addMouseListener(new java.awt.event.MouseAdapter() {
             @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCalendarMouseClicked(evt);
            }
        });

        // Add controls to pane
        pnlCalendarSection.add(lblMonth);
        pnlCalendarSection.add(cmbYear);
        pnlCalendarSection.add(btnPrev);
        pnlCalendarSection.add(btnNext);
        pnlCalendarSection.add(stblCalendar);

        // Set bounds
        pnlCalendarSection.setBounds(0, 0, 320, 335);
        lblMonth.setBounds(160 - lblMonth.getPreferredSize().width / 2, 25, 100, 25);
        btnPrev.setBounds(10, 25, 50, 25);
        btnNext.setBounds(260, 25, 50, 25);
        stblCalendar.setBounds(10, 50, 300, 250);
        cmbYear.setBounds(130 - cmbYear.getPreferredSize().width / 2, 305, 80, 20);

        // Get real month/year
        GregorianCalendar cal = new GregorianCalendar(); //Create calendar
        realDay = cal.get(GregorianCalendar.DAY_OF_MONTH); //Get day
        realMonth = cal.get(GregorianCalendar.MONTH); //Get month
        realYear = cal.get(GregorianCalendar.YEAR); //Get year
        currentMonth = realMonth; //Match month and year
        currentYear = realYear;

        // Populate combo box
        for (int i = realYear - 2; i <= realYear + 2; i++) {
            cmbYear.addItem(String.valueOf(i));
        }

        // Refresh calendar
        refreshCalendar(realMonth, realYear);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        btnAccount = new javax.swing.JButton();
        labelUsuario = new javax.swing.JLabel();
        labelEmpresa = new javax.swing.JLabel();
        btnLogo = new components.MetroButton();
        pnlHambuergerButton = new javax.swing.JPanel();
        btnHamburgerMenu = new components.MetroButton();
        pnlHamburgerMenu = new javax.swing.JPanel();
        pnlCalendarSection = new javax.swing.JPanel();
        pnlButtonsSection = new javax.swing.JPanel();
        btnAgregarCita = new components.MetroButton();
        btnModificarCita = new components.MetroButton();
        btnEliminarCita = new components.MetroButton();
        pnlScheduleSection = new javax.swing.JPanel();
        scrollPnlSchedule = new javax.swing.JScrollPane();
        tblSchedule = new components.table.TableSchedule();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlMain.setBackground(new java.awt.Color(153, 255, 204));
        pnlMain.setForeground(new java.awt.Color(153, 255, 204));

        pnlHeader.setBackground(new java.awt.Color(255, 255, 255));
        pnlHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlHeader.setForeground(new java.awt.Color(255, 255, 255));
        pnlHeader.setPreferredSize(new java.awt.Dimension(881, 50));

        btnAccount.setText("&lt;&lt;");
        btnAccount.setFocusPainted(false);

        labelUsuario.setBackground(new java.awt.Color(0, 0, 0));
        labelUsuario.setForeground(new java.awt.Color(0, 0, 0));
        labelUsuario.setText("Herman Flores");

        labelEmpresa.setBackground(new java.awt.Color(0, 0, 0));
        labelEmpresa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelEmpresa.setForeground(new java.awt.Color(0, 0, 0));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 381, Short.MAX_VALUE)
                .addComponent(labelUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAccount)
                .addGap(12, 12, 12))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHeaderLayout.createSequentialGroup()
                        .addComponent(btnAccount)
                        .addContainerGap(11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                                .addComponent(labelUsuario)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                                .addComponent(labelEmpresa)
                                .addGap(11, 11, 11))))))
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

        javax.swing.GroupLayout pnlHamburgerMenuLayout = new javax.swing.GroupLayout(pnlHamburgerMenu);
        pnlHamburgerMenu.setLayout(pnlHamburgerMenuLayout);
        pnlHamburgerMenuLayout.setHorizontalGroup(
            pnlHamburgerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        pnlHamburgerMenuLayout.setVerticalGroup(
            pnlHamburgerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );

        pnlCalendarSection.setBackground(new java.awt.Color(204, 204, 204));
        pnlCalendarSection.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout pnlCalendarSectionLayout = new javax.swing.GroupLayout(pnlCalendarSection);
        pnlCalendarSection.setLayout(pnlCalendarSectionLayout);
        pnlCalendarSectionLayout.setHorizontalGroup(
            pnlCalendarSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlCalendarSectionLayout.setVerticalGroup(
            pnlCalendarSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );

        pnlButtonsSection.setBackground(new java.awt.Color(204, 204, 204));
        pnlButtonsSection.setForeground(new java.awt.Color(204, 204, 204));

        btnAgregarCita.setText("Agregar cita");
        btnAgregarCita.setColorBorde(null);
        btnAgregarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCitaActionPerformed(evt);
            }
        });

        btnModificarCita.setText("Modificar cita");
        btnModificarCita.setColorBorde(null);
        btnModificarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCitaActionPerformed(evt);
            }
        });

        btnEliminarCita.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminarCita.setText("Eliminar cita");
        btnEliminarCita.setColorBorde(null);
        btnEliminarCita.setColorHover(new java.awt.Color(102, 0, 0));
        btnEliminarCita.setColorNormal(new java.awt.Color(204, 0, 0));
        btnEliminarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlButtonsSectionLayout = new javax.swing.GroupLayout(pnlButtonsSection);
        pnlButtonsSection.setLayout(pnlButtonsSectionLayout);
        pnlButtonsSectionLayout.setHorizontalGroup(
            pnlButtonsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsSectionLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(pnlButtonsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        pnlButtonsSectionLayout.setVerticalGroup(
            pnlButtonsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsSectionLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btnAgregarCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminarCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pnlScheduleSection.setBackground(new java.awt.Color(204, 204, 204));
        pnlScheduleSection.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlScheduleSection.setForeground(new java.awt.Color(204, 204, 204));

        /**/
        tblSchedule.setBackground(new java.awt.Color(255, 255, 255));
        tblSchedule.setForeground(new java.awt.Color(0, 0, 0));
        tblSchedule.setModel(mtblSchedule);
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
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlCalendarSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlButtonsSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(pnlCalendarSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pnlButtonsSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    private void btnAgregarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCitaActionPerformed
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblCalendar.getModel();
        int row = tblCalendar.getSelectedRow();
        int col = tblCalendar.getSelectedColumn();
        if (row != -1) {
            System.out.println("Agregar cita");
            int value = (int) model.getValueAt(row, col);
            System.out.println(value);

            ViewGestorCita vgc = new ViewGestorCita(ViewGestorCita.AGREGAR);
            vgc.setVisible(true);
            this.dispose();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No se ha seleccionado ningun dato!");
        }
    }//GEN-LAST:event_btnAgregarCitaActionPerformed

    private void btnModificarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCitaActionPerformed
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblSchedule.getModel();
        int row = tblSchedule.getSelectedRow();
        int col = tblSchedule.getSelectedColumn();
        if (row != -1) {
            System.out.println("Modificar cita");
            String value = (String) model.getValueAt(row, col);
            System.out.println(value);

            ViewGestorCita vgc = new ViewGestorCita(ViewGestorCita.MODIFICAR);
            vgc.setVisible(true);
            this.dispose();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No se ha seleccionado ningun dato!");
        }
    }//GEN-LAST:event_btnModificarCitaActionPerformed

    private void btnEliminarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCitaActionPerformed
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblSchedule.getModel();
        int row = tblSchedule.getSelectedRow();
        int col = tblSchedule.getSelectedColumn();
        if (row != -1) {
            String value = (String) model.getValueAt(row, col);

            if (!value.isEmpty()) {
                final int confirm = javax.swing.JOptionPane.showConfirmDialog(
                        this, 
                        "Seguro que quiere eliminarlo?",
                        "Eliminar cita",
                        javax.swing.JOptionPane.WARNING_MESSAGE,
                        javax.swing.JOptionPane.YES_NO_OPTION);

                if (confirm == javax.swing.JOptionPane.YES_OPTION) {
                    System.out.println("Eliminar cita");
                    model.removeRow(row);
                    javax.swing.JOptionPane.showMessageDialog(this, "Se elimino correctamente");
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No se ha seleccionado ningun dato!");
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No se ha seleccionado ningun dato!");
        }
    }//GEN-LAST:event_btnEliminarCitaActionPerformed

    private void refreshCalendar(int month, int year) {
        // Allow/disallow buttons
        btnPrev.setEnabled(true);
        btnNext.setEnabled(true);
        if (month == 0 && year <= realYear - 2) {
            btnPrev.setEnabled(false);
        } // Too early
        if (month == 11 && year >= realYear + 2) {
            btnNext.setEnabled(false);
        } // Too late
        lblMonth.setText(CalendarConst.MONTHS[month] + ", " + currentYear); //Refresh the month label (at the top)
        lblMonth.setBounds(160 - lblMonth.getPreferredSize().width / 2, 25, 180, 25); //Re-align label with calendar
        cmbYear.setSelectedItem(String.valueOf(year)); //Select the correct year in the combo box

        // Clear data table
        mtblCalendar.clearData();

        // Get first day of month and number of days
        GregorianCalendar cal = new GregorianCalendar(year, month, 1);
        int nod = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        int som = cal.get(GregorianCalendar.DAY_OF_WEEK);

        // Draw calendar
        mtblCalendar.drawCalendar(nod, som);

        // Apply renderers
        tblCalendar.applyRender(realYear, realMonth, realDay, currentYear, currentMonth);
    }

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {
        if (currentMonth == 0) { // Back one year
            currentMonth = 11;
            currentYear -= 1;
        } else { // Back one month
            currentMonth -= 1;
        }
        cmbYear.setSelectedItem(currentYear);
        refreshCalendar(currentMonth, currentYear);
    }

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {
        if (currentMonth == 11) {
            currentMonth = 0;
            currentYear += 1;
        } else {
            currentMonth += 1;
        }
        cmbYear.setSelectedItem(currentYear);
        refreshCalendar(currentMonth, currentYear);
    }

    private void cmbYearActionPerformed(java.awt.event.ActionEvent evt) {
        if (cmbYear.getSelectedItem() != null) {
            String b = cmbYear.getSelectedItem().toString();
            currentYear = Integer.parseInt(b);
            cmbYear.setSelectedItem(currentYear);
            refreshCalendar(currentMonth, currentYear);
        }
    }
    
    private void tblCalendarMouseClicked(java.awt.event.MouseEvent evt) {
        Integer row = tblCalendar.rowAtPoint(evt.getPoint());
        Integer col = tblCalendar.columnAtPoint(evt.getPoint());
        String value = String.valueOf(mtblCalendar.getValueAt(row, col));
        if (row >= 0 && col >= 0) {
            if (!value.contains("null")) {
                System.out.println(lblMonth.getText());
                System.out.println("R: " + row + ", C: " + col);
                System.out.println(value);
                javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblSchedule.getModel();
                model.setRowCount(0);
                model.insertRow(0, new Object[]{value, row, col, ""});
            }
        }
    }

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMenuCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(() -> {
            new ViewMenuCitas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccount;
    private components.MetroButton btnAgregarCita;
    private components.MetroButton btnEliminarCita;
    private components.MetroButton btnHamburgerMenu;
    private components.MetroButton btnLogo;
    private components.MetroButton btnModificarCita;
    private javax.swing.JLabel labelEmpresa;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel pnlButtonsSection;
    private javax.swing.JPanel pnlCalendarSection;
    private javax.swing.JPanel pnlHambuergerButton;
    private javax.swing.JPanel pnlHamburgerMenu;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlScheduleSection;
    private javax.swing.JScrollPane scrollPnlSchedule;
    private javax.swing.JTable tblSchedule;
    // End of variables declaration//GEN-END:variables
}
