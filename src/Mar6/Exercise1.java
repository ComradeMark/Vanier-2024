package Mar6;
import java.io.*;
public class Exercise1 {
    //1 - Remove the space
    //2 - Remove the special characters
    //3 - Count the number of characters
    public static void main(String[] args) throws Exception {
        String input = "C:\\Users\\2354983\\Desktop\\f1.txt";
        String output = "C:\\Users\\2354983\\Desktop\\output.txt";

        removeSpecialCharacters(input, output);
        System.out.println("Special characters removed");
    }


    private static void removeSpecialCharacters(String input, String output)throws Exception {
         BufferedReader reader = new BufferedReader(new FileReader(input));
             BufferedWriter writer = new BufferedWriter(new FileWriter(output));
        String line;
        while ((line = reader.readLine()) != null) {
            String cleanedLine = removeSpecialCharactersFromLine(line);
            writer.write(cleanedLine);
            writer.newLine();
        }

    }



private static String removeSpecialCharactersFromLine(String line){
    return line.replaceAll("[^a-zA-Z0-9]","").replaceAll("\\s+","");
}
}

