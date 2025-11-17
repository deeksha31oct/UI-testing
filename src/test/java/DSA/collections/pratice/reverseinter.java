package DSA.collections.pratice;

public class reverseinter {
    public static void main(String[]args)
    {
        String s = "more pratice to crack the interview ";
        String r = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            r+= s.charAt(i);
        }
        System.out.println(r);
    }
}
