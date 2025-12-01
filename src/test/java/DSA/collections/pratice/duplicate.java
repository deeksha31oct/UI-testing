package DSA.collections.pratice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class duplicate {
    private static final Logger log = LoggerFactory.getLogger(duplicate.class);

    public static void main(String[]args) {
        Integer[] a = {1, 2, 3, 11, 42, 1, 1, 1, 3, 3, 2, 2, 2, 5, 5, 5, 5};
      HashSet<Integer>hh= new HashSet<>(Arrays.asList(a));
      //hh.add(a);
        System.out.println(hh);

        ArrayList<Integer> ab = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 1; i <= 24; i++) {
            if (i % 2 == 0) {
                ab.add(i);
            } else {
                b.add(i);
                System.out.println("even " + ab + "\n" + " odd " + b);
            }
        }

    }}
