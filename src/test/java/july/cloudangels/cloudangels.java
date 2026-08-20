package july.cloudangels;

public class cloudangels
{
public static void main (String []args)
{
    String s = "dekhge";
    StringBuilder sb = new StringBuilder(s);
     String rev =  sb.reverse().toString();
  if(s.equals(rev))
  {
    System.out.println("The string is a palindrome."+s);
  }
  else
  {
      String wq = s+rev.substring(1);
    System.out.println("The string is not a palindrome."+ wq);
  }
}
}
