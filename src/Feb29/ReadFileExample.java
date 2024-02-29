package Feb29;
import java.io.FileInputStream;
public class ReadFileExample {

    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("C:/Users/2354983/Desktop/file.txt");
            int i = fin.read();
            System.out.println((char)i);
            fin.close();}
        catch(Exception e){
            System.out.println(e);}

        }
    }

//Reads first letter from file

