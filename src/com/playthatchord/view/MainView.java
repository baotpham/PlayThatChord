package com.playthatchord.view;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;



public class MainView {

    public MainView () {
        JFrame frame = new JFrame("PlayThatChord");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(2000, 2000);

        MenuView menuView = new MenuView();
        ChordChoiceView chordChoiceView = new ChordChoiceView();

        frame.getContentPane().add(BorderLayout.NORTH, menuView.createMenuBar());
        frame.getContentPane().add(BorderLayout.NORTH, chordChoiceView.createChordChoicePanel());

        frame.setVisible(true);
        frame.pack();
    }

}
