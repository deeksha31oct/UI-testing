package DSA.String.method.regix;

public class replace_all {
    public static void main(String[]args)
    {
        String a = "she is very sweet and she is veri innocent and she is very cute and helpful and she is very charming";
        String regex = "(?i)she";
        System.out.println(a.replaceAll(regex,"deeksha"));

    }}
