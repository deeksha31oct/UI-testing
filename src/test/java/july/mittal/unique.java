package july.mittal;

public class unique {
    public static void main(String[]args) {
        String st = "deeksha";
        StringBuilder sb = new StringBuilder();
        for(char ww : st.toCharArray())
        {
            if(st.indexOf(ww) == st.lastIndexOf(ww))
            {
                sb.append(ww);
            }
        }
        System.out.println(sb.charAt(2));
    }
}
