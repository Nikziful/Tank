
package Peli;

import javax.imageio.ImageIO;


public class Kuvalataaja {
    private Kuvalataaja() {
        try{
            Kuvavarasto.lisaaKuva("TD", ImageIO.read(getClass().getResourceAsStream(("TankDown.png"))));
            Kuvavarasto.lisaaKuva("TL", ImageIO.read(getClass().getResourceAsStream(("TankLeft.png"))));
            Kuvavarasto.lisaaKuva("TR", ImageIO.read(getClass().getResourceAsStream(("TankRight.png"))));
            Kuvavarasto.lisaaKuva("TU", ImageIO.read(getClass().getResourceAsStream(("TankUp.png"))));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void lataaKuvat() {
        new Kuvalataaja();
    }
}
