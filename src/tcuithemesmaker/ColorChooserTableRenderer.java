package tcuithemesmaker;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Игорь
 */
public class ColorChooserTableRenderer extends JLabel implements TableCellRenderer {

    public ColorChooserTableRenderer() {
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setOpaque(true);
        if (value == null || !(value instanceof java.awt.Color)) {
            value = java.awt.Color.red;
            table.setValueAt(value, row, column);
        }
        setBackground((java.awt.Color) value);
        return this;
    }
}
