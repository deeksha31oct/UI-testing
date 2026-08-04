package july.infosys;
class payment{
    void pay()
    {
        System.out.println("generic pay");
    }
}class card_pay extends payment

{  @Override
    void pay()
    {
        System.out.println("card pay");
    }
}
class water_pay extends payment
{
    @Override
    void pay()
    {
        System.out.println("water pay");
    }
}
public class overriding {
    public static void main(String[]args)
    {
payment py = new payment();
        py.pay();
        py= new card_pay();
        py.pay();
    }
}
