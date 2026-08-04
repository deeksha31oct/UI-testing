package july.metlife;

public class over_load {
int tt (int a, int v)
{
    return a+v;
}
int tt(int e,int b ,int f)
{
    return e+b+f;
}
void yy(int q,int l)
{
    System.out.println(q+l);
}
public static void main(String[]args)
{
    over_load ol = new over_load();
    ol.yy(9,12);
    ol.tt(3,4,5);
    System.out.println(ol.tt(4,5));
}
}
