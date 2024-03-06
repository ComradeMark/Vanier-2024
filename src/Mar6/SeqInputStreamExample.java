package Mar6;
import java.io.*;
public class SeqInputStreamExample {

    //ByteArrayOutputStream class: used to write common data into multiple files. In this stream,
    //the data is written into a byte array which can be written to multiple streams

    //The buffer of ByteArrayOutputStream grows with data
    //If we remove throws exception from here, an error appears.
    public static void main(String[] args)throws Exception {
        FileOutputStream fout1 = new FileOutputStream("C:\\Users\\2354983\\Desktop\\f1.txt"); //If file doesn't exist, file is created
        FileOutputStream fout2 = new FileOutputStream("C:\\Users\\2354983\\Desktop\\f2.txt"); //If path not specified, file created in current Java folder

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bout.write(65);
        bout.writeTo(fout1);
        bout.writeTo(fout2);



        bout.flush(); //Once task completed, flush buffer
        bout.close();
        System.out.println("Success");
    }
}
