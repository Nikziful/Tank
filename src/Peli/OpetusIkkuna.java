package Peli;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class OpetusIkkuna extends JFrame{
    
    private JPanel pohjapaneeli=new JPanel();
    
    private JTextField ekaNappi=new JTextField("How to play");
    
    private JTextField pelaaja1=new JTextField("Player 1");
    private JTextField l1=new JTextField("up 'W'");
    private JTextField l2=new JTextField("down 's'");
    private JTextField l3=new JTextField("left 'a'");
    private JTextField l4=new JTextField("");
    private JTextField l5=new JTextField("");
    
    private JTextField pelaaja2=new JTextField("player 2");
    private JTextField r1=new JTextField("");
    private JTextField r2=new JTextField("");
    private JTextField r3=new JTextField("");
    private JTextField r4=new JTextField("");
    private JTextField r5=new JTextField("");
    
    
    private JButton takasNappi=new JButton("Back");
    
    public OpetusIkkuna() {

        GroupLayout layout = new GroupLayout(pohjapaneeli);
        pohjapaneeli.setLayout(layout);
        
        layout.setAutoCreateContainerGaps(true);
        
        GroupLayout.SequentialGroup topRowX = layout.createSequentialGroup();
        topRowX.addComponent(aanetNappi, 200, 200, 200);

        GroupLayout.SequentialGroup midRowX = layout.createSequentialGroup();
        midRowX.addComponent(pisteNappi, 200, 200, 200);

        GroupLayout.SequentialGroup botRowX = layout.createSequentialGroup();
        botRowX.addComponent(vaikeusNappi, 200, 200, 200);
        
        GroupLayout.SequentialGroup lowestRowX = layout.createSequentialGroup();
        lowestRowX.addComponent(takasNappi);
        GroupLayout.ParallelGroup baseX = layout.createParallelGroup();
        baseX.addGroup(topRowX);
        baseX.addGroup(midRowX);
        baseX.addGroup(botRowX);
        baseX.addGroup(lowestRowX);

        layout.setHorizontalGroup(baseX);

        GroupLayout.ParallelGroup topRowY = layout.createParallelGroup();
        topRowY.addComponent(aanetNappi, 100, 100, 100);

        GroupLayout.ParallelGroup midRowY = layout.createParallelGroup();
        midRowY.addComponent(pisteNappi, 100, 100, 100);

        GroupLayout.ParallelGroup botRowY = layout.createParallelGroup();
        botRowY.addComponent(vaikeusNappi, 100, 100, 100);
        
        GroupLayout.ParallelGroup lowestRowY = layout.createParallelGroup();
        lowestRowY.addComponent(takasNappi);

        GroupLayout.SequentialGroup baseY = layout.createSequentialGroup();
        baseY.addGap(10);
        baseY.addGroup(topRowY);
        baseY.addGroup(midRowY);
        baseY.addGroup(botRowY);
        baseY.addGroup(lowestRowY);

        layout.setVerticalGroup(baseY);
        
        this.add(pohjapaneeli);
        this.setTitle("Settings");
        this.setLocation(450, 100);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    
        takasNappi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Menu().setVisible(true);
                dispose();
            }
        });
}
    
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new OpetusIkkuna().setVisible(true);
            }
        });
    }
}
