package Peli;

import Peli.Kuvavarasto;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import Peli.Kuvavarasto;
import asepakkaus.Ammus;
import asepakkaus.Ase;
import asepakkaus.KertaAse;
import java.util.List;

public class Hahmo2 {

    private double x = 740;
    private double y = 640;

    private BufferedImage kuvaOikea = Kuvavarasto.getKuva("TankRight2");
    private BufferedImage kuvaVasen = Kuvavarasto.getKuva("TankLeft2");
    private BufferedImage kuvaYlos = Kuvavarasto.getKuva("TankUp2");
    private BufferedImage kuvaAlas = Kuvavarasto.getKuva("TankDown2");
    private BufferedImage aktiivinenKuva = kuvaVasen;

    private boolean oikeaJalka = true;
    private boolean ylosJalka = true;
    private boolean alasJalka = true;
    private boolean vasenJalka = true;
    private Ase tykki = new KertaAse();

    public List<Ammus> getAmmukset() {
        return tykki.getAmmukset();
    }

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
            tykki.setAseenSuuntaAsteina(270);
        } else {
            aktiivinenKuva = kuvaAlas;
            tykki.setAseenSuuntaAsteina(90);
        }
    }

    public void paivitaX(double dx) {
        this.x += dx;
        tykki.setRivi(this.x);

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

    private void paivitaJalkaXX() {

        aktiivinenKuva = kuvaVasen;
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
