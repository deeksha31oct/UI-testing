package DSA.collections.List.sort;

import java.util.ArrayList;
import java.util.Collections;

public class asending_int
{
    public static void main(String[]args) {
        var st = new ArrayList<Integer>();
        st.add(1);
        st.add(22);
        st.add(4);
        st.add(11);
        st.add(42);
        Collections.sort(st);
        System.out.println(st);
    }
}
