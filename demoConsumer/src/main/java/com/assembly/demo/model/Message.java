package com.assembly.demo.model;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Random;

public class Message {

    private long id;
    private String message;
    private LocalDateTime time;

    public Message() {}

    public Message(long id, String message, LocalDateTime time) {
        this.id = id;
        this.message = message;
        this.time = time;
    }

    public Message(String message, LocalDateTime time) {
        this(new Random().nextLong(), message, time);
    }

    public Message(String message) {
        this(message,LocalDateTime.now());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message1 = (Message) o;
        return Objects.equals(message, message1.message) &&
                Objects.equals(time, message1.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, time);
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                ", time=" + time +
                '}';
    }
}
