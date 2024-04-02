package com.kaminski.gui.swing;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.swing.*;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		var applicationContext = new SpringApplicationBuilder(Application.class)
				.headless(false)
				.run(args);
		applicationContext.getBean(JFrame.class);
	}

}
