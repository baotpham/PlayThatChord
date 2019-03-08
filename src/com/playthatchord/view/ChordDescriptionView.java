package com.playthatchord.view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ChordDescriptionView extends JPanel {

    public static JTextArea chordDescription = new JTextArea(20, 100);


    public ChordDescriptionView() {
        Border border = BorderFactory.createTitledBorder("Chord Description");
        setBorder(border);

        chordDescription.setText("No Chord Selected");
        chordDescription.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        chordDescription.setEditable(false);
        chordDescription.setLineWrap(true);
        chordDescription.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane( chordDescription );

        add(scrollPane, BorderLayout.PAGE_START);
    }
}
