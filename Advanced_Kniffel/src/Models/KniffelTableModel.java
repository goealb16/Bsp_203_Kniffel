/*
#ProProgrammer
 */
package Models;

import BL.KniffelRow;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class KniffelTableModel extends AbstractTableModel {

    private ArrayList<KniffelRow> rows = new ArrayList<>();
    private static final String[] COLS = {"Spiel", "Wahl", "Punkte"};

    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public int getColumnCount() {
        return COLS.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        KniffelRow r = rows.get(i);
        switch (i1) {
            case 1:
                return r.getText();
            case 2:
                return r.getWahl();
            case 3:
                return r.getPunkte();
            default:
                return "???";
        }
    }

    @Override
    public String getColumnName(int i) {
        return COLS[i];
    }
    
    

}
