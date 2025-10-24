package DSA.String.program;

public class repitive_character {
    public static void main(String[]args)
    {
        String a = "abababacd dfedks rajkumar kewat deeksha kashyap";

while(!a.isEmpty())
{
    char ch= a.charAt(0);
    int newvalue = a.replaceAll(String.valueOf(ch),"").length();
    if(ch== ' ')
    {
        a = a.replaceFirst(" ","");
        continue;
    }
    System.out.println("charcarter : "+ String.valueOf(ch)+" size :"+(a.length()-newvalue));
    a=a.replaceAll(String.valueOf(ch),"");
}
    }
}
