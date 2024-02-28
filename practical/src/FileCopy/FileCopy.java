package FileCopy;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFilePath = "vowels.txt"; // Path to the source file
        String destinationFilePath = "output.txt"; // Path to the destination file

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Write a newline after each line
            }

            System.out.println("Data copied from " + sourceFilePath + " to " + destinationFilePath);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
