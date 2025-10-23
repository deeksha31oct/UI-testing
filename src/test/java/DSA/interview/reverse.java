package DSA.interview;

public class reverse {
    public static void main(String[]args) {
    String a ="dekho aaj barish he ";
    String r = "";
    for(int i = a.length()-1;i>=0;i--)
    {
        r += a.charAt(i);
    }
    System.out.println(r);
    }}