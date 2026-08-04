package july.infosys;

public class String_reverse {
    public static void main(String []args )
    {
        String e = "reverse testing";
        StringBuilder sb = new StringBuilder();
       for(String w :e.split(" "))
       {
           sb.append(new StringBuilder(w).reverse().toString()).append("");
       }
       System.out.println(sb.toString());

    }
}
