package DSA.interview;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class desending {
    public static void main(String[]args)
    {
        Integer []a = {120,134,125,1232,12,134,111,121,1111,1235};
        System.out.println("orginal list :"+ Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("desending :"+ Arrays.toString(a));
    }
}
