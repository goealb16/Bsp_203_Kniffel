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

    public void setText(String text) {
        this.text = text;
    }

    public void setWahl(Boolean wahl) {
        this.wahl = wahl;
    }

    public void setPunkte(int punkte) {
        this.punkte = punkte;
    }
}
