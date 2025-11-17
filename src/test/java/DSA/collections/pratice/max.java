package DSA.collections.pratice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class max {
    public static void main(String[]args)
    {
     List <Integer> a = Arrays.asList(2,42,65,23,566,32,11,2,3,4,5,6,7);
        Collections.sort(a);
        System.out.println(a);
        Collections.sort(a,Collections.reverseOrder());
        System.out.println(a);
        System.out.println("max "+ Collections.max(a));
        System.out.println("min "+ Collections.min(a));

    }
}
