package DSA.array.program;

public class array_enen_odd {
    public static void main(String[]args)
    {
    int []a = {1,4,6,3,7,37,85,324,5,85,33};
    for(int num:a) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        }
        else
        {
            System.out.println(num+":" + "is odd");
        }
    }
}}
