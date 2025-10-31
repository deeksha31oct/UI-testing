package DSA.interview;

public class prime_number {
    public static void main(String[]args)
    {
        String a = "Dee!@#$ksha!@#$%1233!@#$";
        String b = "";
        for(int i = 0;i<a.length();i++)
        {
char ch = a.charAt(i);
if(!Character.isLetterOrDigit(ch))
{
b+= ch;
}
        }
        System.out.println("special char :  "+ b);

    }
}
