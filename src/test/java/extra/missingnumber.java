package extra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class missingnumber
{
public  static void manin (String[]args) {
    Scanner s1 = new Scanner(System.in);
    int[] q = new int[]{2, 6, 9, 14, 19, 25};

    missingnumber ca = new missingnumber();
    List<Integer> num = new ArrayList<>();
    for (int i = 0; i < q.length - 1; i++) {
        int pre = q[i];
        int now = q[i + 1];
        for (int j = pre + 1; j < now; j++) {
            num.add(j);
        }
    }
    System.out.println("missing : " + num);
}
     private void add(int j ,List<Integer> num)
    {
        num.add(j);
    }
}

