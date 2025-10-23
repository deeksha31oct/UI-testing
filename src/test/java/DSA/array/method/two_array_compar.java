package DSA.array.method;

import java.util.Arrays;

public class two_array_compar {
    public static void main(String[]args)
    {
        String[]a = {"deeksha","raj","qa","automation"};
        String[]b = {"deeksha","raj","qa","automation","eng","sdet"};
        System.out.println(Arrays.compare(a,b));
        System.out.println(Arrays.compare(b,a));
    }
}
