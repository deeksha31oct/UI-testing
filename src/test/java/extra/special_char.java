package extra;

import java.util.Arrays;

public class special_char {
    public static void main(String[]args)
    {
        String a = "one123!@# teo123!@#three33!@#";

       for(int i = 0;i<a.length();i++)
       {
        char c = a.charAt(i);
        if(!Character.isLetterOrDigit(c))
           {
               System.out.println(c);
           }
       }
  }
}
