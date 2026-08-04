package july;

public class uni_repat {
    public static void main(String[] args) {
        String q = "geetanjali";
    int tt=0;
    char yy =' ';
    for(char cu : q.toCharArray() )
    {
        if(q.indexOf(cu)==q.lastIndexOf(cu))
        {
            tt++;
            if(tt==2)
            {
                yy=cu;
                break;
            }
        }
    }
    System.out.println("second : "+ yy);
    }}
