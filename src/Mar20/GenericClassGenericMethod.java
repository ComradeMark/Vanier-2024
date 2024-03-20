package Mar20;

class Test<T>{
    //An object of type T is declared
    T obj;
    Test(T obj) { this.obj = obj;}
    public T getObject(){return this.obj;}
}

public class GenericClassGenericMethod {
    public static void main(String[] args) {
        //Instance of Integer type
        Test<Integer> iObj = new Test<Integer>(15);
        //Makes class an Integer type
        System.out.println(iObj.getObject());
    Test<String> sObj = new Test<String>("Wow!");
        System.out.println(sObj.getObject());
    }
}
