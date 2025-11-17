package DSA.collections.pratice;

import java.util.ArrayList;
import java.util.List;

public class enen {
    public static void main (String[]args)
    {
        int []a = {1,2,3,4,5,6,7,8,9};
        int ee= 0,oo = 0;
        for(int cc:a )
        {
            if(cc%2==0)
            ee++;
            else
            oo++;

        }
        System.out.println("even "+ee+" odd "+oo);

        List <Integer>even = new ArrayList<>();
        List<Integer>odd = new ArrayList<>();
        for(int i = 1;i<=24;i++)
        {
            if(i%2==0)
            {
                even.add(i);
            }
            else{odd.add(i);}
            System.out.println("even "+even +"\n"+" odd "+odd );
        }
    }
}
