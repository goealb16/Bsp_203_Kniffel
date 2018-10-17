/*
#ProProgrammer
*/
package Models;

import java.awt.Component;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;


public class DiceTableRenderer implements TableCellRenderer{
    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        JLabel l = new JLabel(o.toString());
        l.setIcon(new ImageIcon(".\\src\\dice1.png"));
        return l;
    }

}
