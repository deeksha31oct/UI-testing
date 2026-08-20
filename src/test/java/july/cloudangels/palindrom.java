package july.cloudangels;

public class palindrom {
    public static void main (String []args)
    {
        String ww = "tyup kto tmo" ;
        StringBuilder sv = new StringBuilder(ww);
               String qw =  sv.reverse().toString();
               if(qw.equals(ww))
               {
                   System.out.println("palindrom"+ qw);
               }
               else
               {
                   String er = qw +ww.substring(2);
                   System.out.println("make palindrom : " + er);
               }

    }
}
