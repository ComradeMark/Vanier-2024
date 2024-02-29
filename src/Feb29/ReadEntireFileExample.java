package Feb29;
import java.io.FileInputStream;

public class ReadEntireFileExample {
    //Windows puts -1 at the end of a file
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("C:/Users/2354983/Desktop/file.txt");
            int i = 0;
            while((i=fin.read())!=-1) {
                System.out.print((char) i);
            }
            fin.close();}
        catch(Exception e){
            System.out.println(e);}

    }
}

//Reads entire file