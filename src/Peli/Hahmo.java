package Peli;

import java.awt.Color;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;


public class Hahmo {
    private double x=0;
    private double y=0;    private double koko=40;
    private Paint vari=Color.BLUE;
    private BufferedImage kuvaVasen=Kuvavarasto.getKuva("");
    private BufferedImage kuvaOikea=Kuvavarasto.getKuva("ukkoOO");
    private BufferedImage aktiivinenKuva=kuvaOikea;
    private boolean oikeaJalka=true;
    
    
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
        paivitaJalka();
    }
    
    public void paivitaX(double dx) {
        this.x+=dx;
        paivitaJalka();
    }
    
    private void paivitaJalka() {
        oikeaJalka=!oikeaJalka;
        aktiivinenKuva=oikeaJalka?kuvaOikea:kuvaVasen;
    }
    public BufferedImage getAktiivinenKuva() {
        return aktiivinenKuva;
    }

    public double getKoko() {
        return koko;
    }

    public Paint getVari() {
        return vari;
    }
    
    public Shape getNelio() {
        return new Rectangle2D.Double(x,y,aktiivinenKuva.getWidth(),aktiivinenKuva.getHeight());
    }
    
    public Shape getEnnakoivaNelio(double dx, double dy) {
        return new Rectangle2D.Double(x+dx,y+dy,aktiivinenKuva.getWidth(),aktiivinenKuva.getHeight());
    }
    
}
