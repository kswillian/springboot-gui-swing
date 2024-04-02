package com.kaminski.gui.swing.view;

import org.springframework.stereotype.Component;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class JPanelFooterView extends JPanel {

    public JPanel create(){

        var jLabel = new JLabel();

        new Timer(1000, actionEvent -> jLabel.setText(
                new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
                        .format(new Date())
            )
        ).start();

        setLayout(new FlowLayout(FlowLayout.RIGHT));
        add(jLabel);

        return this;
    }

}