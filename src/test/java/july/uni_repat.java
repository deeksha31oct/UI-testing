package july;

public class uni_repat {
    public static void main(String[] args) {
        String q = "geetanjali";
        int n = 0;
        char ct =' ';
        for(char cr : q.toCharArray())
        {
            if(q.indexOf(cr)== q.lastIndexOf(cr))
            {
                n++;
                if(n>=2)
                {
                  ct = cr;
                  break;
                }

            }

        }
        System.out.println(ct);
    }
}
