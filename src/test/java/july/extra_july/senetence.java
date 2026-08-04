package july.extra_july;

import java.util.LinkedHashSet;

public class senetence {
    public static void main(String[] args) {
        String st = "deeksha is good engineer , deeksha lnow automation testing , deeksha know manual testing and deeksha know api testing , deeksha know data base also";
        LinkedHashSet<String> qq = new LinkedHashSet<>();
       for(String aa : st.split(" "))qq.add(aa);
       String vv = String.join(" ",qq);
      System.out.println(vv);

    }
}

