package May08;
import java.util.*;
public class OtherLocaleExample {
    public static void main(String[] args) {
        Locale currentLocale = new Locale("en", "US");
        ResourceBundle messages = ResourceBundle.getBundle("messages", currentLocale);
        String greeting = messages.getString("greeting");
        System.out.println("Greeting " + greeting);

        String farewell = messages.getString("farewell");
        System.out.println("Farewell " + farewell);
    }
}
