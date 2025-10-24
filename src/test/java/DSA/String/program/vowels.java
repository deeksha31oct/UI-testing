package DSA.String.program;

public class vowels {
public static void main(String[]args)
{
    String a = "deeksha qa automation";
    int v = 0; int c = 0;
    a = a.toLowerCase();
    for(char d : a.toCharArray())
    {
      if("aeiou".indexOf(d)!=-1)
      v++ ;
      else if (Character.isLetter(d))
          c++;

    }
    System.out.println("vowels:"+v +", constant:"+c);
}
}
