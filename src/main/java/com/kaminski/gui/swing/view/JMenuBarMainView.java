package com.kaminski.gui.swing.view;

import com.kaminski.gui.swing.utils.SwingUtils;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        jMenuItemExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                var response = SwingUtils.showConfirmeJOptionPane(
                        "Aviso","Deseja fechar a aplicação?");

                if(response)
                    System.exit(0);
            }
        });

        jMenuFile.add(jMenuItemExit);
        jMenuSystem.add(jMenuItemSystemDetails);
        jMenuSystem.add(jMenuItemDeviceDetails);

        add(jMenuFile);
        add(jMenuEdit);
        add(jMenuSystem);
        add(jMenuHelp);
    }
}
