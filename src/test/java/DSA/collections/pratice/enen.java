package DSA.collections.pratice;

import java.util.ArrayList;
import java.util.List;

public class enen {
    public static void main (String[]args)
    {


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
