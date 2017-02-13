package Peli;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.JFrame;

public class Maps extends JFrame {

    JPanel pohjapaneeli = new JPanel();

    JButton map1 = new JButton("Map 1");
    JButton map2 = new JButton("Map 2");
    JButton map3 = new JButton("Map 3");
    JButton back = new JButton("Back");

    public Maps() {

//        ImageIcon mapp1 = new ImageIcon(getClass().getResource("map1.png"));
//        map1 = new JButton(mapp1);

        GroupLayout layout = new GroupLayout(pohjapaneeli);
        pohjapaneeli.setLayout(layout);

        layout.setAutoCreateContainerGaps(true);

        GroupLayout.SequentialGroup topRowX = layout.createSequentialGroup();
        topRowX.addComponent(map1, 200, 200, 200);

        GroupLayout.SequentialGroup midRowX = layout.createSequentialGroup();
        midRowX.addComponent(map2, 200, 200, 200);

        GroupLayout.SequentialGroup botRowX = layout.createSequentialGroup();
        botRowX.addComponent(map3, 200, 200, 200);

        GroupLayout.SequentialGroup lowRowX = layout.createSequentialGroup();
        lowRowX.addGap(137);
        lowRowX.addComponent(back);

        GroupLayout.ParallelGroup baseX = layout.createParallelGroup();
        baseX.addGroup(topRowX);
        baseX.addGroup(midRowX);
        baseX.addGroup(botRowX);
        baseX.addGroup(lowRowX);

        layout.setHorizontalGroup(baseX);

        GroupLayout.ParallelGroup topRowY = layout.createParallelGroup();
        topRowY.addComponent(map1, 100, 100, 100);

        GroupLayout.ParallelGroup midRowY = layout.createParallelGroup();
        midRowY.addComponent(map2, 100, 100, 100);

        GroupLayout.ParallelGroup botRowY = layout.createParallelGroup();
        botRowY.addComponent(map3, 100, 100, 100);

        GroupLayout.ParallelGroup lowRowY = layout.createParallelGroup();
        lowRowY.addComponent(back);

        GroupLayout.SequentialGroup baseY = layout.createSequentialGroup();
        baseY.addGap(10);
        baseY.addGroup(topRowY);
        baseY.addGap(10);
        baseY.addGroup(midRowY);
        baseY.addGap(10);
        baseY.addGroup(botRowY);
        baseY.addGap(10);
        baseY.addGroup(lowRowY);

        layout.setVerticalGroup(baseY);

        this.add(pohjapaneeli);
        this.setTitle("Maps");
        this.setLocation(450, 100);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        pohjapaneeli.setBackground(Color.ORANGE);

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
                nappaimisto.lisaaNappain(KeyEvent.VK_NUMPAD0, Toiminto.SHOOT);
                nappaimisto.lisaaNappain(KeyEvent.VK_SPACE, Toiminto.AMPUU);
                new PeliIkkuna(nappaimisto).setVisible(true);
                dispose();
            }

        });

        map2.addActionListener(new ActionListener() {
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
                nappaimisto.lisaaNappain(KeyEvent.VK_NUMPAD0, Toiminto.SHOOT);
                nappaimisto.lisaaNappain(KeyEvent.VK_SPACE, Toiminto.AMPUU);
                new PeliIkkuna2(nappaimisto).setVisible(true);
                dispose();
            }

        });
        
                map3.addActionListener(new ActionListener() {
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
                nappaimisto.lisaaNappain(KeyEvent.VK_NUMPAD0, Toiminto.SHOOT);
                nappaimisto.lisaaNappain(KeyEvent.VK_SPACE, Toiminto.AMPUU);
                new PeliIkkuna3(nappaimisto).setVisible(true);
                dispose();
            }

        });

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Menu().setVisible(true);
                dispose();
            }
        });

    }

//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                new Maps().setVisible(true);
//            }
//        });
//    }
}
