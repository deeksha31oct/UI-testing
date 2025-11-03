package extra;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class second {
    public static void main(String[]args)
    {
        //   List<Integer> in = Arrays.asList(1,2,3,4,5,6,7,8,23);
        int []arr = {2,34,54,67,87,65,43,1123,34,11,23,455};
        System.out.println(Arrays.stream(arr).boxed().sorted().skip(arr.length-2).findFirst().get());
        System.out.println(Arrays.stream(arr).boxed().sorted().skip(arr.length-2).findFirst().get());
    }
}
