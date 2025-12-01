package DSA.interview;

import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class count_duplicares {
    public static void main(String[]args) {
        Integer[] array = {1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 5, 6, 7, 5, 78, 98, 7, 6, 5, 11, 12, 13};
        Map<Integer,Integer> ht = new HashMap<>();
for(Integer et : array)
{
    ht.put(et,ht.getOrDefault(et,0)+1);
}
        System.out.println("duplicat ");
for(Integer un:ht.keySet())
{
   if(ht.get(un)>1)
   {
       System.out.println("count "+ ht.get(un));
   }
}
            }
        }
