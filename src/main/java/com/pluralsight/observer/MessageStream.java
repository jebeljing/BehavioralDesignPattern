package com.pluralsight.observer;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by jingshanyin on 9/8/17.
 */
public class MessageStream extends Subject {

    private Deque<String> messageHistory = new ArrayDeque<>();

    @Override
    void setState(String message) {
        messageHistory.add(message);
        this.notifyObservers();
    }

    @Override
    String getState() {
        return messageHistory.getLast();
    }
}
