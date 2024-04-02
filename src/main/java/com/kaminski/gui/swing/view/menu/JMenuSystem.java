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
public class JMenuSystem extends JMenu {

    private final JOptionPaneCustom JOptionPaneCustom;

    @PostConstruct
    public JMenu init(){
        create();
        return this;
    }

    private void create(){

        setText("System");

        var jMenuItemSystemDetails = new JMenuItem("Details");
        var jMenuItemDeviceDetails = new JMenuItem("My Device");

        jMenuItemSystemDetails.addActionListener(actionEvent ->
                JOptionPaneCustom.showJOptionPane(
                        "Aviso","Página em construção!", JOptionPane.WARNING_MESSAGE)
        );

        jMenuItemDeviceDetails.addActionListener(actionEvent ->
                JOptionPaneCustom.showJOptionPane(
                        "Aviso","Página em construção!", JOptionPane.WARNING_MESSAGE)
        );

        add(jMenuItemSystemDetails);
        add(jMenuItemDeviceDetails);

    }
}
