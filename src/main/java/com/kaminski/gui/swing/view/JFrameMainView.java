package com.kaminski.gui.swing.view;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
@RequiredArgsConstructor
public class JFrameMainView extends JFrame {

    private final JMenuBarMainView jMenuBarMainView;
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
        setJMenuBar(jMenuBarMainView);
        setVisible(true);
    }
}
