package july;

public class char_uniques {
    public static void main (String []args)
    {
       String p = "appreations";
       int cn = 0;
       char rs = ' ';
       for(char bb: p.toCharArray())
       {
         if(p.indexOf(bb) == p.lastIndexOf(bb))
         {
           cn++ ;
           if(cn>=2)
           {
               rs = bb;
               break;
           }
         }
       }
       System.out.println("Second unique character: " + rs);

    }
}
