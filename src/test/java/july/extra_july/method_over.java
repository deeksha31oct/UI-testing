package july.extra_july;

public class method_over
{
    int sum(int a , int b ) {
        return  a+b;
    }
    int sum(int d ,int f,int g)
    {
        return d+f+g ;
    }
    public static void main(String []args)
    {
        method_over mv = new method_over();
        System.out.println(mv.sum(3,4));
    }
}
