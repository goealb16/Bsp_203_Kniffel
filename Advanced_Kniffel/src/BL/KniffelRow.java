/*
#ProProgrammer
 */
package BL;



public class KniffelRow {

    private String text;
    private  Boolean wahl;

    public String getText() {
        return text;
    }

    public Boolean getWahl() {
        return wahl;
    }

    public int getPunkte() {
        return punkte;
    }

    public KniffelRow(String text, Boolean wahl, int punkte) {
        this.text = text;
        this.wahl = wahl;
        this.punkte = punkte;
    }
    private int punkte;
}
