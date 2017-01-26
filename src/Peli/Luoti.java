package Peli;

import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public abstract class Luoti {

    private double rivi;
    private double sarake;
    private double nopeus;
    private double aktiivinenKuva;
    private int ammuksenElinIka;

    public Luoti(double rivi, double sarake, double nopeus, double suuntaKulma, int ammuksenElinIka) {
        this.rivi = rivi;
        this.sarake = sarake;
        this.nopeus = nopeus;
        this.aktiivinenKuva = aktiivinenKuva;
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
        return aktiivinenKuva;
    }

    public boolean onElossa() {
        return ammuksenElinIka > 0;
    }

    public void osui() {
        ammuksenElinIka = 0;
    }

    public synchronized void paivitaPaikka(double kitka, int ySuunta) {
        double todellinenNopeus = nopeus - kitka;
        rivi = rivi + ySuunta * todellinenNopeus * Math.sin(Math.toRadians(aktiivinenKuva));
        sarake = sarake + todellinenNopeus * Math.cos(Math.toRadians(aktiivinenKuva));
        this.ammuksenElinIka--;
    }

    public Shape getYmparoivaNelio() {
        return new Rectangle2D.Double(sarake, rivi, getKuva().getHeight(), getKuva().getWidth());
    }

    public abstract BufferedImage getKuva();
}
