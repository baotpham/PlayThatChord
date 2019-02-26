package com.playthatchord.view;

import javax.swing.*;
import java.awt.*;


public class GuitarView extends JPanel{


    public GuitarView() {
        setLayout(new GridLayout(6, 22));
        setPreferredSize(new Dimension(1000, 200));

        for(int i = 0; i < 132; i++){
            JButton b = new JButton(" ");
            add(b);
        }
    }
}
