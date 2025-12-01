package DSA.interview;

public class lowercase {
    public static void main(String[]args)
    {
        String s = "deeKSha KaSHyap";
        String q = "";
        for(char c : s.toCharArray())
        {
            if(Character.isUpperCase(c))
            {
q+=Character.toLowerCase(c);
            }
            else {
                q+=c;
            }
        }
        System.out.println(q);
        System.out.println(s.toLowerCase());
    }
}
