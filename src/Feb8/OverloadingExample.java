package Feb8;

public class OverloadingExample {
    int a;
    int b;
    int c;

    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }



    /*public static void main(String[] args) {
        System.out.println(add(1.6, 3, 5));

        System.out.println(add(5, 7, 8));



    }*/
}
