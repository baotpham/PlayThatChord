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

    public static ActionEvent event;
    public static int variationCounter = 0;

    private ChordBuilder chordBuilder;

    public ChordController() {
        this.chordBuilder = new ChordBuilder();
    }



    private void clearGuitarView() {
        for (int string = 0; string < GuitarView.guitar_view_labels.length - 1; string++) {
            for (int fret = 1; fret < GuitarView.guitar_view_labels[string].length; fret++) {

                GuitarView.guitar_view_labels[string][fret].setText("");

                if ((string == 4 && (fret == 3 || fret == 5 || fret == 7 || fret == 9 || fret == 15 || fret == 17 || fret == 19 || fret == 21)) ||
                        ((string == 3 || string == 5) && fret == 12)) {
                    GuitarView.guitar_view_labels[string][fret].setText("•");
                    GuitarView.guitar_view_labels[string][fret].setBackground(Color.WHITE);

                } else if ( fret != 1 && string != 0 )
                    GuitarView.guitar_view_labels[string][fret].setBackground(Color.WHITE);
            }
        }
    }



    private void updateGuitarView(int string, int fret, String note, String finger) {
        if( string == 0 ) {
            if (fret == ChordConstant.Fret.MUTE) {
                return;
            } else {
                GuitarView.guitar_view_labels[string][fret + 1].setText("Bar");
                return;
            }
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

                if (ChordOptionController.selectedChordDisplayOption == ChordConstant.ChordDisplayOption.Fingering)
                    GuitarView.guitar_view_labels[string][fret + 1].setText(finger);
                else if (ChordOptionController.selectedChordDisplayOption == ChordConstant.ChordDisplayOption.Notes)
                    GuitarView.guitar_view_labels[string][fret + 1].setText(note);
        }
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if( e == null ) {
            return;
        }

        System.out.println("Command: " + e.getActionCommand());

        event = e;
        clearGuitarView();

        switch (e.getActionCommand()) {
            case "Clear":
                break;

            case "C":
                System.out.println(e.getActionCommand() + " Note Clicked");

                ChordStructure chordStructure = this.chordBuilder.createCMajorChord();
                ChordShape[] chordShapes = chordStructure.getChordShapes();

                if ( variationCounter >= chordShapes.length ) {
                    variationCounter = 0;
                } else if ( variationCounter < 0 ) {
                    variationCounter = chordShapes.length - 1;
                }

                updateGuitarView(0, chordShapes[variationCounter].getBarFret(), null, null);
                updateGuitarView(1, chordShapes[variationCounter].getFretOnString1(), chordShapes[variationCounter].getNoteOnString1(), chordShapes[variationCounter].getFingerOnString1());
                updateGuitarView(2, chordShapes[variationCounter].getFretOnString2(), chordShapes[variationCounter].getNoteOnString2(), chordShapes[variationCounter].getFingerOnString2());
                updateGuitarView(3, chordShapes[variationCounter].getFretOnString3(), chordShapes[variationCounter].getNoteOnString3(), chordShapes[variationCounter].getFingerOnString3());
                updateGuitarView(4, chordShapes[variationCounter].getFretOnString4(), chordShapes[variationCounter].getNoteOnString4(), chordShapes[variationCounter].getFingerOnString4());
                updateGuitarView(5, chordShapes[variationCounter].getFretOnString5(), chordShapes[variationCounter].getNoteOnString5(), chordShapes[variationCounter].getFingerOnString5());
                updateGuitarView(6, chordShapes[variationCounter].getFretOnString6(), chordShapes[variationCounter].getNoteOnString6(), chordShapes[variationCounter].getFingerOnString6());

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
