package july.extra_july;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.*;
public class interger_All_logic {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
        public static void main(String[] args) {
            System.out.println("Start small. Ship something.");
            Integer[] a = {2,4,3,1,5,1,5,6,3,8,3,7,9,5,2,45,6,3,1};
            Integer[] b = {1,3,2,4,6,7,4,7,2,4,1,4,1,3,1,3,1,10,11,12};
            Arrays.sort(a);
            System.out.println("output : "+Arrays.toString(a));
            Arrays.sort(a,Collections.reverseOrder());
            System.out.println("reverse : "+ Arrays.toString(a));
            List<Integer> ht= Arrays.asList(a);
            List<Integer> t = Arrays.asList(b);
            TreeSet<Integer> hs = new TreeSet<>();
            List<Integer> arr = new ArrayList<>();
            System.out.println(ht);
            Collections.sort(ht);
            System.out.println("assending: "+ ht);
            Collections.sort(ht,Collections.reverseOrder());
            System.out.println("desending : "+ht);
            for(int i :ht)hs.add(i);
            for(int i :t)hs.add(i);
            System.out.println("sorting : "+hs);
            System.out.println(Collections.max(ht));
            System.out.println(Collections.min(ht));
            System.out.println("second highrst");
            System.out.println(Collections.max(t)-1);
            System.out.println(Collections.min(t));
            for(int k : ht)arr.add(k);
            System.out.println("order on duplicate : "+arr);
        }
    }
