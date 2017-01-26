package asepakkaus;

import java.util.HashMap;
import java.util.Map;


public class AseVarasto {
    private Map<Integer, Ase> aseet=new HashMap<Integer,Ase>();
    private int aktiivinenAseIndeksi=1;
     
    public AseVarasto() {
        
        aseet.put(1,new KertaAse());
    }
    
    public Ase getAse(int nro) {
        return aseet.get(nro);
    }
    public int getAseLkm() {
        return aseet.keySet().size();
    }
    
    public Ase getSeuraavaAse() { 
        aktiivinenAseIndeksi++;
        if(aseet.containsKey(aktiivinenAseIndeksi)) {
            return aseet.get(aktiivinenAseIndeksi);
        }
        aktiivinenAseIndeksi=1;
        return aseet.get(1);    
    } 
}
