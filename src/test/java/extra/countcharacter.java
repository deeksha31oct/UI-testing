package extra;

public class countcharacter {
    public static void main(String[] args) {
        String s = "praticeautomation one two three four five and six".replaceAll(" ","");
        while(!s.isEmpty())
        {
            char c = s.charAt(0);
            int length= s.replaceAll(String.valueOf(c),"").length();
            System.out.println("count:"+String.valueOf(c)+" size : "+ (s.length()-length) );
            s= s.replaceAll(String.valueOf(c),"");

        }

    }
}
