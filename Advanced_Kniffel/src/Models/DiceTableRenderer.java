/*
#ProProgrammer
*/
package Models;

import BL.Dice;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class DiceTableRenderer implements TableCellRenderer{
    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        System.out.println("LEL");
        Dice dice = (Dice)o;
        JLabel l = new JLabel(dice.getImg(),JLabel.CENTER);
        l.setOpaque(true);
        boolean fixed = dice.isFixed();

        if(bln1 && !fixed){
            dice.setFixed(true);
        }else if(bln1 && fixed){
            dice.setFixed(false);
        }
         if(dice.isFixed()){
            l.setBackground(Color.red);
        }
         
           
        return l;
    }

}
