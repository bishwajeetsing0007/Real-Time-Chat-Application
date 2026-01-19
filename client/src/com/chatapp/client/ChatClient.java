
package com.chatapp.client;

import com.chatapp.common.Message;
import com.chatapp.common.MessageType;
import com.chatapp.common.User;
import com.chatapp.ui.ConsoleUI;

import java.io.*;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

            ConsoleUI ui = new ConsoleUI();
            User user = new User(ui.askUsername());

            new ClientReceiver(in).start();
            new ClientSender(out, user).start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
