package DSA.statement.loops;

public class reverse_string {
    public static void main(String[]args)
    {
        String a = "deeksha kashyap";
       String Stringrev = "";
        char c ;
        for(int i = 0;i<a.length();i++)
        {
            c = a.charAt(i);
            Stringrev = c+Stringrev;
        }
        System.out.println(Stringrev +" ");
    }

}
