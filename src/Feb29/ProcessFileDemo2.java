package Feb29;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProcessFileDemo2 {
    public static void main(String[] args) {
        try {
            processfile("example.txt");
        } catch (FileNotFoundException ex) {
            System.out.println(" File not found " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println(" IOException " + ex.getMessage());
        }
    }

    public static void processfile(String fileName) throws FileNotFoundException, IOException {//When a method doesn't use "throws" to get a custom message, the main method will

        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/2354983/Desktop/example.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {//Reads text file line by line (buffered) until null
                System.out.println(line);
            }

            if (fileName == null || fileName.isEmpty()) {
                throw new FileNotFoundException("File name empty or null");
            }
            //Now simulate IOException during the file processing AFTER opening the file
            if (fileName.equals("example.txt")) {
                throw new IOException("IOException occured while attempting to process the file");
            }
            //Simulate another point of throwing a different exception
            if (fileName.length() > 20) {
                throw new IllegalArgumentException("File name is too long to read");
            }

            System.out.println(" Processing file " + fileName);

        }

    }
}

//Once we declare throws, java expects us to deal with the error. Otherwise, the exception is created by us and isn't detrimental to java compilation.

