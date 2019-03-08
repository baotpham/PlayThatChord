package com.playthatchord.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Command: " + e.getActionCommand());

        switch (e.getActionCommand()) {
            case "Exit":
                int n = JOptionPane.showConfirmDialog(
                        null,
                        "Are you sure you want to exit the program?",
                        "Alert",
                        JOptionPane.YES_NO_OPTION);

                if (n == 1) {
                    return;
                } else {
                    System.exit(0);
                }

                break;

            case "About":
                JOptionPane.showMessageDialog(null,
                        "Play that Chord \nDeveloped by Bao Pham \nv1.0",
                        "About",
                        JOptionPane.PLAIN_MESSAGE);
                break;

            case "Help":
                Object[] possibilities = {"What is PlayThatChord?", "How to Use"};

                String s = (String)JOptionPane.showInputDialog(
                        null,
                        "What do you need help with?",
                        "Help",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        possibilities,
                        "What is PlayThatChord?");

                if (( s != null ) && (s.length() > 0)) {
                    if(s.equals("What is PlayThatChord?")) {
                        JOptionPane.showMessageDialog(null,
                                "PlayThatChord is a software that allows you find chord shapes on a 6-string guitar." +
                                        "\nIt also shows you different variations of chord shapes along with fingering.",
                                "What is PlayThatChord?",
                                JOptionPane.PLAIN_MESSAGE);

                    } else if (s.equals("How to Use")) {
                        JOptionPane.showMessageDialog(null,
                                "You simply select a chord button on top of the window."
                                        + "\nPlayThatChord will shows you chord structure, chord shapes, chord fingering, and chord description."
                                        + "\nYou can also use Chord Option area on the right of the screen for different settings",
                                "How to Use",
                                JOptionPane.PLAIN_MESSAGE);
                    }
                }

                break;

            default:
                System.out.println("ERROR");
        }

        System.out.println();
    }
}
