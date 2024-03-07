package Assignment1;

public class Q3 {


}

interface Square{
public void setSide(int side);
public void printAreaOfSquare();
}
interface Rectangle{
 void setLength(int length);
 void setWidth(int width);
 void printAreaOfRectangle();

}


class RectangleAdapter implements Square{

Rectangle rect;
public RectangleAdapter(Rectangle rect) {
    this.rect = rect;
}
    public void setSide(int sideLength){
        rect.setLength(sideLength);
        rect.setWidth(sideLength);

    }
    public void printAreaOfSquare () {
        rect.printAreaOfRectangle();
    }
}

class Chessboard implements Square{
    int sideLength;
    public void setSide(int side){
        side = this.sideLength;
    }
    public void printAreaOfSquare(){
        System.out.println("Area of chessboard is: " + sideLength*sideLength);
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }
}

class Tenniscourt implements Rectangle{
    int length;
    int width;
    public void setLength(int length){
    this.length = length;
    }
    public void setWidth(int width){
this.width = width;
    }
    public void printAreaOfRectangle(){
        System.out.println("Area of rectangle is: " + length*width);
    }
}