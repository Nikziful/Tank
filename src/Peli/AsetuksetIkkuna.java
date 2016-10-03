package Peli;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class AsetuksetIkkuna extends JFrame{
    
    private JPanel pohjapaneeli=new JPanel();
    
    private JButton aanetNappi=new JButton("Music on/off");
    private JButton pisteNappi=new JButton("Max points");
    private JButton vaikeusNappi=new JButton("Hardcore!");
    private JButton takasNappi=new JButton("Back");
    
    public AsetuksetIkkuna() {

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
                new AsetuksetIkkuna().setVisible(true);
            }
        });
    }
}
