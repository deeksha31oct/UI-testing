package DSA.array.method;

import java.util.Arrays;

public class fill {
    public static void main(String[]args) {
        int[] a = {1, 243, 22121, 3, 5, 8, 4, 9, 244, 676};
        Arrays.fill(a,22);
        for( int l : a)
        {
System.out.println(l);
        }
    }
}
