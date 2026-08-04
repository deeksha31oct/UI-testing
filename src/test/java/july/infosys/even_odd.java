package july.infosys;

public class even_odd
{
    public static void main(String[]args) {
        Integer[]a = {3,5,7,3,13,3};
        boolean  at = true;
        for(int i =0;i<a.length;i++)
        {
            if(a[i]%2 !=0)
            {
                at = false;
                break;
            }
        }
        System.out.println(at);
    }
}
