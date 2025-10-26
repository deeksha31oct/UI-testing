package DSA.array.program;

public class reverse_array {
    public static void main(String[]args)
    {
        int a[] = {10,20,30,40,50,60,70,80,90,100};
        System.out.print("orignal array: ");
        for(int array:a)System.out.print(array+" ");
        System.out.print("\n reverse array: ");
        for(int i = a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }

    }
}
