package extra;

import org.checkerframework.checker.units.qual.C;

import java.util.Arrays;
import java.util.Collections;

public class ass {
    public static void main(String[]args)
    {
        Integer []a = {1,34,54,676,34,367,7};
        Arrays.sort(a);
        System.out.println("or: "+Arrays.toString(a));
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println("re :"+ Arrays.toString(a));
    }
}
