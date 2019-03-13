package com.playthatchord.controller;

import com.playthatchord.model.chord.ChordBuilder;
import com.playthatchord.model.chord.ChordShape;
import com.playthatchord.model.chord.ChordStructure;
import com.playthatchord.model.constant.ChordConstant;
import com.playthatchord.view.ChordDescriptionView;
import com.playthatchord.view.ChordDetailView;
import com.playthatchord.view.GuitarView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChordController implements ActionListener {

    public static ActionEvent event;
    public static int variationCounter = 0;

    private ChordBuilder chordBuilder;
    private ChordStructure chordStructure;


    public ChordController() {
        this.chordBuilder = new ChordBuilder();
    }



    private void clearGuitarView() {
        ChordDescriptionView.chordDescription.setText("No Chord Selected");

        ChordDetailView.chordName.setText("Chord Name");
        ChordDetailView.noteName1.setText("Root");
        ChordDetailView.noteName2.setText("Third");
        ChordDetailView.noteName3.setText("Fifth");

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
        ChordShape[] chordShapes = null;


        switch (e.getActionCommand()) {
            case "Clear":
                break;

            case "C":
                System.out.println(e.getActionCommand() + " Note Clicked");

                this.chordStructure = this.chordBuilder.createCMajorChord();
                chordShapes = this.chordStructure.getChordShapes();

                ChordDetailView.chordName.setText("C Major");

                break;

            case "<html>C#<br>Db</html>":
                System.out.println(e.getActionCommand() + " Note Clicked");

                this.chordStructure = this.chordBuilder.createCsharpDflatChord();
                chordShapes = chordStructure.getChordShapes();

                ChordDetailView.chordName.setText("C# | Db Major");

                break;

            case "D":
                System.out.println(e.getActionCommand() + " Note Clicked");

                this.chordStructure = this.chordBuilder.createDMajorChord();
                chordShapes = chordStructure.getChordShapes();

                ChordDetailView.chordName.setText("D Major");

                break;

            case "<html>D#<br>Eb</html>":
                System.out.println(e.getActionCommand() + " Note Clicked");

                this.chordStructure = this.chordBuilder.createDsharpEflatMajorChord();
                chordShapes = chordStructure.getChordShapes();

                ChordDetailView.chordName.setText("D# | Eb Major");

                break;

            case "E":
                System.out.println(e.getActionCommand() + " Note Clicked");

                this.chordStructure = this.chordBuilder.createEMajorChord();
                chordShapes = chordStructure.getChordShapes();

                ChordDetailView.chordName.setText("E Major");

                break;

            case "F":
                System.out.println(e.getActionCommand() + " Note Clicked");

                this.chordStructure = this.chordBuilder.createFMajorChord();
                chordShapes = chordStructure.getChordShapes();

                ChordDetailView.chordName.setText("F Major");

                break;

            case "<html>F#<br>Gb</html>":
                System.out.println(e.getActionCommand() + " Note Clicked");

                this.chordStructure = this.chordBuilder.createFsharpGflatMajorChord();
                chordShapes = chordStructure.getChordShapes();

                ChordDetailView.chordName.setText("F# | Gb Major");

                break;

            case "G":
                System.out.println(e.getActionCommand() + " Note Clicked");

                this.chordStructure = this.chordBuilder.createGMajorChord();
                chordShapes = chordStructure.getChordShapes();

                ChordDetailView.chordName.setText("G Major");

                break;

            case "<html>G#<br>Ab</html>":
                System.out.println(e.getActionCommand() + " Note Clicked");

                this.chordStructure = this.chordBuilder.createGsharpAflatMajorChord();
                chordShapes = chordStructure.getChordShapes();

                ChordDetailView.chordName.setText("G# | Ab Major");

                break;

            case "A":
                System.out.println(e.getActionCommand() + " Note Clicked");

                this.chordStructure = this.chordBuilder.createAMajorChord();
                chordShapes = chordStructure.getChordShapes();

                ChordDetailView.chordName.setText("A Major");

                break;

            case "<html>A#<br>Bb</html>":
                System.out.println(e.getActionCommand() + " Note Clicked");

                this.chordStructure = this.chordBuilder.createAsharpBflatMajorChord();
                chordShapes = chordStructure.getChordShapes();

                ChordDetailView.chordName.setText("A# | Bb Major");

                break;

            case "B":
                System.out.println(e.getActionCommand() + " Note Clicked");

                this.chordStructure = this.chordBuilder.createBMajorChord();
                chordShapes = chordStructure.getChordShapes();

                ChordDetailView.chordName.setText("B Major");

                break;

            case "Cm":
                System.out.println(e.getActionCommand() + " Note Clicked");

                this.chordStructure = this.chordBuilder.createCMinorChord();
                chordShapes = chordStructure.getChordShapes();

                ChordDetailView.chordName.setText("C Minor");

                break;

            case "<html>C#m<br>Dbm</html>":
                System.out.println(e.getActionCommand() + " Note Clicked");

                this.chordStructure = this.chordBuilder.createCsharpDflatMinorChord();
                chordShapes = chordStructure.getChordShapes();

                ChordDetailView.chordName.setText("C# | Db Minor");

                break;

            case "Dm":
                System.out.println(e.getActionCommand() + " Note Clicked");

                this.chordStructure = this.chordBuilder.createDMinorChord();
                chordShapes = chordStructure.getChordShapes();

                ChordDetailView.chordName.setText("D Minor");

                break;

            case "<html>D#m<br>Ebm</html>":
                System.out.println(e.getActionCommand() + " Note Clicked");

                this.chordStructure = this.chordBuilder.createDsharpEflatMinorChord();
                chordShapes = chordStructure.getChordShapes();

                ChordDetailView.chordName.setText("D# | Eb Minor");

                break;

            case "Em":
                System.out.println(e.getActionCommand() + " Note Clicked");

                this.chordStructure = this.chordBuilder.createEMinorChord();
                chordShapes = chordStructure.getChordShapes();

                ChordDetailView.chordName.setText("E Minor");

                break;

            case "Fm":
                System.out.println(e.getActionCommand() + " Note Clicked");

                this.chordStructure = this.chordBuilder.createFMinorChord();
                chordShapes = chordStructure.getChordShapes();

                ChordDetailView.chordName.setText("F Minor");

                break;

            case "<html>F#m<br>Gbm</html>":
                System.out.println(e.getActionCommand() + " Note Clicked");

                this.chordStructure = this.chordBuilder.createFsharpGflatMinorChord();
                chordShapes = chordStructure.getChordShapes();

                ChordDetailView.chordName.setText("F# | Gb Minor");

                break;

            case "Gm":
                System.out.println(e.getActionCommand() + " Note Clicked");

                this.chordStructure = this.chordBuilder.createGMinorChord();
                chordShapes = chordStructure.getChordShapes();

                ChordDetailView.chordName.setText("G Minor");

                break;

            case "<html>G#m<br>Abm</html>":
                System.out.println(e.getActionCommand() + " Note Clicked");

                this.chordStructure = this.chordBuilder.createGsharpAflatMinorChord();
                chordShapes = chordStructure.getChordShapes();

                ChordDetailView.chordName.setText("G# | Ab Minor");

                break;

            case "Am":
                System.out.println(e.getActionCommand() + " Note Clicked");

                this.chordStructure = this.chordBuilder.createAMinorChord();
                chordShapes = chordStructure.getChordShapes();

                ChordDetailView.chordName.setText("A Minor");


                break;

            case "<html>A#m<br>Bbm</html>":
                System.out.println(e.getActionCommand() + " Note Clicked");

                this.chordStructure = this.chordBuilder.createAsharpBflatMinorChord();
                chordShapes = chordStructure.getChordShapes();

                ChordDetailView.chordName.setText("A# | Bb Minor");

                break;

            case "Bm":
                System.out.println(e.getActionCommand() + " Note Clicked");

                this.chordStructure = this.chordBuilder.createBMinorChord();
                chordShapes = chordStructure.getChordShapes();

                ChordDetailView.chordName.setText("B Minor");

                break;

            default:
                System.out.println("ERROR");
        }


        if ( chordShapes != null ) {
            if (variationCounter >= chordShapes.length) {
                variationCounter = 0;
            } else if (variationCounter < 0) {
                variationCounter = chordShapes.length - 1;
            }

            updateGuitarView(0, chordShapes[variationCounter].getBarFret(), null, null);
            updateGuitarView(1, chordShapes[variationCounter].getFretOnString1(), chordShapes[variationCounter].getNoteOnString1(), chordShapes[variationCounter].getFingerOnString1());
            updateGuitarView(2, chordShapes[variationCounter].getFretOnString2(), chordShapes[variationCounter].getNoteOnString2(), chordShapes[variationCounter].getFingerOnString2());
            updateGuitarView(3, chordShapes[variationCounter].getFretOnString3(), chordShapes[variationCounter].getNoteOnString3(), chordShapes[variationCounter].getFingerOnString3());
            updateGuitarView(4, chordShapes[variationCounter].getFretOnString4(), chordShapes[variationCounter].getNoteOnString4(), chordShapes[variationCounter].getFingerOnString4());
            updateGuitarView(5, chordShapes[variationCounter].getFretOnString5(), chordShapes[variationCounter].getNoteOnString5(), chordShapes[variationCounter].getFingerOnString5());
            updateGuitarView(6, chordShapes[variationCounter].getFretOnString6(), chordShapes[variationCounter].getNoteOnString6(), chordShapes[variationCounter].getFingerOnString6());


            ChordDetailView.noteName1.setText(this.chordStructure.getRootNote().getNoteName());
            ChordDetailView.noteName2.setText(this.chordStructure.getThirdNote().getNoteName());
            ChordDetailView.noteName3.setText(this.chordStructure.getFifthNote().getNoteName());

            ChordDescriptionView.chordDescription.setText(this.chordStructure.getChordDescription());
        }


        System.out.println();

    }
}
