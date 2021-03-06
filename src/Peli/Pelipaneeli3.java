package Peli;

import asepakkaus.Ammus;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class Pelipaneeli3 extends JPanel{
   private Hahmo pelihahmo=new Hahmo();
   private Hahmo2 pelihahmo2=new Hahmo2();
   private List<Ammus> ammukset=new ArrayList<Ammus>();
   
   
    
                                                //X, Y, koko  
 private Shape[] esteet={new Rectangle2D.Double(0,-10,800,1), //top
                           new Rectangle2D.Double(-10,0,1,700),  //left
                           new Rectangle2D.Double(0,669,800,1), //bot
                           new Rectangle2D.Double(789,0,1,700), //right
                           new Rectangle2D.Double(50,0,25,80), //vasen ylä este!
                           new Rectangle2D.Double(700,590,25,80), //oikea ala este!
                           new Rectangle2D.Double(605,105,25,150), 
                           new Rectangle2D.Double(160,105,25,150), 
                           new Rectangle2D.Double(605,380,25,150),  
                           new Rectangle2D.Double(160,380,25,150),
                           new Rectangle2D.Double(400,230,25,150)
    };
    private Paint estevari=Color.black;
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        g2.setPaint(estevari);
        for(Shape este:esteet) {
            g2.fill(este);
        }
       for(Ammus kuula:ammukset) {
           kuula.paivitaPaikka(0, -1);
           g2.drawImage(kuula.getKuva(), (int)kuula.getSarake(), (int)kuula.getRivi(), this);
       }
        System.out.println(ammukset);
       g2.drawImage(pelihahmo.getAktiivinenKuva(),(int)pelihahmo.getX(), (int)pelihahmo.getY(),this); 
       g2.drawImage(pelihahmo2.getAktiivinenKuva(),(int)pelihahmo2.getX(), (int)pelihahmo2.getY(),this); 
    }
    
    
    public void suoritaToiminto(Toiminto toiminto) {
        switch(toiminto) {
            case ALAS:siirryY(10);break;
            case YLOS:siirryY(-10);break;
            case VASEN:siirryX(-10);break;
            case OIKEA:siirryX(10);break;
            case DOWN:moveY(10);break;
            case UP:moveY(-10);break;
            case LEFT:moveX(-10);break;
            case RIGHT:moveX(10);break;
            case AMPUU:ammuhahmo();System.out.println("ampuu");break;
            case SHOOT:ammuhahmo2();System.out.println("shoot");
        };
    }

    private void ammuhahmo () {
        ammukset.addAll(pelihahmo.getAmmukset());System.out.println(ammukset);
    }
    
    private void ammuhahmo2 () {
        ammukset.addAll(pelihahmo2.getAmmukset());System.out.println(ammukset);
    }
    

   public void siirryY(int dy) {
        pelihahmo.setY(pelihahmo.getY()+dy);
        for(Shape este:esteet) {
            if(este.intersects(pelihahmo.getEnnakoivaNelio(0,dy).getBounds2D())) {
                pelihahmo.setY(pelihahmo.getY()-dy);
                repaint();
                return;
            }
        }
        pelihahmo.paivitaY(dy);
        repaint();
    }
    
    public void siirryX(int dx){
        pelihahmo.setX(pelihahmo.getX()+dx);
        for(Shape este:esteet) {
            if(este.intersects(pelihahmo.getEnnakoivaNelio(dx,0).getBounds2D())){
                pelihahmo.setX(pelihahmo.getX()-dx);
                repaint();
                return;
            }
        }
        pelihahmo.paivitaX(dx);
        repaint();
    }
    
    public void moveY(int dy) {
        pelihahmo2.setY(pelihahmo2.getY()+dy);
        for(Shape este:esteet) {
            if(este.intersects(pelihahmo2.getEnnakoivaNelio(0,dy).getBounds2D())) {
                pelihahmo2.setY(pelihahmo2.getY()-dy);
                repaint();
                return;
            }
        }
        pelihahmo2.paivitaY(dy);
        repaint();
    }
    
    public void moveX(int dx){
        pelihahmo2.setX(pelihahmo2.getX()+dx);
        for(Shape este:esteet) {
            if(este.intersects(pelihahmo2.getEnnakoivaNelio(dx,0).getBounds2D())){
                pelihahmo2.setX(pelihahmo2.getX()-dx);
                repaint();
                return;
            }
        }
        pelihahmo2.paivitaX(dx);
        repaint();
    }
    
}
