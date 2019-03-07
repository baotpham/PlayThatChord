package com.playthatchord.view;

import com.playthatchord.controller.ChordOptionController;

import javax.swing.*;
import javax.swing.border.Border;


public class ChordOptionView extends JPanel {


    public ChordOptionView() {

        JRadioButton notesButton = new JRadioButton("Notes");
        notesButton.setSelected(true);

        JRadioButton fingeringButton = new JRadioButton("Fingering");

        notesButton.addActionListener(new ChordOptionController());
        fingeringButton.addActionListener(new ChordOptionController());


        ButtonGroup group = new ButtonGroup();
        group.add(notesButton);
        group.add(fingeringButton);


        Border border = BorderFactory.createTitledBorder("Chord Display Options");
        setBorder(border);


        add(notesButton);
        add(fingeringButton);
    }
}
