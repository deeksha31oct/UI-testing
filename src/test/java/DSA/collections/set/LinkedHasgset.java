package DSA.collections.set;

import java.util.LinkedHashSet;

public class LinkedHasgset {
    public static void main(String[]args)
    {
        var lk = new LinkedHashSet<Integer>();
        lk.add(22);
        lk.add(1);
        lk.add(100);
        lk.add(44);
        lk.add(100);
        lk.add(44);
        System.out.println(lk);
        System.out.println(lk.stream().findFirst());
        System.out.println(lk.containsAll(lk));
        System.out.println(lk.hashCode());
 lk.clear();
        System.out.println(lk);

    }
}
