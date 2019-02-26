package com.playthatchord.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "Exit":
                int n = JOptionPane.showConfirmDialog(
                        null,
                        "Are you sure you want to exit the program?",
                        "Alert",
                        JOptionPane.YES_NO_OPTION);

                if (n == 1) {
                    return;
                } else {
                    System.exit(0);
                }

            default:
                System.out.println("ERROR");
        }
    }
}
