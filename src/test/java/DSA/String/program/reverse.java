package DSA.String.program;

public class reverse {
    public static void main(String[]args)
    {
        String a = "why not";
        String rev = "";
    for(int i = a.length()-1;i>=0;i--)
        {
rev += a.charAt(i);
        }
    System.out.println("reverse:"+rev);
    }

}
