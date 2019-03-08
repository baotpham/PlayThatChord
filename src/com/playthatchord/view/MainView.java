package com.playthatchord.view;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;



public class MainView {

    public MainView () {
        JFrame frame = new JFrame("PlayThatChord");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(false);

        MenuView menuView = new MenuView();


        /* chord panel */
        JPanel chordPanel = new JPanel();
        ChordChoiceView chordChoiceView = new ChordChoiceView();
        ChordDetailView chordDetailView = new ChordDetailView();

        chordPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        chordPanel.add(chordChoiceView);
        chordPanel.add(chordDetailView);



        /* guitar panels */
        JPanel guitarPanel = new JPanel();
        GuitarView guitarView = new GuitarView();
        ChordOptionView chordOptionView = new ChordOptionView();


        guitarPanel.add(guitarView);
        guitarPanel.add(Box.createHorizontalStrut(10));
        guitarPanel.add(chordOptionView);
        guitarPanel.add(Box.createHorizontalStrut(10));


        /* chord choice and guitar panel */
        JPanel midPanel = new JPanel();
        midPanel.setLayout(new BoxLayout(midPanel, BoxLayout.Y_AXIS));
        chordPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        guitarPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        midPanel.add(chordPanel);
        midPanel.add(guitarPanel);


        /* chord description */
        ChordDescriptionView chordDescriptionView = new ChordDescriptionView();


        /* main frame */
        frame.getContentPane().add(BorderLayout.NORTH, menuView);
        frame.getContentPane().add(midPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, chordDescriptionView);


        frame.setVisible(true);
        frame.pack();
    }

}
