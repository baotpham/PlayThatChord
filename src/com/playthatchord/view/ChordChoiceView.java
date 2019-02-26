package com.playthatchord.view;

import com.playthatchord.controller.ChordController;

import javax.swing.*;
import java.awt.*;




public class ChordChoiceView extends JPanel{
    

    public ChordChoiceView(){

        setLayout(new GridLayout(0, 12));
        setPreferredSize(new Dimension(1000, 150));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        /* Major Buttons */
        JButton cBtn = new JButton("C");
        JButton cSharpBtn = new JButton("C#");
        JButton dFlatBtn = new JButton("Db");
        JButton dBtn = new JButton("D");
        JButton dSharpBtn = new JButton("D#");
        JButton eFlatBtn = new JButton("Eb");
        JButton eBtn = new JButton("E");
        JButton fBtn = new JButton("F");
        JButton fSharpBtn = new JButton("F#");
        JButton gFlatBtn = new JButton("Gb");
        JButton gBtn = new JButton("G");
        JButton gSharpBtn = new JButton("G#");
        JButton aFlatBtn = new JButton("Ab");
        JButton aBtn = new JButton("A");
        JButton aSharpBtn = new JButton("A#");
        JButton bFlatBtn = new JButton("Bb");
        JButton bBtn = new JButton("B");

        cBtn.addActionListener(new ChordController());
        cSharpBtn.addActionListener(new ChordController());
        dFlatBtn.addActionListener(new ChordController());
        dBtn.addActionListener(new ChordController());
        dSharpBtn.addActionListener(new ChordController());
        eFlatBtn.addActionListener(new ChordController());
        eBtn.addActionListener(new ChordController());
        fBtn.addActionListener(new ChordController());
        fSharpBtn.addActionListener(new ChordController());
        gFlatBtn.addActionListener(new ChordController());
        gBtn.addActionListener(new ChordController());
        gSharpBtn.addActionListener(new ChordController());
        aFlatBtn.addActionListener(new ChordController());
        aBtn.addActionListener(new ChordController());
        aSharpBtn.addActionListener(new ChordController());
        bFlatBtn.addActionListener(new ChordController());
        bBtn.addActionListener(new ChordController());


        /* Minor Buttons */
        JButton cMinorBtn = new JButton("Cm");
        JButton cSharpMinorBtn = new JButton("C#m");
        JButton dFlatMinorBtn = new JButton("Dbm");
        JButton dMinorBtn = new JButton("Dm");
        JButton dSharpMinorBtn = new JButton("D#m");
        JButton eFlatMinorBtn = new JButton("Ebm");
        JButton eMinorBtn = new JButton("Em");
        JButton fMinorBtn = new JButton("Fm");
        JButton fSharpMinorBtn = new JButton("F#m");
        JButton gFlatMinorBtn = new JButton("Gbm");
        JButton gMinorBtn = new JButton("Gm");
        JButton gSharpMinorBtn = new JButton("G#m");
        JButton aFlatMinorBtn = new JButton("Abm");
        JButton aMinorBtn = new JButton("Am");
        JButton aSharpMinorBtn = new JButton("A#m");
        JButton bFlatMinorBtn = new JButton("Bbm");
        JButton bMinorBtn = new JButton("Bm");

        cMinorBtn.addActionListener(new ChordController());
        cSharpMinorBtn.addActionListener(new ChordController());
        dFlatMinorBtn.addActionListener(new ChordController());
        dMinorBtn.addActionListener(new ChordController());
        dSharpMinorBtn.addActionListener(new ChordController());
        eFlatMinorBtn.addActionListener(new ChordController());
        eMinorBtn.addActionListener(new ChordController());
        fMinorBtn.addActionListener(new ChordController());
        fSharpMinorBtn.addActionListener(new ChordController());
        gFlatMinorBtn.addActionListener(new ChordController());
        gMinorBtn.addActionListener(new ChordController());
        gSharpMinorBtn.addActionListener(new ChordController());
        aFlatMinorBtn.addActionListener(new ChordController());
        aMinorBtn.addActionListener(new ChordController());
        aSharpMinorBtn.addActionListener(new ChordController());
        bFlatMinorBtn.addActionListener(new ChordController());
        bMinorBtn.addActionListener(new ChordController());


        /* create in between panels */
        JPanel cDPanel = createSubPanels(cSharpBtn, dFlatBtn);
        JPanel dEPanel = createSubPanels(dSharpBtn, eFlatBtn);
        JPanel fGPanel = createSubPanels(fSharpBtn, gFlatBtn);
        JPanel gAPanel = createSubPanels(gSharpBtn, aFlatBtn);
        JPanel aBPanel = createSubPanels(aSharpBtn, bFlatBtn);


        JPanel cDMinorPanel = createSubPanels(cSharpMinorBtn, dFlatMinorBtn);
        JPanel dEMinorPanel = createSubPanels(dSharpMinorBtn, eFlatMinorBtn);
        JPanel fGMinorPanel = createSubPanels(fSharpMinorBtn, gFlatMinorBtn);
        JPanel gAMinorPanel = createSubPanels(gSharpMinorBtn, aFlatMinorBtn);
        JPanel aBMinorPanel = createSubPanels(aSharpMinorBtn, bFlatMinorBtn);



        /* add everything to panels */
        add(cBtn);
        add(cDPanel);
        add(dBtn);
        add(dEPanel);
        add(eBtn);
        add(fBtn);
        add(fGPanel);
        add(gBtn);
        add(gAPanel);
        add(aBtn);
        add(aBPanel);
        add(bBtn);


        add(cMinorBtn);
        add(cDMinorPanel);
        add(dMinorBtn);
        add(dEMinorPanel);
        add(eMinorBtn);
        add(fMinorBtn);
        add(fGMinorPanel);
        add(gMinorBtn);
        add(gAMinorPanel);
        add(aMinorBtn);
        add(aBMinorPanel);
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
