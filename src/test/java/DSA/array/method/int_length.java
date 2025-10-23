package DSA.array.method;

import java.util.Arrays;

public class int_length {
    public static void main(String[]args)
    {
        int[] a = {1,2,3,5,8,64,787,2232,12,56,235};
        //to get of the array
        System.out.println(a.length);
        //to get sort of the arrays
        Arrays.sort(a);
        for(int x :a)
        {
        System.out.println(x);
    }
        //to get fill the array with one interger value
        Arrays.fill(a,999);
        for(int k :a)
        {
         System.out.println(k);
        }

    }
}
