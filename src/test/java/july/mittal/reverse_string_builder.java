package july.mittal;

public class reverse_string_builder {
    public static void main (String []args)
    {
        String st = "my testing is very good";
        StringBuilder sb = new StringBuilder(st);
        sb.reverse();
        System.out.println(sb.toString());
    }

}
