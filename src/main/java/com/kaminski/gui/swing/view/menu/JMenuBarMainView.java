package com.kaminski.gui.swing.view.menu;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.swing.JMenuBar;

@Component
@AllArgsConstructor
public class JMenuBarMainView extends JMenuBar {

    private final JMenuFile jMenuFile;
    private final JMenuEdit jMenuEdit;
    private final JMenuHelp jMenuHelp;
    private final JMenuSystem jMenuSystem;

    public JMenuBar create(){

        add(jMenuFile);
        add(jMenuEdit);
        add(jMenuSystem);
        add(jMenuHelp);

        return this;
    }
}
