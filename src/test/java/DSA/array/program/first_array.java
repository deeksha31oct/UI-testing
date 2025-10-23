package DSA.array.program;

import java.util.Arrays;

public class first_array {
    public static void main (String[]args)
    {
        int a[] = {2,4,6,8,10,12,14};
        int b[] = {124,3,55,1,17,91,121,13,15};
        int c[]= {2,4,6,8,10,12,14};
       // Arrays.compare(b);
        //compare two string
        System.out.println(Arrays.compare(a,b));
        System.out.println(Arrays.compare(a,c));
        //equals or npt
        System.out.println(Arrays.equals(a,b));
        System.out.println(Arrays.equals(a,c));
    //sort by assessmend order
        Arrays.sort(b);
        for(int o :b)
        {
            System.out.println(o);
        }
        //fill one digit in this entire aray
        Arrays.fill(a,777);
        for(int e :a)
        {
            System.out.println(e);
        }
    //count length of array
        System.out.println(a.length);
    }
}
