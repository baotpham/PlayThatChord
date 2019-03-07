package com.playthatchord.controller;

import com.playthatchord.model.constant.ChordConstant;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ChordOptionController implements ActionListener {


    public static int selectedChordDisplayOption = ChordConstant.ChordDisplayOption.Notes;


    @Override
    public void actionPerformed(ActionEvent e) {
        JRadioButton button = (JRadioButton) e.getSource();

        System.out.println("Selected " + button.getText());

        if ( button.getText().equals("Notes") ) {
            selectedChordDisplayOption = ChordConstant.ChordDisplayOption.Notes;
        } else if ( button.getText().equals("Fingering") ) {
            selectedChordDisplayOption = ChordConstant.ChordDisplayOption.Fingering;
        }

    }


}
