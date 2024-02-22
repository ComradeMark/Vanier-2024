package Feb22;
import java.util.ArrayList;
import java.util.Collections;

class Laptop implements Comparable<Laptop>{
    String name;
    int ram;
    int price;

    public Laptop(String name, int ram, int price) {
        this.name = name;
        this.ram = ram;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getRam() {
        return ram;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String toString(){
        return "Laptop{" + "name=" + name + " ram" + ram + "price" + price + ')';
    }
//If only sorting by one aspect use comparable, if comparing multiple attributes use comparator

    @Override
    public int compareTo(Laptop o) {
        //Sort by ram
        if(this.ram == o.getRam()) return 0;
        else if(this.ram>o.getRam()) return 1;
        else return -1;
    }
}
public class Comparableemo2 {
//Sorts by ram quantity
    public static void main(String[] args) {
        ArrayList<Laptop> laptoplist = new ArrayList<>();
        laptoplist.add(new Laptop("Mac", 16, 599));
        laptoplist.add(new Laptop("Dell", 32, 899));
        laptoplist.add(new Laptop("HP", 8, 299));
        laptoplist.add(new Laptop("Mainframe", 32, 1899));
        Collections.sort(laptoplist);
        for(Laptop l : laptoplist){
            System.out.println(l.ram);
        }



    }

}
