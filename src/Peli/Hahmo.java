package Peli;

import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;


public class Hahmo {
    private double x=0;
    private double y=0;    

    private BufferedImage kuvaVasen=Kuvavarasto.getKuva("TankLeft");
    private BufferedImage kuvaOikea=Kuvavarasto.getKuva("TankRight");
    private BufferedImage kuvaYlos=Kuvavarasto.getKuva("TankUp");
    private BufferedImage kuvaAlas=Kuvavarasto.getKuva("TankDown");
    private BufferedImage aktiivinenKuva=kuvaOikea;
    
    private boolean oikeaJalka=true;
    private boolean ylosJalka=true;
    private boolean alasJalka=true;
    private boolean vasenJalka=true;
    
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public void paivitaY(double dy) {
        this.y+=dy;
        paivitaJalkaY();
    }
    
    public void paivitaYY(double dy) {
        this.y+=dy;
        paivitaJalkaYY();
    }
    
    
    
    public void paivitaX(double dx) {
        this.x+=dx;
        paivitaJalkaX();
    }
    
    public void paivitaXX(double dx) {
        this.x+=dx;
        paivitaJalkaX();
    }
    
    
    private void paivitaJalkaY() {
        ylosJalka=!ylosJalka;
        aktiivinenKuva=ylosJalka?kuvaYlos:kuvaYlos;
    }
    
    private void paivitaJalkaYY() {
        alasJalka=!alasJalka;
        aktiivinenKuva=alasJalka?kuvaAlas:kuvaAlas;
    }
    
  
    
    
    private void paivitaJalkaX() {
        oikeaJalka=!oikeaJalka;
        aktiivinenKuva=oikeaJalka?kuvaOikea:kuvaOikea;
    }
    
     private void paivitaJalkaXX() {
        vasenJalka=!vasenJalka;
        aktiivinenKuva=vasenJalka?kuvaVasen:kuvaVasen;
    }
    
    public BufferedImage getAktiivinenKuva() {
        return aktiivinenKuva;
    }

    public Shape getNelio() {
        return new Rectangle2D.Double(x,y,aktiivinenKuva.getWidth(),aktiivinenKuva.getHeight());
    }
    
    public Shape getEnnakoivaNelio(double dx, double dy) {
        return new Rectangle2D.Double(x+dx,y+dy,aktiivinenKuva.getWidth(),aktiivinenKuva.getHeight());
    }
    
}
