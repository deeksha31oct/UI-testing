package DSA.statement.sorting;

public class sorting_special {
    public static void main(String []args)
    {
        String ss = "deeksha122344@#$%^&*(";
        String rr = "";
        for(int i = 0;i<ss.length();i++)
        {
            char c = ss.charAt(i);
            if(!Character.isLetterOrDigit(c));
            {
                rr+= c;
            }
        }
        System.out.println(rr);
    }
}
