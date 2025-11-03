package extra;

import org.openqa.selenium.devtools.v85.layertree.model.LayerId;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class even_oodd {
    public static void main(String[]args) {
        List<Integer>a = Arrays.asList(2,2,3,4,5,7,5,8,9,11,13,15,14);
        List<Integer> even = new ArrayList<>();
        List<Integer>odd = new ArrayList<>();

        for(int nn :a)
        {
            if(nn%2==0)
            {
                even.add(nn);
            }
            else{
                odd.add(nn);
            }
        }
        System.out.println("even : "+ even + "/n odd : "+ odd);
    }
}
