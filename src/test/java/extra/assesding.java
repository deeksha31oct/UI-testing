package extra;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class assesding {
    public static void main(String[]args) {
    List<Integer> aa = Arrays.asList(1,3,5,6,23,23,5445);
        Collections.sort(aa);
        System.out.println(aa);
        Collections.sort(aa,Collections.reverseOrder());
        System.out.println(aa);

        //max
        System.out.println("min "+ Collections.min(aa));
        System.out.println("max" + Collections.max(aa));

    }}
