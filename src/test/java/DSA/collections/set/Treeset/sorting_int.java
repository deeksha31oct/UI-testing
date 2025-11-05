package DSA.collections.set.Treeset;

import java.util.TreeSet;

public class sorting_int
{
    public static void main(String[]args)
    {
        var  st = new TreeSet<Integer>();
        st.add(2);
        st.add(44);
        st.add(1);
        st.add(66);
        st.add(12);
        st.add(99);
        System.out.println(st);
        System.out.println(st.descendingSet());
        System.out.println(st.contains(66));
        System.out.println(st.last());
        System.out.println(st.first());
        System.out.println(st.size());

    }
}
