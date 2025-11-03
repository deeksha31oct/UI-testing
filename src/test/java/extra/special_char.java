package extra;

import java.util.Arrays;

public class special_char {
    public static void main(String[]args)
    {
        String a = "one123!@# teo123!@#three33!@#";
       String b = "";
       for(int i = 0;i<a.length();i++)
       {
        char c = a.charAt(i);
        if(!Character.isLetterOrDigit(c))
           {
               b+=c;
           }
       }
System.out.println(b);    }
}
