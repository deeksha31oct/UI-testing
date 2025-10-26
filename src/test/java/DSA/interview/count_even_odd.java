package DSA.interview;

import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

public class count_even_odd {
    public static void main (String[]args)
    {
        int []a = {1,2,3,4,5,6,7,8,9};
        int even = 0 , odd = 0;
        for(int co:a)
        {
            if(co%2 ==0)
                even++;
            else
                odd++;
        }
        System.out.print("even :"+ even+" odd : "+ odd);
    }
}
