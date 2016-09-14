package Peli;

import Peli.Nappainkonfiguraatio;
import Peli.Pelipaneeli;
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
                nappaimisto.lisaaNappain(KeyEvent.VK_RIGHT, Toiminto.OIKEA);
                nappaimisto.lisaaNappain(KeyEvent.VK_D, Toiminto.OIKEA);
                nappaimisto.lisaaNappain(KeyEvent.VK_LEFT, Toiminto.VASEN);
                nappaimisto.lisaaNappain(KeyEvent.VK_UP, Toiminto.YLOS);
                nappaimisto.lisaaNappain(KeyEvent.VK_DOWN, Toiminto.ALAS);
                new PeliIkkuna(nappaimisto).setVisible(true);
            }
        });
    }
}
