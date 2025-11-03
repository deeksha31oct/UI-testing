package Bhagya;

public class interview {
    public static void main (String[]args)
    {
        String a = "deeksha.oct31@gmsil.com";
        String b = "";
        for(int i= 0;i<a.length();i++)
        {
            char c = a.charAt(i);

            if(!Character.isLetterOrDigit(c))
            {
                b+=c;
            }
        }
        System.out.println("specail charcet :"+ b);
    }
}
