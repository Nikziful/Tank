package Peli;

import java.util.HashMap;
import java.util.Map;

public class Nappainkonfiguraatio {
    private final Map<Integer, Toiminto> nappaimet=new HashMap<>();
    
    public void lisaaNappain(int nappainkoodi, Toiminto toiminto) {
        nappaimet.put(nappainkoodi, toiminto);
    }
    
    public Toiminto getToiminto(int nappainkoodi){
        if(!nappaimet.containsKey(nappainkoodi)) return Toiminto.TYHJA;
        return nappaimet.get(nappainkoodi);
    }
}
