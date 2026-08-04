package july.metlife;

public class reverse_w
{
    public static void main (String[]args) {
        String[] r = "dekho krna hi hoga".split(" ");
        StringBuilder sb = new StringBuilder();
            for(String rt:r )
            {
               sb.append(new StringBuilder(rt).reverse()).append(" ");
            }

            System.out.println(sb.toString());
    }
}
