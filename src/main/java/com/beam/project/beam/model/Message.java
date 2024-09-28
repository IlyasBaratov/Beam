package com.beam.project.beam.model;
import java.time.LocalDateTime;

public class Message {
    private String content;
    private String sender;
    private MessageType type;

    public enum MessageType {
        CHAT, JOIN, LEAVE
    }

    // Getters and setters
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getSender() {
        return sender;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }
    public MessageType getType() {
        return type;
    }
    public void setType(MessageType type) {
        this.type = type;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
    private LocalDateTime timestamp;
    public Message() {
    }
    public Message(String content, String sender, MessageType type, LocalDateTime timestamp) {
        this.content = content;
        this.sender = sender;
        this.type = type;
        this.timestamp = timestamp;
    }
}

