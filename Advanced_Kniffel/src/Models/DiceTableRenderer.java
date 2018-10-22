/*
#ProProgrammer
*/
package Models;

import BL.Dice;
import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class DiceTableRenderer implements TableCellRenderer{
    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        Dice x = (Dice)o;
        JLabel l = new JLabel(x.getImg(),JLabel.CENTER);
        
        if(o instanceof Boolean)
            if((boolean)o){
              l.setOpaque(true);
            l.setBackground(Color.yellow);  
            }
        return l;
    }

}
