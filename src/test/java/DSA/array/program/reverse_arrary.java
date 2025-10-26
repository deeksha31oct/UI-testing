package DSA.array.program;

public class reverse_arrary {
    public static void main(String[]args)
    {
        int a[] = {1,2,3,4,5,6,7,8,9,10,11,13,21,22,23,2,42,5,2,67};
        System.out.print("org : ");
        for(int ar:a)System.out.print(ar+" ");
        System.out.print("\n rever array : ");
        for(int i= a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }

    }
}
