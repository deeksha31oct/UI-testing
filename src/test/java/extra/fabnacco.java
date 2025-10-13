package extra;

public class fabnacco {
    static void series(int n)
    {
        int a = 0; int b = 1 ;
        if (n<1)
            return;
        System.out.println(a+"");
        for(int i=0;i<n;i++)
        {
            int sum = a+b;
            a= b;
            b= sum;
            System.out.println(b+ "");
        }
    }
    public static void main(String[]args)
    {
        series(10);
    }
}
