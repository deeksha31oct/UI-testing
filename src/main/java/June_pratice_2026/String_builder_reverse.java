package June_pratice_2026;

public class String_builder_reverse {
    public static void main (String[]args)
    {
        String r = "check kro reverse string with string builder";
        StringBuilder st = new StringBuilder();

        st.append(r);
        st.reverse();
        System.out.println("revers :"+st);


    }
}
