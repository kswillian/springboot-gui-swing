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
public class JMenuFile extends JMenu {

    private final JOptionPaneCustom JOptionPaneCustom;

    @PostConstruct
    public JMenu init(){
        create();
        return this;
    }

    private void create(){

        setText("File");

        var jMenuItemNew = new JMenuItem("New");
        var jMenuItemExit = new JMenuItem("Exit");

        jMenuItemNew.addActionListener(actionEvent ->
                JOptionPaneCustom.showJOptionPane(
                        "Aviso","Página em construção!", JOptionPane.WARNING_MESSAGE)
        );

        jMenuItemExit.addActionListener(actionEvent ->{
            var response = JOptionPaneCustom.showConfirmeJOptionPane(
                    "Aviso","Deseja fechar a aplicação?");

            if(response)
                System.exit(0);
        });

        add(jMenuItemNew);
        add(jMenuItemExit);

    }
}