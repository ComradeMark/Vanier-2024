package Feb8;


class Counter{
    static int count = 0; //WITH static keyword: NUM INCREMENTED SINCE MEM SHARED
    Counter(){
        count++;
        System.out.println("Couter is: " + count);
    }
}
public class StaticDemo2 {
    public static void main(String[] args) {
        Counter c = new Counter();
        Counter c1 = new Counter();
    }

}
