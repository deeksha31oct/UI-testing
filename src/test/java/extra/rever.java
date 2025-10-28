package extra;

public class rever {
    public static void main(String[]args)
    {
        String a = "check kro";
        String t = "";
        for(int i = a.length()-1;i>1;i--)
        {
            t += a.charAt(i);
        }
        System.out.println("rever : "+t);
    }
}
