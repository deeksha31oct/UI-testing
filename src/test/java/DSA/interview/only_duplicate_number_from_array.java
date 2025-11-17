package DSA.interview;

import java.util.Arrays;
import java.util.HashSet;

public class only_duplicate_number_from_array {
    public static void main(String[]args)
    {
        Integer[] array = {1,1,1,1,2,2,2,3,3,3,3,4,5,6,7,5,78,98,7,6,5,11,12,13};

        HashSet <Integer>hs = new HashSet<>();
        for(int i :array)
        {
        hs.add(i);

    }
        System.out
                .println(hs);}
}
