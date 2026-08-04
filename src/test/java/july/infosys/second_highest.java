package july.infosys;
import java.util.*;

public class second_highest
{ public static void main (String []args)
{
    Integer[]a = {2,4,6,9};
    TreeSet<Integer>ts = new TreeSet<>();
    for(int n:a)
    {
     ts.add(n);
    }
    System.out.println(ts.lower(ts.last()));
}
}
