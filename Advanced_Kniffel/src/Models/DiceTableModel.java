/*
#ProProgrammer
*/
package Models;

import BL.Dice;
import BL.KniffelValue;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class DiceTableModel extends AbstractTableModel{

    public DiceTableModel() {
        vals.add(new Dice());
        vals.add(new Dice());
        vals.add(new Dice());
        vals.add(new Dice());
        vals.add(new Dice());
    }

    private ArrayList<Dice> vals = new ArrayList<>();
        
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
    switch(i1){
        case 0: return vals.get(0);
        case 1: return vals.get(1);
        case 2: return vals.get(2);
        case 3: return vals.get(3);
        case 4: return vals.get(4);
        case 5: return vals.get(5);
        default:return "??";
    }
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return super.isCellEditable(i, i1); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Dice> getVals() {
        return vals;
    }

     
    
    
}
