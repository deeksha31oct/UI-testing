package july;

public class Fab_series {
    public static void fabi (int n ) {
        int a = 0;
        int b = 1;
        if (n > 1) {
            System.out.println(a + " ");
        }
        for (int i = 0; i < n; i++)
        {
            int c =a+b;
            a=b;
            b=c;
            System.out.println(b+"");
        }
    }
    public static void main (String[]args)
    {
        fabi(20);
    }
}
