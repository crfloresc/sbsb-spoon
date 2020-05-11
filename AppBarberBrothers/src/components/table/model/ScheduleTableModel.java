package components.table.model;

import javax.swing.table.DefaultTableModel;

public class ScheduleTableModel extends DefaultTableModel {

    private final static String[] HEADER = new String[] {
        "Id",
        "Fecha y hora",
        "Cliente",
        "Barbero",
        "Servicio"
    };

    public ScheduleTableModel() {
        super(new Object [][] {}, HEADER);
        populate();
    }

    public ScheduleTableModel(Object[][] os, Object[] os1) {
        super(os, os1);
        populate();
    }

    private void populate() {
        setRowCount(0);
        for (int i = 0; i < 10; i++) {
            insertRow(
                    i,
                    new Object[] {
                        "DEFAULT",
                        "DEFAULT",
                        "DEFAULT",
                        "DEFAULT",
                        "DEFAULT"
                    }
            );
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int mColIndex) {
        return false;
    }
}
