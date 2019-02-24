package com.playthatchord.controller;

import com.playthatchord.model.chord.ChordBuilder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChordController implements ActionListener {

    private ChordBuilder chordBuilder;

    public ChordController() {
        this.chordBuilder = new ChordBuilder();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Command: " + e.getActionCommand());

        switch (e.getActionCommand()) {
            case "C":
                System.out.println(e.getActionCommand() + " Note Clicked");
                this.chordBuilder.createCMajorChord();
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
