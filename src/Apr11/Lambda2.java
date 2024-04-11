package Apr11;
interface Sayable{
    public String say(String name);
}
public class Lambda2 {
    public static void main(String[] args) {

        //Lambda with single parameter
        Sayable s1=(name)->{
    return "Hello, " + name;
        };
        System.out.println(s1.say("Sayyy"));


        //You can omit function parenthesis
        Sayable s2=name->{
            return "Hello, " + name;
        };
        System.out.println(s2.say("test2222"));

    }
}
