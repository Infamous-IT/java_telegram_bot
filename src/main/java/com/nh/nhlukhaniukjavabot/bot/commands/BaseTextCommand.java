package com.nh.nhlukhaniukjavabot.bot.commands;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.extensions.bots.commandbot.commands.IBotCommand;

@Component
public abstract class BaseTextCommand implements IBotCommand {

    private final String textCommandIdentified;
    private final String description;

    public BaseTextCommand(@Value("Back to bot") String textCommandIdentified,
                           @Value("") String description) {
        this.textCommandIdentified = textCommandIdentified;
        this.description = description;
    }

    @Override
    public String getCommandIdentifier() {
        return textCommandIdentified;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
