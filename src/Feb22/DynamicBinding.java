package Feb22;

public class DynamicBinding {
    //Mainly used for method overriding, when parent and subclass have same method
    public static void main(String[] args) {
        //Static binding
        Shape staticShape = new circle(); //Upcasting
        staticShape.draw();
        //Dynamic binding
        Shape dynamicShape = getRandomShape(); //Dynamic binding
        dynamicShape.draw(); //Dynamic binding, calls draw() based on ACTUAL object type or value, if it changes during program
        //USE DYNAMIC BINDING IF VALUES CHANGE IN THE PROGRAM - THIS MAKES IT USE MORE RESSOURCES BUT REDUCES COMPILE TIME
        //We must give the program a way to decide te object time in this case, done through dynamicShape
        //When the compiler runs this program, it doesn't know what object is associated with dynamicShape yet, so we use a method to decide this during runtime

    }
    static Shape getRandomShape(){
        if(Math.random()<0.5) {
            return new circle();
        }else{return new square();
        }
    }
}

class Shape{
    void draw(){
        System.out.println("Drawing shape");

    }
}
class circle extends Shape{
    void draw(){
        System.out.println("Circle is drawn");
    }
}
class square extends Shape{
    void draw(){
        System.out.println("Drawing square");
    }
}
