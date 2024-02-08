package Feb8;


class Person{
    int age;
    String name;

    Person(){
        System.out.println("How can this be invoked without creating another object instance?");
    }
    public Person(int a, String n) {
        this(); //Executes Person(), this() looks for another default constructor (looks for constructor with same argument)
        age = a;
        name = name; //this. refers to particlar object instantiation when same names are used for variables and objects
    }//To avoid using this., you can change the parameters used by constructor
    void display(){
        System.out.println(age + " " + name);
    }
}

public class ThisDemo {
    //Practice for this. operator
    public static void main(String[] args) {
        Person p = new Person(19, "Musk");
        p.display(); //without this, properties cannot be found, thus val = null


    }


}
