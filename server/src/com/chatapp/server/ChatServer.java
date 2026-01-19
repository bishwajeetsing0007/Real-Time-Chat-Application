
package com.chatapp.server;

import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) {
        System.out.println("Chat Server started on port " + ServerConfig.PORT);
        try (ServerSocket serverSocket = new ServerSocket(ServerConfig.PORT)) {
            while (true) {
                Socket socket = serverSocket.accept();
                ServerLogger.log("Client connected: " + socket.getInetAddress());
                new ClientHandler(socket).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
