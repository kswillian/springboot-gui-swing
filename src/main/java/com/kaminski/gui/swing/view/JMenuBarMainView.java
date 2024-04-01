package com.kaminski.gui.swing.view;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@Component
public class JMenuBarMainView extends JMenuBar {

    @PostConstruct
    public JMenuBar init(){
        create();
        return this;
    }

    private void create(){

        var jMenuFile = new JMenu("Arquivo");
        var jMenuEdit = new JMenu("Editar");
        var jMenuSystem = new JMenu("Sistema");
        var jMenuHelp = new JMenu("Ajuda");

        var jMenuItemExit = new JMenuItem("Sair");
        var jMenuItemSystemDetails = new JMenuItem("Detalhes");
        var jMenuItemDeviceDetails = new JMenuItem("Meu Dispositivo");

        jMenuFile.add(jMenuItemExit);
        jMenuSystem.add(jMenuItemSystemDetails);
        jMenuSystem.add(jMenuItemDeviceDetails);

        add(jMenuFile);
        add(jMenuEdit);
        add(jMenuSystem);
        add(jMenuHelp);
    }
}
