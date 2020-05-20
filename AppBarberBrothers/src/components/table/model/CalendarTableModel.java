package components.table.model;

import javax.swing.table.DefaultTableModel;
import views.CalendarConst;

public class CalendarTableModel extends DefaultTableModel {

    public CalendarTableModel() {
        super();
        initHeader();
        initSize();
    }

    public CalendarTableModel(Object[][] os, Object[] os1) {
        super(os, os1);
        initHeader();
        initSize();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int mColIndex) {
        return false;
    }

    public void clearData() {
        /*
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                setValueAt(null, i, j);
            }
        }
        */
        setColumnCount(0);
        setRowCount(0);
        initHeader();
        initSize();
    }

    public void drawCalendar(int nod, int som) {
        for (int i = 1; i <= nod; i++) {
            int row = (i + som - 2) / 7;
            int column  =  (i + som - 2) % 7;

            addTableModelListener((javax.swing.event.TableModelEvent tme) -> {
                if (tme.getType() == javax.swing.event.TableModelEvent.UPDATE) {
                }
            });
            setValueAt(i, row, column);
        }
    }

    private void initSize() {
        setColumnCount(7);
        setRowCount(6);
    }

    private void initHeader() {
        setRowCount(0);
        for (String h : CalendarConst.HEADERS) {
            addColumn(h);
        }
    }
}
