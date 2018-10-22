/*
#ProProgrammer
*/
package BL;

import java.util.Random;
import javax.swing.ImageIcon;
import Icons.GetImage;

public class Dice {
    private int val;
    private boolean fixed;
    private ImageIcon img;
    
    public Dice() {
        this.fixed = false;
        this.val = new Random().nextInt(6-1+1)+1;
        setImgByVal(this.val);
    }

    public ImageIcon getImg() {
        return img;
    }
    
    public int getVal() {
        return val;
    }

    public boolean isFixed() {
        return fixed;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }
    
    public void setImgByVal(int val){
        this.img = new GetImage().getImageByVal(val);
    }
    
}
