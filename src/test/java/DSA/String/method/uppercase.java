package DSA.String.method;

public class uppercase {
    public static void main(String[]args)
    {
        String co = " pratice for automaation in UI Testing";
        String ca = "  joint with first string";
        System.out.println(co.toUpperCase());
        System.out.println(ca.toUpperCase());
       co = co.trim().toUpperCase();
        ca= ca.trim().toUpperCase();
String re = co + " " + ca;
System.out.println(re);


    }
}
