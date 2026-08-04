package july.mittal;

public class reverse_word {
    public static void main(String[]args)
    {
        String st = "my java coding is not good";
       StringBuilder sb = new StringBuilder();
       for(String res : st.split(" "))
       {
           sb.append(new StringBuilder(res).reverse()).append(" ");
           //sb.append(new StringBuilder(res).reverse()).append("");
       }
       System.out.println("word : "+ sb.toString().trim());
    }}

