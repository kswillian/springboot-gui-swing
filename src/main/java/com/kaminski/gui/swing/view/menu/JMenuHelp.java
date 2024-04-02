package com.kaminski.gui.swing.view.menu;

import com.kaminski.gui.swing.view.JOptionPaneCustom;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

@Component
@RequiredArgsConstructor
public class JMenuHelp extends JMenu {

    private final JOptionPaneCustom JOptionPaneCustom;

    @PostConstruct
    public JMenu init(){
        create();
        return this;
    }

    private void create(){

        setText("Help");

        var jMenuItemInformation = new JMenuItem("Info.");

        jMenuItemInformation.addActionListener(actionEvent ->
                JOptionPaneCustom.showJOptionPane(
                        "Aviso","Versão: 0.0.1-SNAPSHOT", JOptionPane.INFORMATION_MESSAGE)
        );

        add(jMenuItemInformation);
    }
}
