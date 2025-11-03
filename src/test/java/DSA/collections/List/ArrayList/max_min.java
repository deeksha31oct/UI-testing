package DSA.collections.List.ArrayList;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class max_min {
    public static void main(String[]args)
    {

     List<Integer> a =  Arrays.asList(1,2,5,5,2,53,5334,2312,435);
       // Integer []a = {1,2,5,5,2,53,5334,2312,435};
        System.out.println("max:"+ Collections.min(a));
        System.out.println("max:"+ Collections.max(a));
       // System.out.println("reverse : "+Collections.sort());
        Collections.sort(a);
        System.out.println(a);
        Collections.sort(a,Collections.reverseOrder());
        System.out.println(a);



    }
}
