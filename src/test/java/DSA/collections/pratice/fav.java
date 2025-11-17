package DSA.collections.pratice;

public class fav {
    public static  void fav(int n )
    {
        int a = 0;int b= 1;
        System.out.println(a+" ");
        for(int i = 0;i<n ;i++)
        {
            int c = a+b;
            a= b;
            b= c;
            System.out.println(b+" ");
        }
    }
    public static void main(String[]args)
    {
        fav(20);
    }
}
