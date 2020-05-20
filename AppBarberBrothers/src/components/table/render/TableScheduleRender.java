package components.table.render;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TableScheduleRender extends DefaultTableCellRenderer {

    public TableScheduleRender() {
    }

    private void init() {
        setForeground(Color.black);
        setFont(new java.awt.Font("Tahoma", Font.PLAIN, 10));
        setBorder(BorderFactory.createEmptyBorder());
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column){
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        init();
        return this;
    }
}
