package Feb29;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFromFileToFile {
    public static void main(String[] args)throws IOException {

            FileInputStream fin = new FileInputStream("C:/Users/2354983/Desktop/i.txt");
            FileOutputStream fout = new FileOutputStream("C:/Users/2354983/Desktop/o.txt");
        try {
            int i = 0;
            while ((i = fin.read()) != -1) {
                fout.write(i);
            }
        }catch(IOException e){
            System.out.println(e);}
        finally{
                if (fin != null) {
                    fin.close();
                    System.out.println("Success");
                }
                if (fout != null) {
                    fout.close();
                }
            }
        }
    }

