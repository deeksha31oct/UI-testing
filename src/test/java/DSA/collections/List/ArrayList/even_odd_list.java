package DSA.collections.List.arraylist;

import java.util.ArrayList;
import java.util.List;

public class even_odd_list {
    public static void main (String[]args)
    {
int a [] = {2,4,6,2,6,25,78,343};
List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int i = 0 ;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                even.add(a[i]);
            }else {
                odd.add(a[i]);
            }
        }
        System.out.println("even : "+ even +" odd : "+ odd);

    }
}
