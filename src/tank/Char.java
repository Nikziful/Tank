package tank;

import java.awt.Color;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;


public class Char {

    private double x=0;
    private double y=0;
    private double Size=40;
    private Paint color=Color.BLUE;

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

    public double getSize() {
        return Size;
    }

    public Paint getColor() {
        return color;
    }
    
    public Shape getSquare() {
        return new Rectangle2D.Double(x,y,Size,Size);
    }
    
    
}


