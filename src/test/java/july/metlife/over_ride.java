package july.metlife;
class test
{
    void plus() {
    System.out.println("dekho");}
}
class test_1 extends test
{
    @Override
    void plus()
    {
        System.out.println("kr liya na");
    }
}
public class over_ride
{
    public static void main (String[]args)
    {
        test_1 tt= new test_1();
        tt.plus();
    }
}
