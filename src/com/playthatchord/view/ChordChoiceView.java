package com.playthatchord.view;

import javax.swing.*;
import java.awt.*;

public class ChordChoiceView {

    private JPanel chordChoicePanel;


    public ChordChoiceView(){
        this.chordChoicePanel = new JPanel();

        this.chordChoicePanel.setLayout(new GridLayout(0, 12));

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



        this.chordChoicePanel.add(cBtn);
        this.chordChoicePanel.add(cDPanel);
        this.chordChoicePanel.add(dBtn);
        this.chordChoicePanel.add(dEPanel);
        this.chordChoicePanel.add(eBtn);
        this.chordChoicePanel.add(fBtn);
        this.chordChoicePanel.add(fGPanel);
        this.chordChoicePanel.add(gBtn);
        this.chordChoicePanel.add(gAPanel);
        this.chordChoicePanel.add(aBtn);
        this.chordChoicePanel.add(aBPanel);
        this.chordChoicePanel.add(bBtn);


        this.chordChoicePanel.add(cMinorBtn);
        this.chordChoicePanel.add(cDMinorPanel);
        this.chordChoicePanel.add(dMinorBtn);
        this.chordChoicePanel.add(dEMinorPanel);
        this.chordChoicePanel.add(eMinorBtn);
        this.chordChoicePanel.add(fMinorBtn);
        this.chordChoicePanel.add(fGMinorPanel);
        this.chordChoicePanel.add(gMinorBtn);
        this.chordChoicePanel.add(gAMinorPanel);
        this.chordChoicePanel.add(aMinorBtn);
        this.chordChoicePanel.add(aBMinorPanel);
        this.chordChoicePanel.add(bMinorBtn);
    }


    private JPanel createSubPanels(JButton btn1, JButton btn2) {
        JPanel subPanel = new JPanel();
        subPanel.setLayout(new BoxLayout(subPanel, BoxLayout.Y_AXIS));
        subPanel.add(btn1);
        subPanel.add(btn2);

        return subPanel;
    }


    public JPanel createChordChoicePanel() {
        return this.chordChoicePanel;
    }
}
