package DSA.statement;

public class grading {
    public static void main(String[]args)
    {
        int m = 87;
        if(m>90)
        {
            System.out.println("a");
        }
        else if (m>70)
        {
            System.out.println("b");
        } else if (m<=88 && m>=85) {
            System.out.println("c");
        }
        else
        {
            System.out.println("fail");
        }
    }
}
