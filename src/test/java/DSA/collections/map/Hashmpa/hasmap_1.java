package DSA.collections.map.Hashmpa;

import java.util.HashMap;

public class hasmap_1 {
    public static void main(String[]args)
    {
        var hh = new HashMap<String,String>();
        hh.put("deeksha","btech");
        hh.put("raju","btech");
        hh.put("divya","ee");
hh.put("deeku","ee")  ;
for(String i: hh.keySet())
{
    System.out.println(i);
}
        for(String i: hh.values())
        {
            System.out.println(i);
        }
    }
}
