package Feb8;

class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Cat extends Animal {
    void eat(){
        //Add SUPER here to call the parent class as well
        super.eat();
        System.out.println("Cat is eating");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.eat();

    }
}

