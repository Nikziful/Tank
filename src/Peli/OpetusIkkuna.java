package Peli;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.BASELINE;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class OpetusIkkuna extends JFrame{
    
    private JPanel pohjapaneeli=new JPanel(new GridLayout());
    
    private JLabel ekaNappi=new JLabel("How to play");
    
    private JLabel pelaaja1=new JLabel("Player 1:");
    private JLabel r1=new JLabel("up 'W'");
    private JLabel r2=new JLabel("down 's'");
    private JLabel r3=new JLabel("left 'a'");
    private JLabel r4=new JLabel("right 'd'");
    private JLabel r5=new JLabel("shoot 'space'");
    
    private JLabel pelaaja2=new JLabel("player 2:");
    private JLabel l1=new JLabel("up 'numpad 8'");
    private JLabel l2=new JLabel("down 'numpad 5'");
    private JLabel l3=new JLabel("left 'numpad 4'");
    private JLabel l4=new JLabel("right 'numpad 6'");
    private JLabel l5=new JLabel("shoot 'numpad 0");
    
    private JButton takasNappi=new JButton("Back");
    
    public OpetusIkkuna() {

        GroupLayout layout = new GroupLayout(pohjapaneeli);
        pohjapaneeli.setLayout(layout);
        
        layout.setAutoCreateContainerGaps(true);
        layout.setAutoCreateGaps(true);

        GroupLayout.SequentialGroup upperSideBySideGroupX = layout.createSequentialGroup();
        upperSideBySideGroupX.addComponent(pelaaja1);
        upperSideBySideGroupX.addGap(67);
        upperSideBySideGroupX.addComponent(pelaaja2);

        GroupLayout.SequentialGroup midSideBySideGroupX = layout.createSequentialGroup();
        midSideBySideGroupX.addComponent(r1);
        midSideBySideGroupX.addGap(80);
        midSideBySideGroupX.addComponent(l1);

        GroupLayout.SequentialGroup botSideBySideGroupX = layout.createSequentialGroup();
        botSideBySideGroupX.addComponent(ekaNappi);
        
        GroupLayout.SequentialGroup lowerBotSideBySideGroupX = layout.createSequentialGroup();
        lowerBotSideBySideGroupX.addComponent(r2);
        lowerBotSideBySideGroupX.addGap(67);
        lowerBotSideBySideGroupX.addComponent(l2);
        
        GroupLayout.SequentialGroup thirdBotSideBySideGroupX = layout.createSequentialGroup();
        thirdBotSideBySideGroupX.addComponent(r3);
        thirdBotSideBySideGroupX.addGap(81);
        thirdBotSideBySideGroupX.addComponent(l3);
        
        GroupLayout.SequentialGroup fourthBotSideBySideGroupX = layout.createSequentialGroup();
        fourthBotSideBySideGroupX.addComponent(r4);
        fourthBotSideBySideGroupX.addGap(73);
        fourthBotSideBySideGroupX.addComponent(l4);
        
        GroupLayout.SequentialGroup fifthBotSideBySideGroupX = layout.createSequentialGroup();
        fifthBotSideBySideGroupX.addComponent(r5);
        fifthBotSideBySideGroupX.addGap(56);
        fifthBotSideBySideGroupX.addComponent(l5);
        
        GroupLayout.SequentialGroup sixthBotSideGroupX = layout.createSequentialGroup();
        sixthBotSideGroupX.addGap(160);
        sixthBotSideGroupX.addComponent(takasNappi);
        
        GroupLayout.ParallelGroup baseX = layout.createParallelGroup();
        baseX.addGroup(upperSideBySideGroupX);
        baseX.addGroup(midSideBySideGroupX);
        baseX.addGroup(botSideBySideGroupX);
        baseX.addGroup(lowerBotSideBySideGroupX);
        baseX.addGroup(thirdBotSideBySideGroupX);
        baseX.addGroup(fourthBotSideBySideGroupX);
        baseX.addGroup(fifthBotSideBySideGroupX);
        baseX.addGroup(sixthBotSideGroupX);

        layout.setHorizontalGroup(baseX);
        
        GroupLayout.ParallelGroup lowerRowY = layout.createParallelGroup(BASELINE);
        lowerRowY.addComponent(r2);
        lowerRowY.addComponent(l2);

        GroupLayout.ParallelGroup botRowY = layout.createParallelGroup(BASELINE);
        botRowY.addComponent(r1);
        botRowY.addComponent(l1);

        GroupLayout.ParallelGroup topRowY = layout.createParallelGroup(BASELINE);
        topRowY.addComponent(ekaNappi);
        
        GroupLayout.ParallelGroup midRowY = layout.createParallelGroup(BASELINE);
        midRowY.addComponent(pelaaja1);
        midRowY.addComponent(pelaaja2);
        
        GroupLayout.ParallelGroup thirdRowY = layout.createParallelGroup(BASELINE);
        thirdRowY.addComponent(r3);
        thirdRowY.addComponent(l3);
        
        GroupLayout.ParallelGroup fourthRowY = layout.createParallelGroup(BASELINE);
        fourthRowY.addComponent(r4);
        fourthRowY.addComponent(l4);
        
        GroupLayout.ParallelGroup fifthRowY = layout.createParallelGroup(BASELINE);
        fifthRowY.addComponent(r5);
        fifthRowY.addComponent(l5);
        
        GroupLayout.ParallelGroup sixthRowY = layout.createParallelGroup();
        sixthRowY.addComponent(takasNappi);
        
        GroupLayout.SequentialGroup baseY = layout.createSequentialGroup();
        baseY.addGroup(topRowY);
        baseY.addGap(10);
        baseY.addGroup(midRowY);
        baseY.addGap(10);
        baseY.addGroup(botRowY);
        baseY.addGap(10);
        baseY.addGroup(lowerRowY);
        baseY.addGap(10);
        baseY.addGroup(thirdRowY);
        baseY.addGap(10);
        baseY.addGroup(fourthRowY);
        baseY.addGap(10);
        baseY.addGroup(fifthRowY);
        baseY.addGap(10);
        baseY.addGroup(sixthRowY);

        
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
