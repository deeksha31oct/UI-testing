package DSA.String.program;

public class repeat_character {
    public static void main(String[]args)
    {
        String a = "deeksha kashyap name me kitne bar repeat ho rha he wo check krna he ";
        while(!a.isEmpty())
        {

            int val = a.replaceAll(String.valueOf(a.charAt(0)),"").length();
            if(a.charAt(0) == ' ')
            {
             a= a.replaceFirst(" ","");
             continue;
            }
            System.out.println("char : "+ String.valueOf(a.charAt(0))+" size:"+(a.length()-val));

            a= a.replaceAll(String.valueOf(a.charAt(0)),"");
        }
    }
}
