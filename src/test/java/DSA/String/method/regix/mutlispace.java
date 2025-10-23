package DSA.String.method.regix;

public class mutlispace {
    public static void main(String[]args)
    {
        String a = "during     testing in QA progress    no    done marks";
        String[]w = a.split("\\s+");
        for(String k:w)
        {
        System.out.println(k);}
    }
}
