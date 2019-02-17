package com.playthatchord.view;

import javax.swing.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;



public class MainView {

    public MainView () {
        JFrame frame = new JFrame("PlayThatChord");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
    }
}
