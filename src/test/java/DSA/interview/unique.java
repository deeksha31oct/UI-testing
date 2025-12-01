package DSA.interview;

import java.util.Arrays;

public class unique
{
    public static void main (String[]args)
    {
        String s = "deeksha";
        String w = "";
        for(char c : s.toCharArray())
        {
            if(s.indexOf(c)==s.lastIndexOf(c))
{
 w+=c;
}
        }
        System.out.println(w.charAt(1));




    }
}
