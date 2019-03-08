package com.playthatchord.view;

import javax.swing.*;
import java.awt.*;


public class GuitarView extends JPanel {


    public static JLabel[][] guitar_view_labels = new JLabel[8][24];


    public GuitarView() {
        setLayout(new GridLayout(8, 22));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setPreferredSize(new Dimension(1000, 200));

        for (int string = 0; string < guitar_view_labels.length; string++) {
            for (int fret = 0; fret < guitar_view_labels[string].length; fret++) {

                guitar_view_labels[string][fret] = new JLabel("", SwingConstants.CENTER);
                guitar_view_labels[string][fret].setOpaque(true);

                if( string == 0 ) {
                    add(guitar_view_labels[string][fret]);
                    continue;

                } else if ( string == 7 && fret != 0 ) {
                    guitar_view_labels[string][fret].setText(Integer.toString(fret - 1));

                } else if (fret == 0) {
                    switch (string) {
                        case 1:
                            guitar_view_labels[string][fret].setText("e");
                            break;
                        case 2:
                            guitar_view_labels[string][fret].setText("B");
                            break;
                        case 3:
                            guitar_view_labels[string][fret].setText("G");
                            break;
                        case 4:
                            guitar_view_labels[string][fret].setText("D");
                            break;
                        case 5:
                            guitar_view_labels[string][fret].setText("A");
                            break;
                        case 6:
                            guitar_view_labels[string][fret].setText("E");
                            break;
                        default:
                            break;
                    }

                } else if (fret == 1) {
                    guitar_view_labels[string][fret].setBackground(Color.BLACK);
                    guitar_view_labels[string][fret].setPreferredSize(new Dimension(3, 5));

                } else if (string == 4 && (fret == 3 || fret == 5 || fret == 7 || fret == 9 || fret == 15 || fret == 17 || fret == 19 || fret == 21)
                            || ((string == 3 || string == 5) && fret == 12)) {
                    guitar_view_labels[string][fret].setBackground(Color.WHITE);
                    guitar_view_labels[string][fret].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                    guitar_view_labels[string][fret].setText("•");

                } else {
                    guitar_view_labels[string][fret].setBackground(Color.WHITE);
                    guitar_view_labels[string][fret].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                }

                add(guitar_view_labels[string][fret]);
            }
        }

    }
}