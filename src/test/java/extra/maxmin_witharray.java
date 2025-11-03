package extra;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class maxmin_witharray {
    public static void main(String[]args) {
        List<Integer> a = Arrays.asList(1,2,5,56,24,323);
        Collections.sort(a);
        System.out.println(a);
        Collections.sort(a, Collections.reverseOrder());
        System.out.println(a);
        Collections.max(a);
        System.out.println(a);
        Collections.min(a);
        System.out.println("max "+ Collections.max(a));
    }
}
