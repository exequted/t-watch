package com.devserbyn.twatch.controller.api.mainbot;

import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.Optional;

public interface ApiController {

    BotApiMethod handle(Update update);
}
