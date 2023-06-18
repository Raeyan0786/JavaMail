package com.example.SendEmail.Objects;

public class Message {
    public Message(String text) {
        this.text = text;
    }

    private String text;

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                '}';
    }

    public void setText(String text) {
        this.text = text;
    }
}
