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

    public KniffelTableModel() {
        rows.add(new KniffelRow("Nur Einser", Boolean.FALSE, 0));
         rows.add(new KniffelRow("Nur Zweier", Boolean.FALSE, 0));
          rows.add(new KniffelRow("Nur Dreier", Boolean.FALSE, 0));
           rows.add(new KniffelRow("Nur Vierer", Boolean.FALSE, 0));
            rows.add(new KniffelRow("Nur Fünfer", Boolean.FALSE, 0));
             rows.add(new KniffelRow("Nur Sechser", Boolean.FALSE, 0));
              rows.add(new KniffelRow("Pasch 3", Boolean.FALSE, 0));
               rows.add(new KniffelRow("Pasch 4", Boolean.FALSE, 0));
                rows.add(new KniffelRow("Full House", Boolean.FALSE, 0));
                 rows.add(new KniffelRow("Straße klein", Boolean.FALSE, 0));
                  rows.add(new KniffelRow("Straße groß", Boolean.FALSE, 0));
                   rows.add(new KniffelRow("Kniffel(nur 5er)", Boolean.FALSE, 0));
                    rows.add(new KniffelRow("Chane", Boolean.FALSE, 0));
    }

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
            case 0:
                return r.getText();
            case 1:
                return r.getWahl();
            case 2:
                return r.getPunkte();
            default:
                return "???";
        }
    }

    @Override
    public String getColumnName(int i) {
        return COLS[i];
    }
    
    public KniffelRow getRow(int i){
        return rows.get(i);
    }

}
