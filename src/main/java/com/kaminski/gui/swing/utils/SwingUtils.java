package com.kaminski.gui.swing.utils;

import lombok.experimental.UtilityClass;

import javax.swing.*;

@UtilityClass
public class SwingUtils {

    public static void showJOptionPane(String title, String message, int jOptionPane){
        JOptionPane.showMessageDialog(null, message, title, jOptionPane);
    }

    public static boolean showConfirmeJOptionPane(String title, String message){
        var response = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        return response == JOptionPane.YES_NO_OPTION;
    }
}
