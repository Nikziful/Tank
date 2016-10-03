package Peli;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import Peli.Kuvalataaja;


public class Kuvavarasto {
    private final static Map<String, BufferedImage> kuvat=new HashMap<>();
    
    static {
        Kuvalataaja.lataaKuvat();
    }
    
    private Kuvavarasto() {
        
    }
    public static BufferedImage getKuva(String nimi){
        return kuvat.get(nimi);
    }
    
    public static void lisaaKuva(String nimi, BufferedImage kuva) {
        if(!onKuva(nimi)) kuvat.put(nimi,kuva);
    }
    
    public static boolean onKuva(String nimi) {
        return kuvat.containsKey(nimi);
    }
    
    public static Set<String> getKuvienNimet() {
        return kuvat.keySet();
    }
}
