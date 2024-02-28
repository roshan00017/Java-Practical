package SeparateVowelsConsonants;

import java.io.*;

public class SeparateVowelsConsonants {
    public static void main(String[] args) {
        // Input file path
        String inputFilePath = "output.txt";

        // Output file paths for vowels and consonants
        String vowelsOutputFilePath = "vowels.txt";
        String consonantsOutputFilePath = "consonants.txt";

        try {
            // Create FileReader and BufferedReader for input file
            FileReader fileReader = new FileReader(inputFilePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Create FileWriter for output files
            FileWriter vowelsFileWriter = new FileWriter(vowelsOutputFilePath);
            FileWriter consonantsFileWriter = new FileWriter(consonantsOutputFilePath);

            // Read each line from the input file
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Convert line to lowercase for case-insensitive comparison
                line = line.toLowerCase();
                
                // Process each character in the line
                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    if (Character.isLetter(ch)) {
                        if (isVowel(ch)) {
                            vowelsFileWriter.write(ch);
                        } else {
                            consonantsFileWriter.write(ch);
                        }
                    }
                }
            }

            // Close all the file streams
            bufferedReader.close();
            fileReader.close();
            vowelsFileWriter.close();
            consonantsFileWriter.close();

            System.out.println("Separation of vowels and consonants is completed.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Function to check if a character is a vowel
    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
