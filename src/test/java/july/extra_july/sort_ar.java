package july.extra_july;

import java.util.*;

public class sort_ar {
    public static void main(String[]args)
    {
        List<Integer> a = Arrays.asList(1,2,5,3,8,9,6,9,4,6,3,9,9,12,14,17,19);
        Collections.sort(a);
        System.out.println("sorted assesding arrays "+ a);
        Collections.sort(a,Collections.reverseOrder());
        System.out.println("sorted desing order "+a);
        System.out.println("maximun number : "+ a.size());
        System.out.println("max"+ Collections.max(a));
        LinkedHashSet<Integer> ht = new LinkedHashSet<>();
        for (int k : a) ht.add(k);
        System.out.println(ht);
        TreeSet<Integer> htt = new TreeSet<>();
        for (int k : a) htt.add(k);
        System.out.println(htt);   // [1, 2, 3, 4, 5, 6, 8, 9, 12, 14, 17, 19]
    }
}




