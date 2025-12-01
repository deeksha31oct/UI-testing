package DSA.interview;

public class unique_character {
    public static void main(String[]args)
    {
        String s = "automation";
        String w ="";
        for(char c : s.toCharArray())
        {
            if(s.indexOf(c)==s.lastIndexOf(c))
            {
                w+=c;

            }
        }
        System.out.println(w.charAt(2));
    }
}
