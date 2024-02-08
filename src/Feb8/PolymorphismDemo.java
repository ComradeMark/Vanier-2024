package Feb8;


class CentralBank{
    double mortgageRate(){
        return 5.7;
    }



}
class TD extends CentralBank{
    double mortgageRate(){
        return 5.67;

    }
}
class RBC extends CentralBank{
    double mortgageRate(){
        return 4.78;
    }
}
class BMO extends CentralBank{
    double mortgageRate(){
        return 7.88;
    }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        CentralBank Rmortgage;
        Rmortgage = new RBC();
        System.out.println("The mortgage rate is: " + Rmortgage.mortgageRate());
//Runtime polymorphism
        CentralBank Bmortgage;
        Bmortgage = new BMO();
        System.out.println(Bmortgage.mortgageRate());
    }
}
