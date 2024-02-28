package byte_array;

import java.io.*;

public class byte_array {
    public static void main(String[] args) {
        // Byte array content
        byte[] content = "Hello, ByteArrayInputStream!".getBytes();

        // Create a ByteArrayInputStream from the byte array
        ByteArrayInputStream inputStream = new ByteArrayInputStream(content);

        // Define the output file name
        String fileName = "output.txt";

        try {
            // Create FileOutputStream to write to file
            FileOutputStream outputStream = new FileOutputStream(fileName);

            // Read from the ByteArrayInputStream and write to the FileOutputStream
            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead);
            }

            // Close the streams
            inputStream.close();
            outputStream.close();

            System.out.println("Content has been written to " + fileName);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

