
package com.chatapp.client;

import com.chatapp.common.Message;
import com.chatapp.common.MessageType;
import com.chatapp.common.User;

import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ClientSender extends Thread {
    private ObjectOutputStream out;
    private User user;

    public ClientSender(ObjectOutputStream out, User user) {
        this.out = out;
        this.user = user;
    }

    public void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String text = scanner.nextLine();
                out.writeObject(new Message(MessageType.CHAT, user, text));
            }
        } catch (Exception ignored) {}
    }
}
