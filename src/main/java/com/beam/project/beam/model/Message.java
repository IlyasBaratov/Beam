package com.beam.project.beam.model;
import java.time.LocalDateTime;

@Entity
public class Message {
    @Id
    private Long id;
    private String username;
    private String content;
    private LocalDateTime timestamp;

    // Getters and setters...
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
