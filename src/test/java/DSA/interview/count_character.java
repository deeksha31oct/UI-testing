package DSA.interview;

public class count_character
{
    public static void main(String[]args) {
        String a = "count how much  number are repetitive";
        a = a.replaceAll(" ", "");
        System.out.println(a);
        while(!a.isEmpty())
        {
            char c = a.charAt(0);
       int it = a.replaceAll(String.valueOf(c),"").length();
           System.out.println("counting: "+String.valueOf(c)+" Size : "+(a.length()-it));
           a=a.replaceAll(String.valueOf(c),"");
        }

    }

}
