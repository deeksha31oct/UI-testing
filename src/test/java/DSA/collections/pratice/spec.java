package DSA.collections.pratice;

public class spec {
    public static void main(String[]args)
    {
        String s = "djuhfjuh#$%^238347#$%^&";
        String rs = "";
       for(char r : s.toCharArray())
       {
           if(Character.isLetterOrDigit(r))
           {
               System.out.print(r);
           }
       }
    }
}
