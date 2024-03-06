package Mar6;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample {

    public static void main(String[] args) throws IOException {
        byte[] buffer = {35, 36, 37, 38};
        //Create new byte array input stream
        ByteArrayInputStream byt = new ByteArrayInputStream(buffer);
        int k = 0;
        while((k=byt.read())!=-1){
            //conversion of each byte into readable character
            char ch = (char) k;
            System.out.println("ASCII value of character is: " + k + "; Special character is:" + ch);
        }
    }

}
