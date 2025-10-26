package DSA.array.program;

import java.util.Arrays;

public class duplicats_array {
    public static void main(String[]args)
    {
        int a []= {1,2,3,2,3,4,5,6,4,3,2,5,2,5,2,34,4,4,4,7,8,9,11,12,13,14,50,60,70};
        System.out.println("duplicates number");
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.print(" "+a[i]+" ");
                }
            }
        }
    }
}
