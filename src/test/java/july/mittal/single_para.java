package july.mittal;

import java.util.LinkedHashSet;

public class single_para {
    public static void main(String[]args) {
        String st = "my java coDDing is not good my java coding is avergae and my name deeksha and deeksha is good engineer";
      LinkedHashSet<String> ht = new LinkedHashSet<>();
      for(String ct : st.split(" "))
      {
          ht.add(ct);
      }
      System.out.println(String.join(" ",ht));
    }
}

