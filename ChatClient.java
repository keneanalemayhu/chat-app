// ChatClient.java

import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);
        System.out.println("Connected to server.");

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String message;
        while (true) {
            System.out.print("You: ");
            message = input.readLine();
            out.println(message);

            String response = in.readLine();
            System.out.println("Server: " + response);

            if (message.equalsIgnoreCase("quit")) break;
        }

        socket.close();
        System.out.println("Connection closed.");
    }
}
