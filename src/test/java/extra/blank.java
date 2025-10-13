package extra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class blank
{

    public static void main (String []args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[]{10, 20, 30, 40, 50};
        blank b = new blank();
        List<Integer> nu = new ArrayList<>();

        for (int i = 0; i < a.length-1; i++) {
            int pre = a[i];
            int post = a[i + 1];
            for (int j = pre + 1; j < post; j++) {
                b.add(j, nu);
            }
        }
        System.out.println("extra.blank : " + nu);
    }
private void add( int j, List<Integer>nu)
        {
          nu.add(j);
        }
    }
