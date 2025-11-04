package DSA.statement.sorting;

public class sorting_letter
{
    public static void main(String[]args)
    {
        String st = "deeksha12354@#$%";
        String rr = "";
        for(int i=0;i<st.length();i++)
        {
            char c = st.charAt(i);
            if(!Character.isAlphabetic(c))
            {
              rr+=c;
            }
        }
        System.out.println(rr);
    }
}
