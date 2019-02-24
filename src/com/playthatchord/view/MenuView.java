package com.playthatchord.view;

import javax.swing.*;

public class MenuView {

    private JMenuBar mb;


    public MenuView() {
        mb = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");

        mb.add(fileMenu);
        mb.add(helpMenu);

        JMenuItem exitItem = new JMenuItem("exit");
        fileMenu.add(exitItem);
    }


    public JMenuBar createMenuBar() {
        return this.mb;
    }
}
