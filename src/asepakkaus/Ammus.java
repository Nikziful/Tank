package asepakkaus;

import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;


public abstract class Ammus {   
    private double rivi;
    private double sarake;   
    private double nopeus;
    private double suuntaKulma;  
    private int ammuksenElinIka;
 
    public Ammus(double rivi, double sarake, double nopeus, double suuntaKulma, int ammuksenElinIka) {
        this.rivi = rivi;
        this.sarake = sarake;
        this.nopeus = nopeus;
        this.suuntaKulma = suuntaKulma;
        this.ammuksenElinIka = ammuksenElinIka;
    }
    
    public double getNopeus() {
        return nopeus;
    }

    public double getRivi() {
        return rivi;
    }

    public double getSarake() {
        return sarake;
    }

    public double getSuuntaKulma() {
        return suuntaKulma;
    }
    
    public boolean onElossa() {
        return ammuksenElinIka>0;
    }

    public void osui() {
       ammuksenElinIka=0;
    } 
 
    public synchronized void paivitaPaikka(double kitka,int ySuunta) {
        double todellinenNopeus=nopeus-kitka;
        rivi=rivi+ySuunta*todellinenNopeus*Math.sin(Math.toRadians(suuntaKulma));
        sarake=sarake+todellinenNopeus*Math.cos(Math.toRadians(suuntaKulma));
        this.ammuksenElinIka--;
    } 
    
    public Shape getYmparoivaNelio() {
        return new Rectangle2D.Double(sarake,rivi,getKuva().getHeight(), getKuva().getWidth());
    } 

    @Override
    public String toString() {
        return "Ammus{" + "rivi=" + rivi + ", sarake=" + sarake + ", nopeus=" + nopeus + ", suuntaKulma=" + suuntaKulma + ", ammuksenElinIka=" + ammuksenElinIka + '}';
    }
    
    
    
    public abstract BufferedImage getKuva();
}
