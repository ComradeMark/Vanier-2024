package Feb15;
interface Test{
    void a();
    void b();
    void c();
}

abstract class Sample implements Test{
    public void b(){
        System.out.println("Transmission alone is being tested");
    }

}

class Engine extends Sample{
    Engine(){
        System.out.println("New engine created");
    }
    public void a() {
        System.out.println("Engine alone is being tested");
    }

    @Override
    public void c() {
        System.out.println("Wheels alone are being tested");
    }
}
public class InterfaceDemo3 {
    public static void main(String[] args) {
        Test Plane = new Engine();
        Plane.a();
        Plane.c();


    }
}
