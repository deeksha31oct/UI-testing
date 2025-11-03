package extra;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class dup {
    public static void main(String[]args)
    {
        List<Integer>aa = Arrays.asList(1,3,3,3,2,2,4,5,64,32,55,2332,7,1123455,221111,1,1,1,2,22,3,3,3,4,4,4,4,1);
        HashSet <Integer> hh = new HashSet<>(aa);
        System.out.println("uniquest :" + hh);
    }
}
