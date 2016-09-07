package Peli;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

public class Pelipaneeli extends JPanel{
    private Hahmo pelihahmo=new Hahmo();
    
    private Shape[] esteet={new Rectangle2D.Double(100,160,100,100), 
                            new Rectangle2D.Double(300,200,50,50),
                            new Rectangle2D.Double(0,-10,600,10)
    };
    private Paint estevari=Color.orange;
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        g2.setPaint(estevari);
        for(Shape este:esteet) {
            g2.fill(este);
        }
        g2.setPaint(pelihahmo.getVari());
        g2.fill(pelihahmo.getNelio());
    }
    
    public void suoritaToiminto(Toiminto toiminto) {
        switch(toiminto) {
            case ALAS:siirryY(10);break;
            case YLOS:siirryY(-10);break;
            case VASEN:siirryX(-10);break;
            case OIKEA:siirryX(10);break;
        };
    }
    
    public void siirryY(int dy) {
        pelihahmo.setY(pelihahmo.getY()+dy);
        for(Shape este:esteet) {
            if(este.intersects(pelihahmo.getNelio().getBounds2D())) {
                pelihahmo.setY(pelihahmo.getY()-dy);
                repaint();
                return;
            }
        }
        repaint();
    }
    
    public void siirryX(int dx){
        pelihahmo.setX(pelihahmo.getX()+dx);
        for(Shape este:esteet) {
            if(este.intersects(pelihahmo.getNelio().getBounds2D())){
                pelihahmo.setX(pelihahmo.getX()-dx);
                repaint();
                return;
            }
        }
        repaint();
    }
    
}
