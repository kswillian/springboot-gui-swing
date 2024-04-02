package com.kaminski.gui.swing.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.JFrame;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

@Configuration
public class JFrameConfiguration {

    private static final String APPLICATION_NAME = "Spring + Swing";

    @Bean
    public JFrame getJFrame() {

        var jFrame = new JFrame(APPLICATION_NAME);
        jFrame.setTitle(APPLICATION_NAME);
        jFrame.setSize(800, 500);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        return jFrame;
    }

}