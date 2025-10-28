package DSA.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class even_odd {
    public static void main(String[]args)
    {
        System.out.println("print even number :");
        for(int i =2 ; i<=42;i +=2)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n print odd number :");
        for( int i=1;i<=42 ;i+=2)
        {
System.out.print(i+" ");
        }


        // even odd
        System.out.println();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int i = 0 ;i<=41;i++)
        {
            if(i%2==0)
            {
                even.add(i);
            } else {
                odd.add(i);
            }

        }
        System.out.println("Even : " + even);
        System.out.println("Odd : " + odd);

    }
}
