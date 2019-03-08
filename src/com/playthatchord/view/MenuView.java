package com.playthatchord.view;

import com.playthatchord.controller.MenuController;

import javax.swing.*;

public class MenuView extends JMenuBar{


    public MenuView() {

        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");


        /* file menu */
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(new MenuController());

        fileMenu.add(exitItem);


        /* help menu */
        JMenuItem aboutItem = new JMenuItem("About");
        aboutItem.addActionListener(new MenuController());

        JMenuItem helpItem = new JMenuItem("Help");
        helpItem.addActionListener(new MenuController());


        helpMenu.add(aboutItem);
        helpMenu.add(helpItem);


        add(fileMenu);
        add(helpMenu);
    }

}
