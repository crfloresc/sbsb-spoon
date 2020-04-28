package views;

import Datos.entidades.Citas;
import Datos.entidades.Clientes;
import Datos.entidades.Empleado;
import Datos.entidades.Servicios;
import Negocios.control.ControlCitas;
import java.util.GregorianCalendar;
import components.table.render.TableCalendarRender;
import java.util.Calendar;
import org.apache.commons.lang3.time.DateUtils;

public class ViewGestorCita extends javax.swing.JFrame {

    public static int AGREGAR = 1;
    public static int MODIFICAR = 2;

    private javax.swing.JLabel lblMonth;
    private javax.swing.JComboBox cmbYear;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnNext;
    private javax.swing.table.DefaultTableModel mtblCalendar;
    private javax.swing.table.DefaultTableModel mtblSchedule;
    private javax.swing.JTable tblCalendar;
    private javax.swing.JScrollPane stblCalendar;
    private javax.swing.JPanel pnlCalendar;
    private int realYear, realMonth, realDay, currentYear, currentMonth;
    private int tipo;
    private boolean isDisabledAgregar = false;
    private boolean isDisabledModificar = false;
    
    private int currentDay = 0;
    private int citaModificar;
    

    public ViewGestorCita(int tipo) {
        this.tipo = tipo;
        initComponents();

        if (tipo == AGREGAR) {
            btnAgregarCita.addActionListener(this::btnAgregarCitaActionPerformed);
            btnModificarCita.setEnabled(false);
        } else if (tipo == MODIFICAR) {
            btnModificarCita.addActionListener(this::btnModificarCitaActionPerformed);
            btnAgregarCita.setEnabled(false);
        }

        // Create controls
        lblMonth = new javax.swing.JLabel("Enero");
        cmbYear = new javax.swing.JComboBox();
        btnPrev = new components.MetroButton("<-");
        btnNext = new components.MetroButton("->");
        mtblCalendar = new javax.swing.table.DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int mColIndex) {
                return false;
            }
        };
        tblCalendar = new javax.swing.JTable(mtblCalendar);
        stblCalendar = new javax.swing.JScrollPane(tblCalendar);
        // pnlCalendar = new javax.swing.JPanel();

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
        // pnlCalendarSection.add(pnlCalendar);
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
        currentDay = cal.get(GregorianCalendar.DAY_OF_MONTH);
        

        // Add headers
        /*for (int i = 0; i < 7; i++) {
            mtblCalendar.addColumn(CalendarConst.HEADERS[i]);
        }*/
        for (String h : CalendarConst.HEADERS) {
            mtblCalendar.addColumn(h);
        }

        tblCalendar.getParent().setBackground(tblCalendar.getBackground()); //Set background

        // No resize/reorder
        tblCalendar.getTableHeader().setResizingAllowed(false);
        tblCalendar.getTableHeader().setReorderingAllowed(false);
        
        // 
        tblCalendar.getTableHeader().setFont(
                new java.awt.Font("Tahoma", java.awt.Font.BOLD, 10)
        );
        tblCalendar.getTableHeader().setBorder(
                javax.swing.BorderFactory.createEmptyBorder()
        );
        tblCalendar.getTableHeader().setBackground(
                new java.awt.Color(255, 255, 255)
        );

        // Single cell selection
        tblCalendar.setColumnSelectionAllowed(true);
        tblCalendar.setRowSelectionAllowed(true);
        tblCalendar.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        // Set row/column count
        tblCalendar.setRowHeight(38);
        mtblCalendar.setColumnCount(7);
        mtblCalendar.setRowCount(6);

        // Populate table
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelEmpresa = new javax.swing.JLabel();
        btnLogo = new components.MetroButton();
        pnlHambuergerButton = new javax.swing.JPanel();
        btnHamburgerMenu = new components.MetroButton();
        pnlHamburgerMenu = new javax.swing.JPanel();
        pnlCalendarSection = new javax.swing.JPanel();
        pnlButtonsSection = new javax.swing.JPanel();
        if (tipo == ViewGestorCita.MODIFICAR) {
            isDisabledAgregar = true;
        }
        btnAgregarCita = new components.MetroButton(isDisabledAgregar);
        if (tipo == ViewGestorCita.AGREGAR) {
            isDisabledModificar = true;
        }
        btnModificarCita = new components.MetroButton(isDisabledModificar);
        btnCancelar = new components.MetroButton();
        pnlScheduleSection = new javax.swing.JPanel();
        cbBarberos = new javax.swing.JComboBox<>();
        cbClientes = new javax.swing.JComboBox<>();
        cbFechas = new javax.swing.JComboBox<>();
        cbServicios = new javax.swing.JComboBox<>();
        labelBarberos = new javax.swing.JLabel();
        labelClientes = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        labelServicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlMain.setBackground(new java.awt.Color(153, 255, 204));
        pnlMain.setForeground(new java.awt.Color(153, 255, 204));

        pnlHeader.setBackground(new java.awt.Color(255, 255, 255));
        pnlHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlHeader.setForeground(new java.awt.Color(255, 255, 255));
        pnlHeader.setPreferredSize(new java.awt.Dimension(881, 50));

        jButton1.setText("&lt;&lt;");
        jButton1.setFocusPainted(false);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Herman Flores");

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
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(12, 12, 12))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHeaderLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                                .addComponent(jLabel1)
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

        btnModificarCita.setText("Modificar cita");
        btnModificarCita.setColorBorde(null);

        btnCancelar.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.setColorBorde(null);
        btnCancelar.setColorHover(new java.awt.Color(102, 0, 0));
        btnCancelar.setColorNormal(new java.awt.Color(204, 0, 0));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlButtonsSectionLayout = new javax.swing.GroupLayout(pnlButtonsSection);
        pnlButtonsSection.setLayout(pnlButtonsSectionLayout);
        pnlButtonsSectionLayout.setHorizontalGroup(
            pnlButtonsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsSectionLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(pnlButtonsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pnlScheduleSection.setBackground(new java.awt.Color(204, 204, 204));
        pnlScheduleSection.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlScheduleSection.setForeground(new java.awt.Color(204, 204, 204));

        cbBarberos.setModel(
            new javax.swing.DefaultComboBoxModel<>(
                new String[] {
                    "Herman Gilberto Flores",
                    "Hector Ivan Sanchez",
                    "Alejandro Medillin",
                    "Emilio Lopez"
                }
            )
        );

        cbClientes.setModel(
            new javax.swing.DefaultComboBoxModel<>(
                new String[] {
                    "Jaime Emiliano Zapata I",
                    "Luis Miguel Hidalgo Mendivil",
                    "Pepito Grillo",
                    "Buzz Lightyear",
                    "Cliente en general"
                }
            )
        );

        cbFechas.setModel(
            new javax.swing.DefaultComboBoxModel<>(
                new String[] {
                    "10:00",
                    "11:00",
                    "12:00",
                    "16:00",
                    "18:00"
                }
            )
        );

        cbServicios.setModel(
            new javax.swing.DefaultComboBoxModel<>(
                new String[] {
                    "Barba",
                    "Cabello",
                    "Barba y cabello",
                    "Tinte"
                }
            )
        );

        labelBarberos.setBackground(new java.awt.Color(0, 0, 0));
        labelBarberos.setForeground(new java.awt.Color(0, 0, 0));
        labelBarberos.setText("Seleccionar barbero:");

        labelClientes.setBackground(new java.awt.Color(0, 0, 0));
        labelClientes.setForeground(new java.awt.Color(0, 0, 0));
        labelClientes.setText("Seleccionar cliente");

        labelFecha.setBackground(new java.awt.Color(0, 0, 0));
        labelFecha.setForeground(new java.awt.Color(0, 0, 0));
        labelFecha.setText("Seleccionar fecha y hora:");

        labelServicio.setBackground(new java.awt.Color(0, 0, 0));
        labelServicio.setForeground(new java.awt.Color(0, 0, 0));
        labelServicio.setText("Seleccionar tipo de corte:");

        javax.swing.GroupLayout pnlScheduleSectionLayout = new javax.swing.GroupLayout(pnlScheduleSection);
        pnlScheduleSection.setLayout(pnlScheduleSectionLayout);
        pnlScheduleSectionLayout.setHorizontalGroup(
            pnlScheduleSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlScheduleSectionLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(pnlScheduleSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbFechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBarberos)
                    .addComponent(cbBarberos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFecha))
                .addGap(36, 36, 36)
                .addGroup(pnlScheduleSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelServicio)
                    .addComponent(cbServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelClientes)
                    .addComponent(cbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlScheduleSectionLayout.setVerticalGroup(
            pnlScheduleSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlScheduleSectionLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(pnlScheduleSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBarberos)
                    .addComponent(labelClientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlScheduleSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBarberos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(pnlScheduleSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFecha)
                    .addComponent(labelServicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlScheduleSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnAgregarCitaActionPerformed(java.awt.event.ActionEvent evt) {                                               
        final int confirm = javax.swing.JOptionPane.showConfirmDialog(
                        this, 
                        "Seguro que quiere agregar la cita?",
                        "Agregar cita",
                        javax.swing.JOptionPane.WARNING_MESSAGE,
                        javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            Empleado b = new Empleado(cbBarberos.getSelectedIndex() + 1, cbBarberos.getSelectedItem().toString());
            Clientes c = new Clientes(cbClientes.getSelectedIndex() + 1, cbClientes.getSelectedItem().toString());
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, currentYear);
            cal.set(Calendar.MONTH, currentMonth);
            cal.set(Calendar.DAY_OF_MONTH, currentDay);
            cal.set(Calendar.HOUR_OF_DAY, Integer.valueOf(cbFechas.getSelectedItem().toString().split(":")[0]));
            cal.set(Calendar.MINUTE,00);
            cal.set(Calendar.SECOND, 00);
            cal.set(Calendar.MILLISECOND, 00);
            java.util.Date f = cal.getTime();
            Servicios s = new Servicios(cbServicios.getSelectedIndex() + 1, cbServicios.getSelectedItem().toString());
            System.out.println(b+","+c+","+f+","+s);
            /**
             * Controlador de agregar cita
             */
            //System.out.println(currentYear + "," +currentMonth+","+realDay);
            ViewMenuCitas.controlCitas.agregar(ViewMenuCitas.controlCitas.listar().size(), f, b, c, s);
            
            ViewMenuCitas vmc = new ViewMenuCitas();
            vmc.setVisible(true);
            this.dispose();
        }
    }

    private void btnModificarCitaActionPerformed(java.awt.event.ActionEvent evt) {                                               
        final int confirm = javax.swing.JOptionPane.showConfirmDialog(
                        this, 
                        "Seguro que quiere modificar la cita?",
                        "Modificar cita",
                        javax.swing.JOptionPane.WARNING_MESSAGE,
                        javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            /**
             * Agregar aqui el controlador de modificar cita
             */
            
            // Modificar
            Empleado b = new Empleado(cbBarberos.getSelectedIndex() + 1, cbBarberos.getSelectedItem().toString());
            Clientes c = new Clientes(cbClientes.getSelectedIndex() + 1, cbClientes.getSelectedItem().toString());
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, currentYear);
            cal.set(Calendar.MONTH, currentMonth);
            cal.set(Calendar.DAY_OF_MONTH, currentDay);
            cal.set(Calendar.HOUR_OF_DAY, Integer.valueOf(cbFechas.getSelectedItem().toString().split(":")[0]));
            cal.set(Calendar.MINUTE,00);
            cal.set(Calendar.SECOND, 00);
            cal.set(Calendar.MILLISECOND, 00);
            java.util.Date f = cal.getTime();
            Servicios s = new Servicios(cbServicios.getSelectedIndex() + 1, cbServicios.getSelectedItem().toString());
            
            Citas cita = new Citas(citaModificar, f,b,c,s);           
            
            ViewMenuCitas.controlCitas.modificar(cita);
            
            ViewMenuCitas vmc = new ViewMenuCitas();
            vmc.setVisible(true);
            this.dispose();
        }
    }
    
    public void enviarCitaModificar(int idCita) {
        this.citaModificar = idCita;
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        final int confirm = javax.swing.JOptionPane.showConfirmDialog(
                        this, 
                        "Seguro que quiere cancelar?",
                        "Cancelar",
                        javax.swing.JOptionPane.WARNING_MESSAGE,
                        javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            ViewMenuCitas vmc = new ViewMenuCitas();
            vmc.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

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

        // Clear table
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                mtblCalendar.setValueAt(null, i, j);
            }
        }

        // Get first day of month and number of days
        GregorianCalendar cal = new GregorianCalendar(year, month, 1);
        int nod = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        int som = cal.get(GregorianCalendar.DAY_OF_WEEK);

        // Draw calendar
        for (int i = 1; i <= nod; i++) {
            int row = (i + som - 2) / 7;
            int column  =  (i + som - 2) % 7;
            
            mtblCalendar.addTableModelListener((javax.swing.event.TableModelEvent tme) -> {
                if (tme.getType() == javax.swing.event.TableModelEvent.UPDATE) {
                }
            });
            mtblCalendar.setValueAt(i, row, column);
        }

        // Apply renderers
        tblCalendar.setDefaultRenderer(
                tblCalendar.getColumnClass(0),
                new TableCalendarRender(
                        realYear,
                        realMonth,
                        realDay,
                        currentYear,
                        currentMonth
                )
        );
        tblCalendar.setShowGrid(false);
        tblCalendar.setIntercellSpacing(new java.awt.Dimension(0,0));
        /*tblCalendar.setShowHorizontalLines(false);
        tblCalendar.setShowVerticalLines(false);*/
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
                currentDay = Integer.valueOf(value);
                //System.out.println(lblMonth.getText());
                //System.out.println("R: " + row + ", C: " + col);
                //System.out.println(value);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.MetroButton btnAgregarCita;
    private components.MetroButton btnCancelar;
    private components.MetroButton btnHamburgerMenu;
    private components.MetroButton btnLogo;
    private components.MetroButton btnModificarCita;
    private javax.swing.JComboBox<String> cbBarberos;
    private javax.swing.JComboBox<String> cbClientes;
    private javax.swing.JComboBox<String> cbFechas;
    private javax.swing.JComboBox<String> cbServicios;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelBarberos;
    private javax.swing.JLabel labelClientes;
    private javax.swing.JLabel labelEmpresa;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelServicio;
    private javax.swing.JPanel pnlButtonsSection;
    private javax.swing.JPanel pnlCalendarSection;
    private javax.swing.JPanel pnlHambuergerButton;
    private javax.swing.JPanel pnlHamburgerMenu;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlScheduleSection;
    // End of variables declaration//GEN-END:variables
}
