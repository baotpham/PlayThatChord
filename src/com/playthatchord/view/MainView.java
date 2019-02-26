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
        ChordChoiceView chordChoiceView = new ChordChoiceView();
        GuitarView guitarView = new GuitarView();

        frame.getContentPane().add(BorderLayout.NORTH, menuView);
        frame.getContentPane().add(chordChoiceView);
        frame.getContentPane().add(BorderLayout.SOUTH, guitarView);

        frame.setVisible(true);
        frame.pack();
    }

}
