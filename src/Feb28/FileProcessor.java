package Feb28;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {

    //Method that reads a text file and may throw an exception(filenotfound, notreadable, nodata, etc)
    public static void readFile(String filepath) throws IOException {
        //Try with resources to automatically close the reader exception
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = br.readLine()) != null) {//Reads text file line by line (buffered) until null
                System.out.println(line);
            }

        }
    }

    public static void main(String[] args) throws IOException {

        try {
            String filePath = "C://Users//2354983//Desktop//fileinput.txt";
            readFile(filePath);
        } catch (IOException e) {
            System.out.println("Error reading the file " + e.getMessage());
        }
    }
}

/*
        FileProcessor fileProcessor = new FileProcessor();
        //Code to process a file
        if(filepath.equals("invalid path")){
            throw new IOException("Invalid file path"); //Throw method goes with THROWS
        }
        //Code will continue if file processing is successful
        System.out.println("File processed successfully");
    }
}
*/