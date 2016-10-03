
package Peli;

import javax.imageio.ImageIO;


public class Kuvalataaja {
    private Kuvalataaja() {
        try{
            Kuvavarasto.lisaaKuva("TankDown", ImageIO.read(getClass().getResourceAsStream(("TankDown.png"))));
            Kuvavarasto.lisaaKuva("TankLeft", ImageIO.read(getClass().getResourceAsStream(("TankLeft.png"))));
            Kuvavarasto.lisaaKuva("TankRight", ImageIO.read(getClass().getResourceAsStream(("TankRight.png"))));
            Kuvavarasto.lisaaKuva("TankUp", ImageIO.read(getClass().getResourceAsStream(("TankUp.png"))));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void lataaKuvat() {
        new Kuvalataaja();
    }
}
