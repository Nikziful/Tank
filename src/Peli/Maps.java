package Peli;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.JFrame;

public class Maps extends JFrame {

    JPanel pohjapaneeli = new JPanel();

    JButton map1 = new JButton();
    JButton map2 = new JButton("Tulossa pian!");
    JButton map3 = new JButton("Tulossa pian!");

    public Maps() {
        
        ImageIcon mapp1 = new ImageIcon(getClass().getResource("map1.png"));
        map1 = new JButton (mapp1);

        
        GroupLayout layout = new GroupLayout(pohjapaneeli);
        pohjapaneeli.setLayout(layout);

        layout.setAutoCreateContainerGaps(true);

        GroupLayout.SequentialGroup topRowX = layout.createSequentialGroup();
        topRowX.addComponent(map1, 200, 200, 200);

        GroupLayout.SequentialGroup midRowX = layout.createSequentialGroup();
        midRowX.addComponent(map2, 200, 200, 200);

        GroupLayout.SequentialGroup botRowX = layout.createSequentialGroup();
        botRowX.addComponent(map3, 200, 200, 200);

        GroupLayout.ParallelGroup baseX = layout.createParallelGroup();
        baseX.addGroup(topRowX);
        baseX.addGroup(midRowX);
        baseX.addGroup(botRowX);

        layout.setHorizontalGroup(baseX);

        GroupLayout.ParallelGroup topRowY = layout.createParallelGroup();
        topRowY.addComponent(map1, 100, 100, 100);

        GroupLayout.ParallelGroup midRowY = layout.createParallelGroup();
        midRowY.addComponent(map2, 100, 100, 100);

        GroupLayout.ParallelGroup botRowY = layout.createParallelGroup();
        botRowY.addComponent(map3, 100, 100, 100);

        GroupLayout.SequentialGroup baseY = layout.createSequentialGroup();
        baseY.addGap(10);
        baseY.addGroup(topRowY);
        baseY.addGroup(midRowY);
        baseY.addGroup(botRowY);

        layout.setVerticalGroup(baseY);

        this.add(pohjapaneeli);
        this.setTitle("Main menu");
        this.setLocation(450, 100);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        

        map1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Nappainkonfiguraatio nappaimisto = new Nappainkonfiguraatio();
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
                dispose();
            }

        });

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Maps().setVisible(true);
            }
        });
    }
}
