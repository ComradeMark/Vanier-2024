package Apr11;

/**
 * Provides a clear and concise way to represent one method interface using an expression
 * Useful in collection library and helps to iterate, filter, and extract data from java collections
 * Used to provide implementation of an interface which has a functional interface
 *
 *
 */


public class LambdaExpressionIntro {
    public static void main(String[] args) {
        int width = 10;

        //Without lambda, Drawable implementation using anonymous class
        Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing " + width);}};
    d.draw();

    //With lambda
        Drawable d2=()->{
            System.out.println("Drawing " +width);
        };
        d2.draw();
    }
}
interface Drawable{
    public void draw();
}
