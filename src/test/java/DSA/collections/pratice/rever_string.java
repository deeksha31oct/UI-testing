package DSA.collections.pratice;

public class rever_string {
    public static void main(String[]args)
    {
        String s = "documnt recerse";
        String r =  new StringBuilder(s).reverse().toString();
        System.out.println(r);
        String st = "for loop le sath ";
        String re = "";
        for(int i = st.length()-1;i>=0;i--)
        {

            char c  = st.charAt(i);
           re+=c;
        }
        System.out.println(re);
    }


}
