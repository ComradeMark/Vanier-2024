package Assignment2;
 //By using comparator, write a Java program to sort keys in Tree Map
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        TreeMap<Bus, Integer> schedule = new TreeMap<Bus, Integer>(new TreeSorter());
        schedule.put(new Bus(12, "Nuns Island", "Mark"), 2);
        schedule.put(new Bus(11, "Ridgewood", "Robert"), 198);
        schedule.put(new Bus(24, "Sherbrooke", "James"), 22);
        schedule.put(new Bus(30, "St-Denis", "Raidah"), 16);
        for(Map.Entry m:schedule.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue()); //Notice how TreeMap orders the data
        }

    }
}

class Bus{
    int number;
    String route;
    String driver;

    public Bus(int number, String route, String driver) {
        this.number = number;
        this.route = route;
        this.driver = driver;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
    public String toString() {
        return "Bus: " + number + " Route name: " + route + " Driver ID: " + driver + " KeyValue: ";
    }
}
class TreeSorter implements Comparator<Bus> {


    @Override
    public int compare(Bus o1, Bus o2) {
        return o1.getNumber()-o2.getNumber();
    }
}
