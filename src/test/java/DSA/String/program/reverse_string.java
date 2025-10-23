package DSA.String.program;

public class reverse_string {
    public static void main(String[]args)
    {
        String a = "dekho ho  gya na ";
        String re = "";
        for(int i = a.length()-1;i>=0;i--)
        {
            re += a.charAt(i);
        }
        System.out.println("reverse : "+ re);
    }
}
