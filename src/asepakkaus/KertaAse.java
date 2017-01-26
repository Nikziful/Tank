package asepakkaus;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;


public class KertaAse extends Ase{
    private BufferedImage kuva;
       
    public KertaAse() {
        try {
            kuva=ImageIO.read(new File("luoti.png"));
        } catch (IOException ex) {
            
        }
    }
    
    @Override
    public List<Ammus> getAmmukset() {
        List<Ammus> ammukset=new ArrayList<Ammus>();
        ammukset.add(new TavallinenAmmus(rivi,sarake,15,aseenSuuntaAsteina,kuva,500));      
        return ammukset;
    }    
}
