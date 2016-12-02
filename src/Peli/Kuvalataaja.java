package Peli;

import javax.imageio.ImageIO;
     
public class Kuvalataaja {
    private Kuvalataaja() {
        try{
            Kuvavarasto.lisaaKuva("TankDown", ImageIO.read(getClass().getResourceAsStream(("TankDown.png"))));
            Kuvavarasto.lisaaKuva("TankLeft", ImageIO.read(getClass().getResourceAsStream(("TankLeft.png"))));
            Kuvavarasto.lisaaKuva("TankRight", ImageIO.read(getClass().getResourceAsStream(("TankRight.png"))));
            Kuvavarasto.lisaaKuva("TankUp", ImageIO.read(getClass().getResourceAsStream(("TankUp.png"))));
            Kuvavarasto.lisaaKuva("TankDown2", ImageIO.read(getClass().getResourceAsStream(("TankDown2.png"))));
            Kuvavarasto.lisaaKuva("TankLeft2", ImageIO.read(getClass().getResourceAsStream(("TankLeft2.png"))));
            Kuvavarasto.lisaaKuva("TankRight2", ImageIO.read(getClass().getResourceAsStream(("TankRight2.png"))));
            Kuvavarasto.lisaaKuva("TankUp2", ImageIO.read(getClass().getResourceAsStream(("TankUp2.png"))));
            Kuvavarasto.lisaaKuva("luoti", ImageIO.read(getClass().getResourceAsStream(("luoti.png"))));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void lataaKuvat() {
        new Kuvalataaja();
    }
}
