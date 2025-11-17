package DSA.collections.pratice;

public class palindrom {
    public static void main(String[]args)
    {
        String s = "madam";
        String r = "";
        for(int i=s.length()-1;i>=0;i--)
        {
r = r+s.charAt(i);
        }
    //    System.out.println(r);
        if(s.equals(r))
        {
            System.out.println("palindrom");
        }
        else{
            System.out.println("not palindrom");}
    }
}
