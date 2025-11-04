package DSA.collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class sont_int {
    public static void main(String[]args)
    {
        var st = new ArrayList<Integer>();
        st.add(1);
        st.add(2);
        st.add(4);
        st.add(11);
        st.add(42);
        for(int i :st){
        System.out.println(i);
    }

        Collections.sort(st);
        System.out.println("assesding: "+ st);
Collections.sort(st,Collections.reverseOrder());
        System.out.println("desending : "+st);
        st.set(0,1000);
        System.out.println(st);
        st.get(2);
        System.out.println(st.size());

}}
