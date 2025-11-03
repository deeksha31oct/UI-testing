package extra;

public class raj {
    public static void main(String[]args)
    {
        String a = "happy birthday";
        String r = "";
        for(int i = a.length()-1;i>=0;i--)
        {
            r += a.charAt(i);
        }
        System.out.println(r);
    }
}
