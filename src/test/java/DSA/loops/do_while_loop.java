package DSA.loops;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class do_while_loop {
    private static final Logger log = LoggerFactory.getLogger(do_while_loop.class);

    public static void main(String[]args) {
       //for increaing value using do while loop
        int i = 30;
        do
        {
            System.out.println(i);
            i++;
        }
        while (i<40);

        //for decreasing value using do while loop
        int j = 30;
        do {

                System.out.println(j);
                j++;
            }
        while (j<50);
        }
    }


