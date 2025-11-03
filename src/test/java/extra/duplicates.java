package extra;

import java.util.*;

public class duplicates {
    public static void main(String[]args) {
        List<Integer> a = Arrays.asList(2, 11, 34, 2, 2, 2, 43, 4, 3, 43, 34, 34, 34, 34, 34, 34);
    Set<Integer> S = new HashSet<>(a);
    System.out.println("du"+ S);

    }
}
