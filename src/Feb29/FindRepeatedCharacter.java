package Feb29;
import java.io.*;
public class FindRepeatedCharacter {

    //Due march 9, find repeated character and increment counter
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("C:/Users/2354983/Desktop/file.txt");
            int i = 0;
            int counter;
            while((i=fin.read())!=-1) {
                System.out.print((char) i);
                if((char)=='a'){
                    counter++;

                }
            fin.close();}
        catch(Exception e){
            System.out.println(e);}

    }
    }

    //Second task: remove all instances of that character, write remainder into another file

}
