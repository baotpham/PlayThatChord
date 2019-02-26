package com.playthatchord.view;

import com.playthatchord.controller.MenuController;

import javax.swing.*;

public class MenuView extends JMenuBar{


    public MenuView() {

        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");

        add(fileMenu);
        add(helpMenu);

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(new MenuController());


        fileMenu.add(exitItem);
    }

}
