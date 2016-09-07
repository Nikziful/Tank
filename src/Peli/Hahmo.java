package Peli;

import java.awt.Color;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;


public class Hahmo {

    private double x=0;
    private double y=0;
    private double koko=40;
    private Paint vari=Color.BLUE;

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

    public double getKoko() {
        return koko;
    }

    public Paint getVari() {
        return vari;
    }
    
    public Shape getNelio() {
        return new Rectangle2D.Double(x,y,koko,koko);
    }
    
    
}


