package Feb29;
import java.io.*;
public class Read2Files {

    public static void main(String[] args)throws IOException {

        FileInputStream fis1 = new FileInputStream("C:/Users/2354983/Desktop/i.txt");
        FileInputStream fis2 = new FileInputStream("C:/Users/2354983/Desktop/i1.txt");
        FileOutputStream fout = new FileOutputStream("C:/Users/2354983/Desktop/o.txt");
        SequenceInputStream seq = new SequenceInputStream(fis1, fis2);
        int i;
        while((i=seq.read())!=-1){
            fout.write(i);}
        seq.close();
        fout.close();
        fis1.close();
        fis2.close();
        }

    }
    //Reads data from 2 files and writes it into one file



