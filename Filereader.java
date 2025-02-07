package task7;
import java.io.*;

public class Filereader {
    public static void main(String[] args) {
        // Specify the file path
        String fileName = "example.txt";

        // Use try-catch block to handle exception
        try {
            // Attempt to create a FileReader object for the file
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Read the file content line by line
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the resources
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            // Handle the case when the file is not found
            System.out.println("Error: The file '" + fileName + "' was not found.");
        } catch (IOException e) {
            // Handle general input/output exceptions
            System.out.println("An error occurred while reading the file.");
        }
    }
}
