package DSA.collections.pratice;

public class spec {
    public static void main(String[]args)
    {
        String s = "djuhfjuh#$%^238347#$%^&";
        String rs = "";
        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(Character.isDigit(c))
            {
                rs+= c;
            }

        }
        System.out.println("special char :  "+ rs);
    }
}
