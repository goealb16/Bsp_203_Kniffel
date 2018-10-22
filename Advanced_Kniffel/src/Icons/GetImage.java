/*
#ProProgrammer
*/
package Icons;

import javax.swing.ImageIcon;


public class GetImage {
    public ImageIcon getImageByVal(int val){
        switch(val){
            case 1:return new ImageIcon(getClass().getResource("dice1.png"));
            case 2:return new ImageIcon(getClass().getResource("dice2.png"));
            case 3:return new ImageIcon(getClass().getResource("dice3.png"));
            case 4:return new ImageIcon(getClass().getResource("dice4.png"));
            case 5:return new ImageIcon(getClass().getResource("dice5.png"));
            case 6:return new ImageIcon(getClass().getResource("dice6.png"));
            default: return new ImageIcon(getClass().getResource("DefaultIcon.png"));
        }
    }
}
