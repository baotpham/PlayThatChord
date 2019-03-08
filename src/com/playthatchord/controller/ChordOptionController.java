package com.playthatchord.controller;

import com.playthatchord.model.constant.ChordConstant;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ChordOptionController implements ActionListener {


    public static int selectedChordDisplayOption = ChordConstant.ChordDisplayOption.Notes;
    private ChordController chordController = new ChordController();


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Command: " + e.getActionCommand());

        switch (e.getActionCommand()) {
            case "Previous":
                ChordController.variationCounter--;
                this.chordController.actionPerformed(ChordController.event);
                break;

            case "Next":
                ChordController.variationCounter++;
                this.chordController.actionPerformed(ChordController.event);
                break;

            case "Notes":
                selectedChordDisplayOption = ChordConstant.ChordDisplayOption.Notes;
                this.chordController.actionPerformed(ChordController.event);
                break;

            case "Fingering":
                selectedChordDisplayOption = ChordConstant.ChordDisplayOption.Fingering;
                this.chordController.actionPerformed(ChordController.event);
                break;

            default:
                break;
        }

    }


}
