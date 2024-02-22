package Feb22;
import java.util.ArrayList;
import java.util.ArrayList;

class Shape1{
    void draw(){
        System.out.println("Drawing a shape");

    }
}
class Circle1 extends Shape1{
    void draw(){
        System.out.println("Drawing a circle");
    }
}
class Rectangle1 extends Shape1{
    void draw(){
        System.out.println("Drawing a rectangle");
    }
}

public class DynamicBindingPractice {
    public static void main(String[] args) {
        ArrayList<Shape1> shapes = new ArrayList<>();
        shapes.add(new Circle1());
        shapes.add(new Rectangle1());

        for(Shape1 shape : shapes){
            shape.draw();
        }
    }
}
