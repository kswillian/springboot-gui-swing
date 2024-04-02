package com.kaminski.gui.swing.view;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;

@Component
public class JPanelWelcomeView extends JPanel {

    private JLabel jLabel;

    @PostConstruct
    public JPanel init(){
        create();
        return this;
    }

    private void create(){

        setLayout(new GridBagLayout());

        jLabel = new JLabel();
        jLabel.setText("Bem-vindo!");

        add(jLabel);
    }
}