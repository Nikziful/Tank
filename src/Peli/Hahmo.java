package Peli;

import Peli.Kuvavarasto;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import Peli.Kuvalataaja;
import asepakkaus.Ammus;
import asepakkaus.Ase;
import asepakkaus.KertaAse;
import java.util.List;

public class Hahmo {

    private double x = 0;
    private double y = 0;

    private BufferedImage kuvaVasen = Kuvavarasto.getKuva("TankLeft");
    private BufferedImage kuvaOikea = Kuvavarasto.getKuva("TankRight");
    private BufferedImage kuvaYlos = Kuvavarasto.getKuva("TankUp");
    private BufferedImage kuvaAlas = Kuvavarasto.getKuva("TankDown");
    private BufferedImage aktiivinenKuva = kuvaOikea;

    private boolean oikeaJalka = true;
    private boolean ylosJalka = true;
    private boolean alasJalka = true;
    private boolean vasenJalka = true;
    private Ase tykki = new KertaAse();

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
        this.y += dy;
        tykki.setRivi(this.y);
        if (dy < 0) {
            aktiivinenKuva = kuvaYlos;
            tykki.setAseenSuuntaAsteina(90);
        } else {
            aktiivinenKuva = kuvaAlas;
            tykki.setAseenSuuntaAsteina(270);
        }
    }

    public List<Ammus> getAmmukset() {
        return tykki.getAmmukset();
    }

    public void paivitaX(double dx) {
        this.x += dx;
        tykki.setSarake(this.x);
        if (dx < 0) {
            aktiivinenKuva = kuvaVasen;
            tykki.setAseenSuuntaAsteina(180);
        } else {
            aktiivinenKuva = kuvaOikea;
            tykki.setAseenSuuntaAsteina(0);
            
        }
    }

    private void paivitaJalkaY() {
        
        aktiivinenKuva = kuvaYlos;
        
    }

    private void paivitaJalkaX() {

        aktiivinenKuva = kuvaOikea;
    }

    public BufferedImage getAktiivinenKuva() {
        return aktiivinenKuva;
    }

    public Shape getNelio() {
        return new Rectangle2D.Double(x, y, aktiivinenKuva.getWidth(), aktiivinenKuva.getHeight());
    }

    public Shape getEnnakoivaNelio(double dx, double dy) {
        return new Rectangle2D.Double(x + dx, y + dy, aktiivinenKuva.getWidth(), aktiivinenKuva.getHeight());
    }

}
