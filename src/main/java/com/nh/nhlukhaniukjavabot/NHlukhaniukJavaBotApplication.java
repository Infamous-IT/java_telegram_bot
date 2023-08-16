package com.nh.nhlukhaniukjavabot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.telegram.telegrambots.starter.TelegramBotInitializer;
import org.telegram.telegrambots.starter.TelegramBotStarterConfiguration;

@SpringBootApplication
@Import(TelegramBotStarterConfiguration.class)
public class NHlukhaniukJavaBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(NHlukhaniukJavaBotApplication.class, args);
	}

}
