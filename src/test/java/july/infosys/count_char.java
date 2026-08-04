package july.infosys;

public class count_char
{
    public static void main(String[]args)
    {
        String r = "hornback bike".replaceAll(" ","");
       while(!r.isEmpty())
       {
           char ct = r.charAt(0);
           int dd = r.replaceAll(String.valueOf(ct),"").length();
           System.out.println("char :" + String.valueOf(ct)+" repate :"+(r.length()-dd));
           r= r.replaceAll(String.valueOf(ct),"");
       }
    }
}
