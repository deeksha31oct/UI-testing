package DSA.array.method;

import java.util.Arrays;

public class two_equals {
    public static void main(String[]args) {
        String[] a = {"deeksha", "raj", "qa", "automation"};
        String[] b = {"deeksha", "raj", "qa", "automation", "eng", "sdet"};
        System.out.println(Arrays.equals(a,b));
        System.out.println(Arrays.equals(b,a));
    }
}
