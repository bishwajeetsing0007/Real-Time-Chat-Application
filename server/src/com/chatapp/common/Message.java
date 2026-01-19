
package com.chatapp.common;

import java.io.Serializable;

public class Message implements Serializable {
    private MessageType type;
    private User sender;
    private String content;

    public Message(MessageType type, User sender, String content) {
        this.type = type;
        this.sender = sender;
        this.content = content;
    }

    public MessageType getType() { return type; }
    public User getSender() { return sender; }
    public String getContent() { return content; }
}
