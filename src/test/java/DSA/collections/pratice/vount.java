package DSA.collections.pratice;

public class vount {
    public static void main(String[]args)
    {
        String s = "golu goly golu golu golu";
       s = s.replaceAll(" ","");
       while(!s.isEmpty())
       {
          char ct = s.charAt(0);
          int nt = s.replaceAll(String.valueOf(ct),"").length();
           System.out.println("counting : "+ String.valueOf(ct)+"check "+(s.length()-nt));
           s= s.replaceAll(String.valueOf(ct),"");
       }
    }
}


