package components.table.render;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TableCalendarRender extends DefaultTableCellRenderer {

    private int realYear, realMonth, realDay, currentYear, currentMonth;

    public TableCalendarRender() {
    }

    public TableCalendarRender(int realYear, int realMonth, int realDay, int currentYear, int currentMonth) {
        this.realYear = realYear;
        this.realMonth = realMonth;
        this.realDay = realDay;
        this.currentYear = currentYear;
        this.currentMonth = currentMonth;
    }

    private void init() {
        setForeground(Color.black);
        setHorizontalAlignment(CENTER);
        setFont(new Font("Tahoma", Font.BOLD, 10));
        setBorder(BorderFactory.createEmptyBorder());
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column){
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        if (column == 0 || column == 6) { // Week-end
            setBackground(new Color(255, 220, 220));
        }
        else {
            setBackground(new Color(255, 255, 255));
        }
        if (value != null) {
            if (selected) {
                setBackground(new Color(160, 160, 160));
            } else {
                if (Integer.parseInt(value.toString()) == realDay && currentMonth == realMonth && currentYear == realYear) { // Today
                    setBackground(new Color(220, 220, 255));
                }
            }
        }
        init();
        return this;
    }
}
