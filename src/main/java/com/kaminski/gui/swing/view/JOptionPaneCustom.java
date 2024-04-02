package com.kaminski.gui.swing.view;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

@Component
@RequiredArgsConstructor
public class JOptionPaneCustom {

    private final JFrame jFrame;

    public void showJOptionPane(String title, String message, int jOptionPane){
        JOptionPane.showMessageDialog(jFrame, message, title, jOptionPane);
    }

    public boolean showConfirmeJOptionPane(String title, String message){
        var response = JOptionPane.showConfirmDialog(jFrame, message, title, JOptionPane.YES_NO_OPTION);
        return response == JOptionPane.YES_NO_OPTION;
    }
}
