package DSA.collections.List.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class asending_int
{
    public static void main(String[]args) {
        var st = new ArrayList<Integer>();
        st.add(1);
        st.add(22);
        st.add(4);
        st.add(11);
        st.add(42);
        List<Integer> a = Arrays.asList(2,45,77,243,73,26,63,5,3);
        Collections.sort(a);
        System.out.println(a);
        Collections.sort(a,Collections.reverseOrder());
        System.out.println(a);

        System.out.println(Collections.min(a));
    }
}
