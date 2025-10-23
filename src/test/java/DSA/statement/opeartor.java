package DSA.statement;

public class opeartor {
    public static void main(String[]args)
    {
        int a  = 20 ; int b = 15 ;
        char opeartor = '+';
        switch (opeartor)
        {
            case '+':System.out.println(a+b);
            case '-':System.out.println(a-b);
            case '*':System.out.println(a*b);
            case '/':System.out.println(a/b);
            case '%':System.out.println(a%b);
            default:System.out.println("invalid");
        }
    }
}
