package zeus.playground.swing.component.table.editable;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * This renderer renders a color value as a panel with the given color.
 */
public class ColorTableCellRenderer extends JPanel implements TableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                   boolean hasFocus, int row, int column) {
        setBackground((Color) value);
        if (hasFocus) {
            setBorder(UIManager.getBorder("Table.focusCellHighlightBorder"));
        } else {
            setBorder(null);
        }
        return this;
    }
}