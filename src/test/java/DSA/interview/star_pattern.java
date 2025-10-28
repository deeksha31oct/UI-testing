package DSA.interview;

public class star_pattern {
    public static void main(String[]args)
    {
       int row = 7;
       for(int i = row;i>=1;i--)
       {
String s ="&".repeat( i );
           System.out.println(" "+ s +" ");
       }
    }
}
