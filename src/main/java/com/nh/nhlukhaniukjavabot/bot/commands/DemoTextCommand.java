package com.nh.nhlukhaniukjavabot.bot.commands;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.bots.AbsSender;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class DemoTextCommand extends BaseTextCommand {

    public DemoTextCommand(@Value("Back to bot") String textCommandIdentified,
                           @Value("") String description) {
        super(textCommandIdentified, description);
    }

    @Override
    public void processMessage(AbsSender absSender, Message message, String[] strings) {
        var sendMEssage = SendMessage.builder()
                .text("I'm reply markup response")
                .chatId(message.getChatId())
                .build();
        try {
            absSender.execute(sendMEssage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
}
