package com.kaminski.gui.swing.view;

import com.kaminski.gui.swing.view.menu.JMenuBarMainView;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.swing.JFrame;
import java.awt.BorderLayout;

@Component
@RequiredArgsConstructor
public class JFrameMainView {

    private final JFrame jFrame;
    private final JMenuBarMainView jMenuBarMainView;
    private final JPanelWelcomeView jPaneLWelcomeView;
    private final JPanelFooterView jPanelFooterView;

    @PostConstruct
    public void init(){

        jFrame.setJMenuBar(jMenuBarMainView.create());
        jFrame.getContentPane().add(jPaneLWelcomeView.create());
        jFrame.add(jPanelFooterView.create(), BorderLayout.SOUTH);
        jFrame.setVisible(true);

    }

}