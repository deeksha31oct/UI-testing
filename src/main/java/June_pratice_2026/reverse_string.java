package June_pratice_2026;

public class reverse_string {
    public static void main (String []args)
    {
        String s = "again prepartion for interview";
        String rever = "";
        char ch ;
        for(int i = s.length()-1;i>=0;i--)
        {
            ch = s.charAt(i);
            rever = rever+ch;

        }
        System.out.println("rever :"+rever);
    }
}
