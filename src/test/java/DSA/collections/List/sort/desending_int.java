package DSA.collections.List.sort;

import java.util.ArrayList;
import java.util.Collections;

public class desending_int {
    public static void main(String[]args) {
        ArrayList<Integer> st = new ArrayList<Integer>();
        st.add(1);
        st.add(2);
        st.add(4);
        st.add(11);
        st.add(42);
        Collections.sort(st,Collections.reverseOrder());
        System.out.println(st);
    }
}
