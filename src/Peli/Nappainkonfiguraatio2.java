package Peli;

import java.util.HashMap;
import java.util.Map;

public class Nappainkonfiguraatio2 {
    private final Map<Integer, Toiminto> nappaimet2=new HashMap<>();
    
    public void lisaaNappain(int nappainkoodi, Toiminto toiminto) {
        nappaimet2.put(nappainkoodi, toiminto);
    }
    
    public Toiminto getToiminto(int nappainkoodi){
        if(!nappaimet2.containsKey(nappainkoodi)) return Toiminto.TYHJA;
        return nappaimet2.get(nappainkoodi);
    }
}
