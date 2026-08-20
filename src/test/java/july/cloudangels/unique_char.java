package july.cloudangels;

public class unique_char {
public static void main(String []args)
{
    String u = "rajjkumar";
    StringBuilder sb = new StringBuilder();
    for(char c : u.toCharArray())
    {
        if(u.indexOf(c)==u.lastIndexOf(c))
        {
            sb.append(c);
        }
    }System.out.println(sb.charAt(2));

}
}
