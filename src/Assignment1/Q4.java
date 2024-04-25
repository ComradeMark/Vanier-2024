package Assignment1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Q4 {
    public static void main(String[] args) {
        ArrayList<Bank> banks= new ArrayList();
        banks.add(new Bank("RBC", "111 St Laurent", "StLaurent", 502226.0, 230));
        banks.add(new Bank("TD", "756 St Michel", "StMichel", 734897.50, 208));
        banks.add(new Bank("TD", "998 St Laurent", "StLaurent", 365187.55, 245));
        banks.add(new Bank("RBC", "755 St Michel", "StMichel", 907345.91, 200));
        banks.add(new Bank("TD", "100 St Laurent", "StLaurent", 100900.01, 200));


        //Find instances of a bank whose revenue is between 600-750k
        for(int i = 0; i<banks.size(); i++){
            if(banks.get(i).getRevenue() >= 600000.00 && banks.get(i).getRevenue() <= 750000.00){
                System.out.println("Banks with revenue ranging between 600k and 750k: ");
                System.out.println("Bank:" + " " + banks.get(i).getName()+ " Branch: "+banks.get(i).getBranch() + " Revenue: " + banks.get(i).getRevenue());
            }
        }
        //Count total customer base of all banks
        int customers = 0;
        for(int i = 0; i<banks.size(); i++){
            customers = customers + banks.get(i).getNoOfCustomers();
        }
        System.out.println("Total customer base: " + customers);

        //Display the bank that makes the most revenue
        Collections.sort(banks, new RevenueComparator());
        System.out.println("Most profitable bank branch: ");
        for(Bank b : banks){
            System.out.println(b.getName() + " " + b.getBranch() + " " + b.getRevenue());
        }
        System.out.println("Most profitable = ");
        System.out.println(banks.get(banks.size()-1).getRevenue());




    }
}
class Bank{

        String name;
        String branch;
        Double revenue;
        String address;
        int noOfCustomers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNoOfCustomers() {
        return noOfCustomers;
    }

    public void setNoOfCustomers(int noOfCustomers) {
        this.noOfCustomers = noOfCustomers;
    }
    public Bank(String name, String address, String branch, double revenue, int noOfCustomers){
        this.name = name;
        this.address = address;
        this.branch = branch;
        this.revenue = revenue;
        this.noOfCustomers = noOfCustomers;
    }

}
class RevenueComparator implements Comparator<Bank> {

    @Override
    public int compare(Bank o1, Bank o2) {
        if(o1.revenue == o2.revenue) return 0;
        else if(o1.revenue>o2.revenue) return 1;
        else return -1;
    }
}
