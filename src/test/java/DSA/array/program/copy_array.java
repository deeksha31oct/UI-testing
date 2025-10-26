package DSA.array.program;

public class copy_array {
    public static void main(String[]args)
    {
        int a[]= {2,3,4,5,6,7,8,9,1};
        int b []= new int[a.length];
        for(int i=0;i<a.length;i++)

        {
            b[i]=a[i];
        }
        System.out.print("copied array");
        for(int c:b) System.out.print(c+" ");
    }
}
