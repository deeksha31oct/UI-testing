package June_pratice_2026;

public class test_specialchar {
    public static void main (String[]args)
    {
        String st = "deeksh!@&$$>>>%%???///%++---#gmail...123234";
        String ss = "";
        for (int i = 0;i<st.length();i++)
        {
            char ch = st.charAt(i);
            if(!Character.isSpaceChar(ch))
            {
                ss =ss+ ch;
            }
        }System.out.println(ss);
    }
}
