/*
#ProProgrammer
*/
package Models;

import BL.KniffelValue;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class DiceTableModel extends AbstractTableModel{

    public DiceTableModel() {
        vals.add(new KniffelValue());
        vals.add(new KniffelValue());
        vals.add(new KniffelValue());
        vals.add(new KniffelValue());
        vals.add(new KniffelValue());
    }

    private ArrayList<KniffelValue> vals = new ArrayList<>();
        
    @Override
    public int getRowCount() {
        return 1;
    }

    @Override
    public int getColumnCount() {
        return vals.size();
    }

    @Override
    public Object getValueAt(int i, int i1) {
    return "??";
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return super.isCellEditable(i, i1); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
