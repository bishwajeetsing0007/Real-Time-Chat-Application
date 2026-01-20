# Real-Time Chat Application (Java)

A console-based **real-time chat application** developed using **Java socket programming**.  
The application enables multiple clients to communicate with each other through a central server using reliable TCP connections.

---

## Features
- Real-time messaging between multiple clients
- TCP socket-based communication
- Client–server architecture
- Modular and maintainable code structure
- Console-based user interface
- Graceful client connection and disconnection handling

---

## Tech Stack
- Java  
- TCP Sockets  
- Multithreading  

---

## Architecture Overview

The application follows a **client–server model**:

- **Server**
  - Manages client connections
  - Broadcasts messages to connected clients
  - Handles multiple clients using threads

- **Client**
  - Connects to the server
  - Sends and receives messages concurrently

Shared message models ensure consistent communication between client and server.

---

## Project Structure
server/
├── server/
├── common/
└── utils/

client/
├── client/
├── ui/
└── common/


---

## How to Run

### 1️. Compile the Server
```bash
javac com/chatapp/server/*.java
2️. Start the Server
java com.chatapp.server.ChatServer
3️. Compile the Client
javac com/chatapp/client/*.java
4️. Start the Client
java com.chatapp.client.ChatClient
Run multiple clients in separate terminals to test real-time communication.

Testing
Manual testing performed with multiple client instances

Verified message delivery, connection stability, and thread handling

Purpose
This project is built for learning, practice, and portfolio demonstration of Java networking and multithreaded application development.

Author
Bishwajeet Kumar Singh
