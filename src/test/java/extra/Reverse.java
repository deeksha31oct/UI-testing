package extra;

public class Reverse {
    public static void main(String[]args)
    {
        String rev= "No rain";
        String reverserev = "";
        char ch ;
        for(int i = 0 ; i<rev.length();i++)
        {
            ch = rev.charAt(i);
            reverserev = ch+reverserev;

        }

    System.out.println("out "+ reverserev);
}}
