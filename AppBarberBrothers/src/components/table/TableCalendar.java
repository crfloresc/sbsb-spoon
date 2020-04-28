package components.table;

import components.table.model.CalendarTableModel;
import components.table.render.TableCalendarRender;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.table.TableModel;

public class TableCalendar extends JTable {

    private static Color H_BG_PRIMARY = new java.awt.Color(255, 255, 255);
    private static Border H_BORDER = BorderFactory.createEmptyBorder();
    private static Font H_FONT = new java.awt.Font("Tahoma", Font.BOLD, 10);

    public TableCalendar() {
        super(new CalendarTableModel());
        initDefault();
    }

    public TableCalendar(TableModel tm) {
        super(tm);
        initDefault();
    }

    private void initDefault() {
        initConfigHeader();
        initDesignHeader();
        initCellSelection();
        initSize();
        initGridHeader();
    }

    /**
     * No resize/reorder
     */
    private void initConfigHeader() {
        getTableHeader().setResizingAllowed(false);
        getTableHeader().setReorderingAllowed(false);
    }

    private void initDesignHeader() {
        getTableHeader().setFont(H_FONT);
        getTableHeader().setBorder(H_BORDER);
        getTableHeader().setBackground(H_BG_PRIMARY);
    }

    /**
     * Single cell selection
     */
    private void initCellSelection() {
        setColumnSelectionAllowed(true);
        setRowSelectionAllowed(true);
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    /**
     * Set row/column count
     */
    private void initSize() {
        setRowHeight(38);
    }

    private void initGridHeader() {
        setShowGrid(false);
        setIntercellSpacing(new Dimension(0, 0));
    }

    public void applyRender(int realYear, int realMonth, int realDay, int currentYear, int currentMonth) {
        setDefaultRenderer(
                getColumnClass(0),
                new TableCalendarRender(
                        realYear,
                        realMonth,
                        realDay,
                        currentYear,
                        currentMonth
                )
        );
    }
}
