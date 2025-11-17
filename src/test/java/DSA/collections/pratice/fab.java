package DSA.collections.pratice;

public class fab {
    public static void main(String[]args)
    {
        int a = 0 , b= 1;
        System.out.println(a+" ");
        for(int i = 2;i<10;i++)
        {
            int c = a+b;
            a=b;
            b=c;
            System.out.println(b+" ");
        }
    }
}
