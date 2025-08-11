package ru.fvds.cdss13.lib.dto;

import lombok.Getter;

@Getter
public enum TelegramForumTopic {
    GENERAL("-1002326002578", "1", "General"),
    LOGI_BECK("-1002326002578", "2", "Логи фронтенда"),
    LOGI_FRONT("-1002326002578", "6", "Логи бэкэнда"),
    NEW_EVENTS("-1002326002578", "8", "Новые события");

    String chatId;
    String messageThreadId;
    String description;

    TelegramForumTopic(String chatId, String messageThreadId, String description) {
        this.chatId = chatId;
        this.messageThreadId = messageThreadId;
        this.description = description;
    }
}
