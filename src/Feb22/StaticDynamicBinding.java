package Feb22;

public class StaticDynamicBinding {

//All overloaded methods are static binding (early binding)
public static void main(String[] args) {
    Animal animal = new Dog(); //Upcasting
    animal.sound(); //Static binding - before being converted to machine code, the compiler knows what reference of class we're making

    //All private, static, final methods are ALWAYS static binding
    //They cannot be overriden during runtime


}


}
class Animal{
    void sound(){
        System.out.println("Animal makes a noise");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }

}
