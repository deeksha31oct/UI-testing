package july.metlife;
import java.util.*;
public class second_hightes {
    public static void main(String[]args)
    {
         Integer []a = {11,22,33,44,55,66,77,88,99,11,22};
         List<Integer>l = Arrays.asList(a);
         TreeSet<Integer>ts = new TreeSet<>();
         for(int y :l)
         {
             ts.add(y);
         }
         System.out.println(ts);
        System.out.println("second hightes "+ ts.lower(ts.last()));
        System.out.println(ts.higher(ts.first()));
        System.out.println(ts.descendingSet());
    }
}
