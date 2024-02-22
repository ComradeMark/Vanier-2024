package Feb22;
import java.util.ArrayList;
import java.util.Collections;

//Elements in an ArrayList are actually objects. In the examples above,
// we created elements (objects) of type "String". Remember that a String
// in Java is an object (not a primitive type).
// To use other types, such as int, you must specify an equivalent wrapper class:
// Integer. For other primitive types, use: Boolean for boolean, Character for char,
// Double for double, etc


public class List1 {
    public static void main(String[] args) {
        //ArrayList DOES NOT deal with primitives (Integer and not int)
        ArrayList<String> objects = new ArrayList<String>(); // Create an ArrayList object
        objects.add("Volvo");
        objects.add("BMW");
        objects.add("Toyota");
        objects.set(1, "Hyundai"); //Change index 1 to Hyundai
        System.out.println(objects);

        //To remove an element, use the remove() method, you can remove by INDEX or by VALUE or remove all with clear()
        objects.remove(1);
        System.out.println(objects);
        objects.add("BMW");
        objects.remove("Volvo");
        System.out.println(objects);
        objects.clear();
        System.out.println(objects);

        //Use size() to find out container size
        //use .get to access the value of a particular index
        objects.add("Volvo");
        objects.add("BMW");
        objects.add("Toyota");
        for(int i = 1; i<objects.size(); i++){
            System.out.println(objects.get(i));
        }

        //To sort items use collections interface
        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);

        //Enhanced for loop -> Middle word is a placeholder that will be used for printing
        for(String cars : objects){
            System.out.print(cars);
            System.out.print(", ");
        }

    }



}
