package Mar20;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

//Generics help enforce type safety.  Makes compiler validate data type during compilation
public class GenericsAndTypeSafety {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add("10"); //By default, compiler still accepts a String even if its the wrong type
        //With generics, it is required to specify the type of object we need to store
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
           // list1.add("10");
            //Compile-time error
        }


    }

