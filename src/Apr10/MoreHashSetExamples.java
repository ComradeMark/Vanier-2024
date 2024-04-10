package Apr10;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class MoreHashSetExamples {
    public static void main(String[] args) {
        LinkedHashSet<String> hs1 = new LinkedHashSet();
        hs1.add("B");
        hs1.add("C");
        String[] values = new String[hs1.size()];
        hs1.toArray(values);
        System.out.println(Arrays.toString(values));
    }
}
