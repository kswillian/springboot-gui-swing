package com.kaminski.gui.swing.view;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class JPanelFooterView extends JPanel {

    private JLabel jLabel;

    @PostConstruct
    public JPanel init(){
        create();
        return this;
    }

    private void create(){

        jLabel = new JLabel();

        var timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                var dateFormated = format.format(new Date());
                jLabel.setText(dateFormated);
            }
        });
        timer.start();

        setLayout(new FlowLayout(FlowLayout.RIGHT));
        add(jLabel);

    }

}