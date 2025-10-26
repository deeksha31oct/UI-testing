package DSA.array.program;

public class array_enen_odd {
    public static void main(String[]args)
    {
    int []a = {1,4,6,3,7,37,85,324,5,85,33};
    System.out.println("even number : ");
    for(int nn:a)
    {
        if(nn%2==0)
        {
            System.out.print(" "+nn+" ");
        }
    }
    System.out.println("\n odd number");
    for(int nn : a)
    {
        if(nn%2 !=0)
        {
            System.out.print( " " +nn+" ");
        }
    }
}}
