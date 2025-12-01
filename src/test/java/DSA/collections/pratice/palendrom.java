package DSA.collections.pratice;

public class palendrom {
    public static void main (String[]args)
    {
        String s = "dad";
        String r = new StringBuilder(s).reverse().toString();
        if(s.equals(r))
        {
            System.out.println("palin");
        }

        else
        {
            System.out.println("not");
        }
    }
}
