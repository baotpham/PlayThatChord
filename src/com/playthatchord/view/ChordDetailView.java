package com.playthatchord.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ChordDetailView extends JPanel {


    public static JLabel chordName = new JLabel("Chord Name");
    public static JLabel noteName1 = new JLabel("Root");
    public static JLabel noteName2 = new JLabel("Third");
    public static JLabel noteName3 = new JLabel("Fifth");


    public ChordDetailView() {
        setPreferredSize(new Dimension(200, 100));

        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        chordName.setFont(new Font("Serif", Font.PLAIN, 30));
        chordName.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(chordName);



        noteName1.setOpaque(true);
        noteName2.setOpaque(true);
        noteName3.setOpaque(true);

        noteName1.setBorder(new EmptyBorder(10,10,10,10));
        noteName2.setBorder(new EmptyBorder(10,10,10,10));
        noteName3.setBorder(new EmptyBorder(10,10,10,10));

        noteName1.setBackground(Color.ORANGE);
        noteName2.setBackground(Color.ORANGE);
        noteName3.setBackground(Color.ORANGE);


        JPanel notesPanel = new JPanel();
        notesPanel.add(noteName1);
        notesPanel.add(noteName2);
        notesPanel.add(noteName3);


        add(notesPanel);


    }

}
