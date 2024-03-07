package Lab2;

public class Q2 {

    public static void main(String[] args) {
        System.out.println("Create new Salaried Employee: ");
        SalariedEmployee sal1 = new SalariedEmployee();


        //Operations on our newly created object:
        sal1.firstName = "Mark";
        sal1.lastName = "Moutter";
        sal1.weeklySalary = 500;
        sal1.socialSecurityNumber = "123";
        sal1.getPaymentAmount();
        //Invoice can also be called:
        Invoice inv1 = new Invoice();
        System.out.println(sal1.getFirstName() + " " + sal1.getLastName() + " Payment amount " + sal1.getPaymentAmount() + " SSN " + sal1.socialSecurityNumber);
        System.out.println("Invoice operations: " + inv1.partNumber);


        //


    }

}
class Employee implements Payable{
    String firstName;
    String lastName;
    String socialSecurityNumber;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }
}
class CommissionEmployee extends Employee{
double grossSales;
double commissionRate;
}
class HourlyEmployee extends Employee{
    double wage;
    double hours;
}
class SalariedEmployee extends Employee{
    double weeklySalary;
}

interface Payable{
    public double getPaymentAmount();


}
class Invoice implements Payable{
    String partNumber;
    String partDescription;
    int quantity;
    double pricePerItem;

    @Override
    public double getPaymentAmount() {
        return 0;
    }
}