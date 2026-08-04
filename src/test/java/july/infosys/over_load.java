package july.infosys;

public class over_load {
    int add(int a , int b ){
        return a+b;
    }
    int add(int a , int b , int c )
    {
        return a+b+c;
    }
    double add(double a , double b )
    {
        return a+b;
    }
    void show(String name , int id)
    {
        System.out.println(name + " "+ id);
    }
    void show( int id,String name )
    {
        System.out.println( id+ " "+ name);
    }
public static void main(String []args)
{
    over_load pl = new over_load();
    System.out.println(pl.add(10,20));
   System.out.println(pl.add(90,11,12));
    System.out.println(pl.add(20.1,32.22));
    pl.show("raju",21);

}
}
