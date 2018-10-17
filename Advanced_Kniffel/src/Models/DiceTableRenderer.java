/*
#ProProgrammer
*/
package Models;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class DiceTableRenderer implements TableCellRenderer{
    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        JLabel l =  new JLabel(new ImageIcon(getClass().getResource("dice1.png")),JLabel.CENTER); 
        if(o instanceof Boolean)
            if((boolean)o){
              l.setOpaque(true);
            l.setBackground(Color.yellow);  
            }
        return l;
    }

}
