package Feb29;
import java.io.FileOutputStream;
public class FileOutputStream1 {

    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("C:/Users/2354983/Desktop/file.txt");
            fout.write(66);
            fout.close();
            System.out.println("success");}
        catch (Exception e){
            System.out.println(e);


        }
    }

}
