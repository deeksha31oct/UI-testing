package DSA.collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class sort_string {
    public static void main(String[] args) {
        var demo = new ArrayList<String>();
        demo.add("one");
        demo.add("two");
        demo.add("three");
        demo.add("four");
        demo.add("five");
        demo.add("add");
        //sortihg with dictionary
        Collections.sort(demo);
        System.out.println(demo);
        //sorting with reverse dictionar
        Collections.sort(demo,Collections.reverseOrder());
        System.out.println(demo);
    }
}