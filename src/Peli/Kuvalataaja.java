
package Peli;

import javax.imageio.ImageIO;


public class Kuvalataaja {
    private Kuvalataaja() {
        try{
            Kuvavarasto.lisaaKuva("ukkoOO", ImageIO.read(getClass().getResourceAsStream(("TankDown.png"))));
            Kuvavarasto.lisaaKuva("ukkoVO", ImageIO.read(getClass().getResourceAsStream(("TankLeft.png"))));
            Kuvavarasto.lisaaKuva("ukkoVO", ImageIO.read(getClass().getResourceAsStream(("TankRight.png"))));
            Kuvavarasto.lisaaKuva("ukkoVO", ImageIO.read(getClass().getResourceAsStream(("TankUp.png"))));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void lataaKuvat() {
        new Kuvalataaja();
    }
}
