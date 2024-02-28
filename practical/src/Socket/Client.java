package Socket;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        final String SERVER_IP = "localhost";
        final int PORT = 12345;

        try (Socket socket = new Socket(SERVER_IP, PORT);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter message to send to server: ");
            String message = consoleInput.readLine();

            out.println(message);

            String response = in.readLine();
            System.out.println("Response from server: " + response);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
