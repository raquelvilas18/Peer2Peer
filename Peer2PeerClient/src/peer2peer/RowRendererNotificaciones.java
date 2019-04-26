/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peer2peer;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author raquel
 */
public class RowRendererNotificaciones extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {

        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        this.setForeground(new Color(119,119,119));
        if (((String) table.getValueAt(row, column)).contains("iniciado")) {
            this.setForeground(new Color(11,99,1));
        } else if (((String) table.getValueAt(row, column)).contains("cerrado")) {
            this.setForeground(new Color(164,1,1));
        } else if (((String) table.getValueAt(row, column)).contains("mensaje")) {
            this.setForeground(new Color(43,96,113));
        }
        this.setOpaque(true);
        this.setFont(new Font("Sans-serif", Font.PLAIN, 11));
        return this;
    }
}
