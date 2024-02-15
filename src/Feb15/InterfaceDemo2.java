package Feb15;


interface Drawable{
    void draw();
    static int cube(int x){
        return x * x * x;
    }

}
//Interfaces support multiple inheritance and let a class implement as many interfaces are you wish instead of just extending one class
//Also supports loose coupling

class Rectangle implements Drawable{
    public void draw(){
        System.out.println("drawing a rectangle");
    }
}
class Circle implements Drawable{

    public void draw(){
        System.out.println("drawing a circle");
    }
}


public class InterfaceDemo2 {
    public static void main(String[] args) {
        Drawable draw1 = new Rectangle();
        draw1.draw();
        System.out.println(Drawable.cube(3));

    }
}
