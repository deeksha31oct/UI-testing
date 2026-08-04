package july.mittal;

import java.util.*;

public class array {
    public static void main (String []args)
    {
        Integer []a = {1,2,3,4,56,6,32,554,674,23,776,87,34,56,123,44,34,4,5,6,8,56,8,9,6,4,2,4,6,89,654,23,121212};
        Integer[]ab= {};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println(Arrays.toString(a));
        List<Integer>lt = Arrays.asList(a);
        Collections.sort(lt);
        System.out.println(lt);
        Collections.sort(lt,Collections.reverseOrder());
        System.out.println(lt);
        System.out.println(Collections.max(lt));
        System.out.println(Collections.min(lt));
        Integer []b = {11,23,11,23,23,45,45,67,67,56,56,5,6,56,56,5,5,6,6,56,6,32,554,674,23,776,87,34,56,123,44,34,4,5,6,8,56,8,9,6,4,2,4,6,89,654,23,3333};
        List<Integer>ll = Arrays.asList(b);
        HashSet<Integer>kk = new HashSet<>();
        for(int i :lt)kk.add(i);
        for(int i :ll)kk.add(i);
        System.out.println("hashset :"+kk);

        LinkedHashSet<Integer>pp = new LinkedHashSet<>();
        for(int i :lt)pp.add(i);
        for(int i :ll)pp.add(i);
        System.out.println("linkedhashset : "+pp);

        //tree sett
        TreeSet<Integer>ee = new TreeSet<>();
       //ee.addAll(Arrays.asList(a));
      // ee.addAll(Arrays.asList(b));
        for(int i :lt)ee.add(i);
        for(int i :ll)ee.add(i);
        System.out.println(ee);

        System.out.println(ee.descendingSet());



// duplicate remove then assending



    }
}
