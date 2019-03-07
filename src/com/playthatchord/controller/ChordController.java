package com.playthatchord.controller;

import com.playthatchord.model.chord.ChordBuilder;
import com.playthatchord.model.chord.ChordShape;
import com.playthatchord.model.chord.ChordStructure;
import com.playthatchord.model.constant.ChordConstant;
import com.playthatchord.view.GuitarView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChordController implements ActionListener {

    private ChordBuilder chordBuilder;

    public ChordController() {
        this.chordBuilder = new ChordBuilder();
    }



    private void clearGuitarView() {
        for (int string = 0; string < GuitarView.guitar_view_labels.length - 1; string++) {
            for (int fret = 1; fret < GuitarView.guitar_view_labels[string].length; fret++) {
                if(fret == 1)
                    GuitarView.guitar_view_labels[string][fret].setText("");
                else
                    GuitarView.guitar_view_labels[string][fret].setBackground(Color.WHITE);
            }
        }
    }

    private void updateGuitarView(int string, int fret) {
        if(string == -1) {
            return;
        }

        switch (fret) {
            case ChordConstant.Fret.MUTE:
                GuitarView.guitar_view_labels[string][fret + 2].setText("X");
                GuitarView.guitar_view_labels[string][fret + 2].setForeground(Color.WHITE);
                break;

            case ChordConstant.Fret.OPEN:
                GuitarView.guitar_view_labels[string][fret + 1].setText("O");
                GuitarView.guitar_view_labels[string][fret + 1].setForeground(Color.WHITE);
                break;

            default:
                GuitarView.guitar_view_labels[string][fret + 1].setBackground(Color.ORANGE);
        }
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Command: " + e.getActionCommand());

        clearGuitarView();

        switch (e.getActionCommand()) {
            case "C":
                System.out.println(e.getActionCommand() + " Note Clicked");

                ChordStructure chordStructure = this.chordBuilder.createCMajorChord();
                ChordShape[] chordShapes = chordStructure.getChordShapes();

                updateGuitarView(-1, chordShapes[0].getBarFret());
                updateGuitarView(0, chordShapes[0].getFretOnString1());
                updateGuitarView(1, chordShapes[0].getFretOnString2());
                updateGuitarView(2, chordShapes[0].getFretOnString3());
                updateGuitarView(3, chordShapes[0].getFretOnString4());
                updateGuitarView(4, chordShapes[0].getFretOnString5());
                updateGuitarView(5, chordShapes[0].getFretOnString6());

                break;

            case "C#":
                System.out.println(e.getActionCommand() + " Note Clicked");

                break;

            case "Db":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;

            case "D":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "D#":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "Eb":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "E":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "F":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "F#":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "Gb":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "G":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "G#":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "Ab":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "A":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "A#":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "Bb":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "B":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "Cm":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "C#m":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "Dbm":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "Dm":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "D#m":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "Ebm":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "Em":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "Fm":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "F#m":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "Gbm":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "Gm":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "G#m":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "Abm":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "Am":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "A#m":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "Bbm":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            case "Bm":
                System.out.println(e.getActionCommand() + " Note Clicked");
                break;
            default:
                System.out.println("ERROR");
        }

        System.out.println();

    }
}
