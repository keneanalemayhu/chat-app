# Java Client-Server Chat Application

A simple Java-based client-server chat application demonstrating basic socket communication. The server accepts one client connection and echoes back each message with a confirmation. The interaction continues until the client sends the `"quit"` command to end the session.

## 💡 Features

- Simple TCP socket communication
- Server listens on port `1234`
- One client can connect and chat
- Communication ends with `"quit"` command
- Minimal and beginner-friendly Java code

## 🛠 Technologies

- Java 8+ (tested on Java 24)
- Sockets
- Input/Output Streams

## 🚀 How to Run

### 1. Compile

```bash
javac ChatServer.java ChatClient.java
