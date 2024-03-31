package com.kaminski.gui.swing;

import com.kaminski.gui.swing.view.JFrameMainView;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		var applicationContext = new SpringApplicationBuilder(Application.class)
				.headless(false)
				.run(args);
		applicationContext.getBean(JFrameMainView.class);
	}

}
