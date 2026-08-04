package july.mittal;

public class reverse_loop {
    public static void main(String [] args)
    {
        String st = "my coding part is very good";
        String bb = "";
        char ch ;
        for(int i =0;i<st.length();i++)
        {
            ch = st.charAt(i);
            bb= ch+bb;
        }
        System.out.println("reverse :" + bb);

    }

}
