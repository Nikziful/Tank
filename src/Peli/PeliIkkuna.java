package Peli;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PeliIkkuna extends JFrame {

    private final Pelipaneeli paneeli = new Pelipaneeli();
    private Nappainkonfiguraatio nappaimisto;
    

    PeliIkkuna(Nappainkonfiguraatio nappis) {
        this.nappaimisto = nappis;
        this.add(paneeli);
        this.setSize(796, 698);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                paneeli.suoritaToiminto(nappaimisto.getToiminto(e.getKeyCode()));
            }
        });
    }
    
    

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Nappainkonfiguraatio nappaimisto=new Nappainkonfiguraatio();
                nappaimisto.lisaaNappain(KeyEvent.VK_D, Toiminto.OIKEA);
                nappaimisto.lisaaNappain(KeyEvent.VK_A, Toiminto.VASEN);
                nappaimisto.lisaaNappain(KeyEvent.VK_W, Toiminto.YLOS);
                nappaimisto.lisaaNappain(KeyEvent.VK_S, Toiminto.ALAS);
                
                nappaimisto.lisaaNappain(KeyEvent.VK_ESCAPE, Toiminto.MENU);
                
                nappaimisto.lisaaNappain(KeyEvent.VK_NUMPAD6, Toiminto.RIGHT);
                nappaimisto.lisaaNappain(KeyEvent.VK_NUMPAD4, Toiminto.LEFT);
                nappaimisto.lisaaNappain(KeyEvent.VK_NUMPAD8, Toiminto.UP);
                nappaimisto.lisaaNappain(KeyEvent.VK_NUMPAD5, Toiminto.DOWN);
//                nappaimisto.lisaaNappain(KeyEvent.VK_Q, Toiminto.AMPUU);
//                nappaimisto.lisaaNappain(KeyEvent.VK_E, Toiminto.AMPUU);
                new PeliIkkuna(nappaimisto).setVisible(true);
                
            }
        });
    }
}
 