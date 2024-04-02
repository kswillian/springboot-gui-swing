package com.kaminski.gui.swing.view;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.swing.JFrame;
import java.awt.BorderLayout;

@Component
@RequiredArgsConstructor
public class JFrameMainView extends JFrame {

    private final JMenuBarMainView jMenuBarMainView;
    private final JPanelWelcomeView jPaneLWelcomeView;
    private final JPanelFooterView jPanelFooterView;
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
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setJMenuBar(jMenuBarMainView);
        getContentPane().add(jPaneLWelcomeView);
        add(jPanelFooterView, BorderLayout.SOUTH);

        setVisible(true);
    }
}
