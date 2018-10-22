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
        Dice dice = (Dice)o;
        JLabel l = new JLabel(dice.getImg(),JLabel.CENTER);
        l.setOpaque(true);
        boolean fixed = dice.isFixed();
        
        if(bln1 && !fixed){
            dice.setFixed(true);
            l.setBackground(Color.yellow); 
        }else if(bln1 && fixed){
            dice.setFixed(false);
            l.setBackground(Color.white); 
        }
        else if(fixed){
            l.setBackground(Color.yellow);
        }
              System.out.println(dice.isFixed());
           
        return l;
    }

}
