package com.nh.nhlukhaniukjavabot.bot.configuration;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.extensions.bots.commandbot.commands.IBotCommand;
import org.telegram.telegrambots.extensions.bots.commandbot.commands.ICommandRegistry;

@Component
public class TelegramBotCommandInitializer implements InitializingBean {

    private final ICommandRegistry iCommandRegistry;
    private final IBotCommand[] iBotCommand;

    public TelegramBotCommandInitializer(ICommandRegistry iCommandRegistry, IBotCommand[] iBotCommand) {
        this.iCommandRegistry = iCommandRegistry;
        this.iBotCommand = iBotCommand;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        iCommandRegistry.registerAll(iBotCommand);
    }
}
