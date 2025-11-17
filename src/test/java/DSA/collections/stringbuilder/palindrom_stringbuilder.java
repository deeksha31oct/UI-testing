package DSA.collections.stringbuilder;

public class palindrom_stringbuilder {
    public static void main(String[]args)
    {
        String s = "level";
        String re = new StringBuilder(s).reverse().toString();
        if(s.equals(re))
        {
            System.out.println("yes");}
        else{
            System.out.println("no");}

    }
}
