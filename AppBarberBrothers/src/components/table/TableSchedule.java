package components.table;

import components.table.model.ScheduleTableModel;
import components.table.render.TableScheduleRender;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableModel;

public class TableSchedule extends JTable {

    private static Color H_BG_PRIMARY = new java.awt.Color(255, 255, 255);
    private static Border H_BORDER = BorderFactory.createEmptyBorder();
    private static Font H_FONT = new java.awt.Font("Tahoma", Font.BOLD, 10);

    private static Color B_BG_PRIMARY = new java.awt.Color(255, 255, 255);
    private static Color B_FG_PRIMARY = new java.awt.Color(0, 0, 0);

    public TableSchedule() {
        super(new ScheduleTableModel());
        initDefault();
    }

    public TableSchedule(TableModel tm) {
        super(tm);
        initDefault();
    }

    private void initDefault() {
        initConfigHeader();
        initDesignHeader();
        initDesignBody();
        initGridBody();
    }

    /**
     * No resize/reorder
     */
    private void initConfigHeader() {
        getTableHeader().setResizingAllowed(false);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setSize(new Dimension(0, 1));
    }

    private void initDesignHeader() {
        getTableHeader().setFont(H_FONT);
        getTableHeader().setBorder(H_BORDER);
        getTableHeader().setBackground(H_BG_PRIMARY);
    }

    private void initDesignBody() {
        setBackground(B_BG_PRIMARY);
        setForeground(B_FG_PRIMARY);
    }

    private void initGridBody() {
        setShowVerticalLines(false);
        setRowHeight(25);
        setIntercellSpacing(new Dimension(0, 1));
    }

    public void applyRender() {
        setDefaultRenderer(
                getColumnClass(0),
                new TableScheduleRender()
        );
    }
}
