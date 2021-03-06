/*
#ProProgrammer
*/
package Models;

import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;


public class KniffelTableRenderer implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        if(o instanceof Boolean){
            JCheckBox box = new JCheckBox();
            box.setSelected((boolean)o);
            if(bln1 && !(boolean)o){
                box.setSelected(true);
                KniffelTableModel model = (KniffelTableModel)jtable.getModel();
                model.getRow(i).setWahl(true);
            }
            return box;
        }
        else
            return new JLabel(o.toString());
    }

}
