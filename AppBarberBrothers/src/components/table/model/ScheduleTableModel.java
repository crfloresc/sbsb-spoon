package components.table.model;

import Datos.entidades.Citas;
import Datos.entidades.Empleado;
import Datos.entidades.Servicios;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ScheduleTableModel extends DefaultTableModel {

    private final static String[] HEADER = new String[]{
        "Id",
        "Fecha y hora",
        "Cliente",
        "Barbero",
        "Servicio"
    };

    private final static String[] HEADER_EMPLOYEE = new String[]{
        "Id",
        "Nombre del empleado",
        "Fecha de ingreso",
        "Tipo de empleado"
    };

    private final static String[] HEADER_SERVICE = new String[]{
        "Id",
        "Nombre del servicio",
        "Precio unitario",
        "Duracion"
    };

    public ScheduleTableModel() {
        super(new Object[][]{}, HEADER);
        populate();
    }

    public ScheduleTableModel(List lista) {
        super(new Object[][]{}, HEADER);
        populateWithDb(lista);
    }

    public ScheduleTableModel(int type) {
        // super(new Object [][] {});
        setColumnIdentifiers(getHeader(type));
        populate();
    }
    
    public ScheduleTableModel(int type, List lista) {
        // super(new Object [][] {});
        setColumnIdentifiers(getHeader(type));
        if(type == 0) {
            populateEmployees(lista);
        } else if(type == 1) {
            populateServices(lista);
        } else {
            populateWithDb(lista);
        }       
    }

    public ScheduleTableModel(Object[][] os, Object[] os1) {
        super(os, os1);
        populate();
    }

    private Object[] getHeader(int type) {
        if (type == 0) {
            return HEADER_EMPLOYEE;
        } else if (type == 1) {
            return HEADER_SERVICE;
        } else {
            return HEADER;
        }
    }

    private void populateWithDb(List lista) {
        setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            Citas cita = (Citas) lista.get(i);
            insertRow(
                    i,
                    new Object[]{
                        cita.getIdCita(),
                        cita.getFecha(),
                        cita.getCliente().getNombre(),
                        cita.getBarbero().getNombreCompleto(),
                        cita.getServicio().getNombre()
                    }
            );
        }
    }
    
    private void populateEmployees(List lista) {
        setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            Empleado emp = (Empleado) lista.get(i);
            insertRow(
                    i,
                    new Object[]{
                        emp.getIdUsuario(),
                        emp.getNombreCompleto(),
                        emp.getFechaIngreso(),
                        emp.getTipoEmpleado()
                    }
            );
        }
    }
    
    private void populateServices(List lista) {
        setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            Servicios ser = (Servicios) lista.get(i);
            insertRow(
                    i,
                    new Object[]{
                        ser.getIdServicio(),
                        ser.getNombre(),
                        ser.getPrecioUnitario(),
                        ser.getDuracion()
                    }
            );
        }
    }

    private void populate() {
        setRowCount(0);
        for (int i = 0; i < 10; i++) {
            insertRow(
                    i,
                    new Object[]{
                        "ID",
                        "DEFAULT1",
                        "DEFAULT2",
                        "DEFAULT3"
                    }
            );
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int mColIndex) {
        return false;
    }
}
