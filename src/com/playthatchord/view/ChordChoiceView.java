package com.playthatchord.view;

import com.playthatchord.controller.ChordController;

import javax.swing.*;
import java.awt.*;




public class ChordChoiceView extends JPanel{
    

    public ChordChoiceView(){

        setPreferredSize(new Dimension(1000, 100));
        setLayout(new GridLayout(0, 12));
        setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 10));


        /* Major Buttons */
        JButton cBtn = new JButton("C");
        JButton cDBtn = new JButton("<html>C#<br>Db</html>");

        JButton dBtn = new JButton("D");
        JButton dEBtn = new JButton("<html>D#<br>Eb</html>");

        JButton eBtn = new JButton("E");

        JButton fBtn = new JButton("F");
        JButton fGBtn = new JButton("<html>F#<br>Gb</html>");

        JButton gBtn = new JButton("G");
        JButton gABtn = new JButton("<html>G#<br>Ab</html>");

        JButton aBtn = new JButton("A");
        JButton aBBtn = new JButton("<html>A#<br>Bb</html>");

        JButton bBtn = new JButton("B");


        cBtn.addActionListener(new ChordController());
        cDBtn.addActionListener(new ChordController());
        dBtn.addActionListener(new ChordController());
        dEBtn.addActionListener(new ChordController());
        eBtn.addActionListener(new ChordController());
        fBtn.addActionListener(new ChordController());
        fGBtn.addActionListener(new ChordController());
        gBtn.addActionListener(new ChordController());
        gABtn.addActionListener(new ChordController());
        aBtn.addActionListener(new ChordController());
        aBBtn.addActionListener(new ChordController());
        bBtn.addActionListener(new ChordController());


        /* Minor Buttons */
        JButton cMinorBtn = new JButton("Cm");
        JButton cDMinorBtn = new JButton("<html>C#m<br>Dbm</html>");

        JButton dMinorBtn = new JButton("Dm");
        JButton dEMinorBtn = new JButton("<html>D#m<br>Ebm</html>");

        JButton eMinorBtn = new JButton("Em");

        JButton fMinorBtn = new JButton("Fm");
        JButton fGMinorBtn = new JButton("<html>F#m<br>Gbm</html>");

        JButton gMinorBtn = new JButton("Gm");
        JButton gAMinorBtn = new JButton("<html>G#m<br>Abm</html>");

        JButton aMinorBtn = new JButton("Am");
        JButton aBMinorBtn = new JButton("<html>A#m<br>Bbm</html>");

        JButton bMinorBtn = new JButton("Bm");


        cMinorBtn.addActionListener(new ChordController());
        cDMinorBtn.addActionListener(new ChordController());
        dMinorBtn.addActionListener(new ChordController());
        dEMinorBtn.addActionListener(new ChordController());
        eMinorBtn.addActionListener(new ChordController());
        fMinorBtn.addActionListener(new ChordController());
        fGMinorBtn.addActionListener(new ChordController());
        gMinorBtn.addActionListener(new ChordController());
        gAMinorBtn.addActionListener(new ChordController());
        aMinorBtn.addActionListener(new ChordController());
        aBMinorBtn.addActionListener(new ChordController());
        bMinorBtn.addActionListener(new ChordController());



        /* add everything to panels */
        add(cBtn);
        add(cDBtn);
        add(dBtn);
        add(dEBtn);
        add(eBtn);
        add(fBtn);
        add(fGBtn);
        add(gBtn);
        add(gABtn);
        add(aBtn);
        add(aBBtn);
        add(bBtn);


        add(cMinorBtn);
        add(cDMinorBtn);
        add(dMinorBtn);
        add(dEMinorBtn);
        add(eMinorBtn);
        add(fMinorBtn);
        add(fGMinorBtn);
        add(gMinorBtn);
        add(gAMinorBtn);
        add(aMinorBtn);
        add(aBMinorBtn);
        add(bMinorBtn);
    }


    private JPanel createSubPanels(JButton btn1, JButton btn2) {
        JPanel subPanel = new JPanel();
        subPanel.setLayout(new BoxLayout(subPanel, BoxLayout.Y_AXIS));
        subPanel.add(btn1);
        subPanel.add(btn2);

        return subPanel;
    }
    
}
