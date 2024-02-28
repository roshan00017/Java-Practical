package trycatchfinally;

import java.io.*;

public class trycatchfinally {
    public static void main(String[] args) {
        try {
            // Attempt to read from a non-existent file
            BufferedReader reader = new BufferedReader(new FileReader("nonexistentfile.txt"));
            String line = reader.readLine(); // This line will throw a FileNotFoundException
            System.out.println("Read line: " + line); // This line will not be executed
        } catch (FileNotFoundException e) {
            // Catch the FileNotFoundException and handle it
            System.err.println("Error: File not found.");
        } catch (IOException e) {
            // Catch any other IOExceptions
            System.err.println("Error: IOException occurred.");
        } finally {
            // Finally block always gets executed, regardless of whether an exception occurred or not
            System.out.println("Finally block executed.");
        }
    }
}

