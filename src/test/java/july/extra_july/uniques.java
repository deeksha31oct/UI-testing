package july;

public class uniques {
    public static void main (String[]args)
    {
       String sw = "deeksha is very good gild and deeksha know automation testing".replaceAll(" ","");
       while(!sw.isEmpty())
       {
           char c = sw.charAt(0);
           int ww = sw.replaceAll(String.valueOf(c),"").length();
           System.out.println("character name " + String.valueOf(c)+ " count "+(sw.length()-ww));
           sw = sw.replaceAll(String.valueOf(c),"");
       }


    }
}
