package DSA.collections.stringbuilder;

public class int_palindrom {
    public static void main(String[]args)
    {
        int a = 12321;
        String s = String.valueOf(a);
        String  re = new StringBuilder(s).reverse().toString();
        if(s.equals(re))
        {
            System.out.println("yes");}
        else{
            System.out.println("no");
}   }
}
