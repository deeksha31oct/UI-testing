package DSA.collections.set.Treeset;

import java.util.TreeSet;

public class String_sort {
    public static void main(String[]args) {
        var st = new TreeSet<String>();
        st.add("deeksha kashyap");
        st.add("rajkumar");
        st.add("bholu ");
        System.out.println(st);
        System.out.println(st.descendingSet());
        System.out.println(st.first());
    }
}
