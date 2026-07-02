package july;

public class reverse_string {
    public static void main(String[]args)
    {
        String ww= "most important questions";
        String qw = "";
        char ch ;
        for(int i =0;i<ww.length();i++)
        {
            ch = ww.charAt(i);
            qw = ch+qw ;
        }
        System.out.println("reverse string " + qw);
    }
}
