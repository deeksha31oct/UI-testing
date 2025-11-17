package DSA.collections.pratice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class duplicate {
    public static void main(String[]args)
    {
    Integer []a = {1,2,3,11,42,1,1,1,3,3,2,2,2,5,5,5,5};
   HashSet <Integer>ss = new HashSet<>();
   for(int k :a)
   {
       ss.add(k);
   }
        System.out.println(ss);
    }

}
