package july;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sort_array {
    public static void main(String[]args)
    {
        List<Integer> a = Arrays.asList(2,5,7,8,9,12,14,16);
        Collections.sort(a);
        System.out.println(a);
        Collections.sort(a,Collections.reverseOrder());
        System.out.println(a);
        System.out.println(Collections.min(a));
        System.out.println(Collections.max(a));
    }
}


