package readtext;

import java.io.*;

public class readtext {
    public static void main(String[] args) {
        // File path
        String filePath = "output.txt";

        try {
            // Create FileReader and BufferedReader for the file
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Read each line from the file and display it
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the file streams
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

