import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class poemFile {
    public static void main(String[] args) {
        String fileName = "shahid.txt"; // Replace with the path to your file

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int wordCount = 0;

            while ((line = br.readLine()) != null) {
                // Split each line into words using space as a delimiter
                String[] words = line.split(" ");

                // Update the word count
                wordCount += words.length;
            }

            System.out.println("Number of words in " + fileName + ": " + wordCount);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
