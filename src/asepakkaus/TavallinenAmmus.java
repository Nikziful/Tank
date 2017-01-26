package asepakkaus;

import java.awt.image.BufferedImage;


public class TavallinenAmmus extends Ammus{
   
    private BufferedImage kuva;
 
    public TavallinenAmmus(double rivi, double sarake, double nopeus, double suuntaKulma, BufferedImage kuva, int ammuksenElinIka) {
        super(rivi,sarake,nopeus,suuntaKulma,ammuksenElinIka);
        this.kuva=kuva;
    }
    
    @Override
    public BufferedImage getKuva() {
        return kuva;
    }    
}
