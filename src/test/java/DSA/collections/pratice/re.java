package DSA.collections.pratice;

public class re {
    public static void main(String[]args)
    {
        String st = "reverse of string ";
        String rr = "";
        for(int i = st.length()-1;i>=0;i--)
        {
         rr +=st.charAt(i);
        }
        System.out.println(rr);
    }
}
