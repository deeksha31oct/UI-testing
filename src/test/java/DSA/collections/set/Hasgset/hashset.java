package DSA.collections.set.Hasgset;

import java.util.HashSet;

public class hashset {

        public static void main(String[]args)
        {
            var ht = new HashSet<Integer>();
            ht.add(1000);
            ht.add(2);
            ht.add(44);
            ht.add(11);
            ht.add(66);
            ht.add(12);

            System.out.println(ht.stream().findFirst());
            System.out.println(ht.stream().distinct());
        }
}
