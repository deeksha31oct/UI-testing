package extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class assending {
    public static void main(String[]args)
    {
        List<Integer>a = Arrays.asList(1,3,4,5,42,42,45,23125,633);
        Collections.sort(a);
        System.out.println(a);
        Collections.sort(a,Collections.reverseOrder());
        System.out.print(a);
        System.out.println(Collections.max(a));
        System.out.println(Collections.min(a));



    }
}
