package july.metlife;

import DSA.collections.set.LinkedHasgset;

import java.util.*;

public class uniqre_letter {
    public static void main (String[]args) {
        String r = "dekho krna hi hoga or koi nhi kar payega isliya krna to hoga hi or kregi hi";
       LinkedHashSet<String> hs = new LinkedHashSet<>();
       for(String s : r.split(" "))
       {
           hs.add(s);
       }
       String t = String.join(" ",hs);
        System.out.println(t);
    }
}


