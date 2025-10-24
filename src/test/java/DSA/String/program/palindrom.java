package DSA.String.program;

public class palindrom {
    public static void main(String[]args)
    {
      String a = "racar";
      String b = "deeksha";

      String w = new StringBuilder(a).reverse().toString();
        String ww = new StringBuilder(b).reverse().toString();


        System.out.println(a.equals(w)? "palindrom":"not palindrom");
        System.out.println(b.equals(ww)? "palindrom":"not palindrom");
    }
}
