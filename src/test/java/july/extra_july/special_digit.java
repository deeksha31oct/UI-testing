package july;

public class special_digit {
    public static void main (String[]args)
    {
        String qw=  "dee11324@#$%^&**kfjhuiv@#$%%^3493";
       // String ww= "";
        for(int i =0;i<qw.length();i++)
        {
            char ch = qw.charAt(i);
            if(Character.isLetter(ch))
            {
                System.out.print(""+ ch + "");
            }

        }

    }

}
