
package com.chatapp.server;

import com.chatapp.common.Message;
import com.chatapp.common.MessageType;

import java.io.*;
import java.net.Socket;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ClientHandler extends Thread {
    private static Set<ClientHandler> clients = ConcurrentHashMap.newKeySet();
    private Socket socket;
    private ObjectInputStream in;
    private ObjectOutputStream out;

    public ClientHandler(Socket socket) {
        this.socket = socket;
        clients.add(this);
    }

    public void run() {
        try {
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());

            Message message;
            while ((message = (Message) in.readObject()) != null) {
                broadcast(message);
            }
        } catch (Exception e) {
            ServerLogger.log("Client disconnected");
        } finally {
            clients.remove(this);
        }
    }

    private void broadcast(Message message) {
        for (ClientHandler client : clients) {
            try {
                client.out.writeObject(message);
            } catch (Exception ignored) {}
        }
    }
}
