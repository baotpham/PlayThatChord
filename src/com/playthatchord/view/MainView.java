package com.playthatchord.view;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;



public class MainView {

    public MainView () {
        JFrame frame = new JFrame("PlayThatChord");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setResizable(false);

        MenuView menuView = new MenuView();


        JPanel chordPanel = new JPanel();
        ChordChoiceView chordChoiceView = new ChordChoiceView();
        ChordDetailView chordDetailView = new ChordDetailView();

        chordPanel.add(chordChoiceView);
        chordPanel.add(chordDetailView);



        /* guitar panels */
        JPanel guitarPanel = new JPanel();
        GuitarView guitarView = new GuitarView();
        ChordOptionView chordOptionView = new ChordOptionView();

        guitarPanel.add(guitarView);
        guitarPanel.add(chordOptionView);


        /* main frame */
        frame.getContentPane().add(BorderLayout.NORTH, menuView);
        frame.getContentPane().add(chordPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, guitarPanel);


        frame.setVisible(true);
        frame.pack();
    }

}
