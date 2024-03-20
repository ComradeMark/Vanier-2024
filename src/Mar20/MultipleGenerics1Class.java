package Mar20;


class Test1<T, U>{
    T obj1;
    U obj2;
    //Constructor
    Test1(T obj1, U obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
//Printing object T and U
    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

public class MultipleGenerics1Class {
    public static void main(String[] args) {

    Test1<String, Integer> obj = new Test1<String, Integer>("Mtl", 15);
    obj.print();
    }

}
