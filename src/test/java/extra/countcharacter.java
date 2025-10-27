package extra;

public class countcharacter {
    public static void main(String[] args) {
        String s = "praticeautomation one two three four five and six";
        while(!s.isEmpty())
        {
            char c = s.charAt(0);
            int cc = s.replaceFirst(" ","").length();
            if(cc==' ')
            {
                s=s.replaceFirst(" ","");
            continue;
            }
            int length= s.replaceAll(String.valueOf(c),"").length();
            System.out.println("count:"+String.valueOf(c)+" size : "+ (s.length()-length) );
            s= s.replaceAll(String.valueOf(c),"");

        }

    }
}
