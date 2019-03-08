package com.playthatchord.view;

import com.playthatchord.controller.ChordController;
import com.playthatchord.controller.ChordOptionController;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class ChordOptionView extends JPanel {


    public ChordOptionView() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JButton clearChord = new JButton("Clear");
        clearChord.addActionListener(new ChordController());
        clearChord.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(createDisplayOption());
        add(Box.createVerticalStrut(5));
        add(createChordVariationOption());
        add(Box.createVerticalStrut(15));
        add(clearChord);
    }


    private JPanel createDisplayOption() {
        JPanel displayOptions = new JPanel();

        Border border = BorderFactory.createTitledBorder("Chord Display Options");
        displayOptions.setBorder(border);


        JRadioButton notesButton = new JRadioButton("Notes");
        notesButton.setSelected(true);

        JRadioButton fingeringButton = new JRadioButton("Fingering");

        notesButton.addActionListener(new ChordOptionController());
        fingeringButton.addActionListener(new ChordOptionController());


        ButtonGroup group = new ButtonGroup();
        group.add(notesButton);
        group.add(fingeringButton);

        displayOptions.add(notesButton);
        displayOptions.add(fingeringButton);

        return displayOptions;
    }


    private JPanel createChordVariationOption() {
        JPanel variationOptions = new JPanel();

        Border border = BorderFactory.createTitledBorder("Change Chord Variations");
        variationOptions.setBorder(border);

        JButton previous = new JButton("Previous");
        JButton next = new JButton("Next");

        previous.addActionListener(new ChordOptionController());
        next.addActionListener(new ChordOptionController());

        variationOptions.add(previous);
        variationOptions.add(next);

        return variationOptions;
    }
}
