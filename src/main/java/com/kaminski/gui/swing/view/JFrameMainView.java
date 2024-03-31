package com.kaminski.gui.swing.view;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class JFrameMainView extends JFrame {

    private static final String APPLICATION_NAME = "Spring + Swing";

    @PostConstruct
    public JFrame init(){
        create();
        return this;
    }

    private void create(){

        setTitle(APPLICATION_NAME);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
