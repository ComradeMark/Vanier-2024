package Feb29;
import java.io.File;
import java.io.FileOutputStream;
public class WriteStringToFile {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("C:/Users/2354983/Desktop/file.txt");
            String s = "This string will be written into the file";
            byte b[] = s.getBytes(); //Converts string to byte array
            fout.write(b);
            fout.close();
            System.out.println("Success");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
