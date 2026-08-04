package july.infosys;

public class uniques_char {
    public static void main(String[]args)
    {
        String v = "deeksha";
        StringBuilder sb = new StringBuilder();
        for(char c : v.toCharArray())
        {
            if(v.indexOf(c) == v.lastIndexOf(c))
            {
                sb.append(c);
            }
        }
        System.out.println(sb.charAt(2));
    }
}



