package June_pratice_2026;

public class test_count_character {
    public static <Char> void main (String []args)
    {
        String we = "automation testing sdet role opeining".replaceAll(" ","");
        while (!we.isEmpty())
        {
            char ch = we.charAt(0);
            int test = we.replaceAll(String.valueOf(ch),"").length();
            System.out.println("count "+ String.valueOf(ch)+ " repat "+ (we.length()-test));
            we = we.replaceAll(String.valueOf(ch),"");
        }
    }
}
