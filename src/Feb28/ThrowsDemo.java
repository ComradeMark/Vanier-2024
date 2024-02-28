package Feb28;
import java.io.IOException;
public class ThrowsDemo {
    //Include throws when you suspect that code might throw an exception


}
class Testthrows1 {
    void m() throws IOException {
        throw new IOException("Device connection error"); // Checked exception
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        Testthrows1 obj1 = new Testthrows1();
        obj1.p();
        System.out.println("Normal flow");
    }
}