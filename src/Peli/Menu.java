package Peli;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Menu extends JFrame {
    
    private JPanel pohjapaneeli=new JPanel();
    
    private JTextField pelinNimi=new JTextField("Tank vs Tank");
    
    private JButton pelaaNappi=new JButton("Play!");
    private JButton asetuksetNappi=new JButton("Settings");
    private JButton ohjeNappi=new JButton("How to play?");

    public Menu () {
        
        GroupLayout layout = new GroupLayout(pohjapaneeli);
        pohjapaneeli.setLayout(layout);
        
        layout.setAutoCreateContainerGaps(true);
        
        GroupLayout.SequentialGroup topRowX = layout.createSequentialGroup();
        topRowX.addComponent(pelaaNappi, 200, 200, 200);

        GroupLayout.SequentialGroup midRowX = layout.createSequentialGroup();
        midRowX.addComponent(asetuksetNappi, 200, 200, 200);

        GroupLayout.SequentialGroup botRowX = layout.createSequentialGroup();
        botRowX.addComponent(ohjeNappi, 200, 200, 200);

        GroupLayout.ParallelGroup baseX = layout.createParallelGroup();
        baseX.addGroup(topRowX);
        baseX.addGroup(midRowX);
        baseX.addGroup(botRowX);

        layout.setHorizontalGroup(baseX);

        GroupLayout.ParallelGroup topRowY = layout.createParallelGroup();
        topRowY.addComponent(pelaaNappi, 100, 100, 100);

        GroupLayout.ParallelGroup midRowY = layout.createParallelGroup();
        midRowY.addComponent(asetuksetNappi, 100, 100, 100);

        GroupLayout.ParallelGroup botRowY = layout.createParallelGroup();
        botRowY.addComponent(ohjeNappi, 100, 100, 100);

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
        
        
        asetuksetNappi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AsetuksetIkkuna().setVisible(true);
                dispose();
            }
        });
        
        ohjeNappi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new OpetusIkkuna().setVisible(true);
                dispose();
            }
        });
        
        pelaaNappi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               Nappainkonfiguraatio nappaimisto=new Nappainkonfiguraatio();
               Nappainkonfiguraatio nappaimisto2=new Nappainkonfiguraatio();
                nappaimisto2.lisaaNappain(KeyEvent.VK_RIGHT, Toiminto.OIKEA);
                nappaimisto2.lisaaNappain(KeyEvent.VK_LEFT, Toiminto.VASEN);
                nappaimisto2.lisaaNappain(KeyEvent.VK_UP, Toiminto.YLOS);
                nappaimisto2.lisaaNappain(KeyEvent.VK_DOWN, Toiminto.ALAS);
                nappaimisto.lisaaNappain(KeyEvent.VK_D, Toiminto.OIKEA);
                nappaimisto.lisaaNappain(KeyEvent.VK_S, Toiminto.ALAS);
                nappaimisto.lisaaNappain(KeyEvent.VK_A, Toiminto.VASEN);
                nappaimisto.lisaaNappain(KeyEvent.VK_W, Toiminto.YLOS);
                new PeliIkkuna(nappaimisto).setVisible(true);
                dispose();
            }
        });
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

}
