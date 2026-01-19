
package com.chatapp.client;

import com.chatapp.common.Message;

import java.io.ObjectInputStream;

public class ClientReceiver extends Thread {
    private ObjectInputStream in;

    public ClientReceiver(ObjectInputStream in) {
        this.in = in;
    }

    public void run() {
        try {
            Message message;
            while ((message = (Message) in.readObject()) != null) {
                System.out.println(message.getSender().getUsername() + ": " + message.getContent());
            }
        } catch (Exception e) {
            System.out.println("Disconnected from server");
        }
    }
}
