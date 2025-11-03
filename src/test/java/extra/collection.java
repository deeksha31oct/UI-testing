package extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class collection {
    public static void main(String[]args) {
        List<Integer> in = Arrays.asList(23,11,23,563,53,4);
        Collections.sort(in);
        System.out.println(in);
        Collections.sort(in ,Collections.reverseOrder());
        System.out.println(in);


    }}
