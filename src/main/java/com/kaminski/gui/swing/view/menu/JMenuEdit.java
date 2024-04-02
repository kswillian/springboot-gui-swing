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
public class JMenuEdit extends JMenu {

    private final JOptionPaneCustom JOptionPaneCustom;

    @PostConstruct
    public JMenu init(){
        create();
        return this;
    }

    private void create(){

        setText("Edit");

        var jMenuItemCopy = new JMenuItem("Copy");
        var jMenuItemCut = new JMenuItem("Cut");

        jMenuItemCopy.addActionListener(actionEvent ->
                JOptionPaneCustom.showJOptionPane(
                        "Aviso","Página em construção!", JOptionPane.WARNING_MESSAGE)
        );

        jMenuItemCut.addActionListener(actionEvent ->
                JOptionPaneCustom.showJOptionPane(
                        "Aviso","Página em construção!", JOptionPane.WARNING_MESSAGE)
        );

        add(jMenuItemCopy);
        add(jMenuItemCut);

    }
}
