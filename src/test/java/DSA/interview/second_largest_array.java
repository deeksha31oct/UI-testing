package DSA.interview;

import java.util.Arrays;
import java.util.Comparator;

public class second_largest_array
{
    public static void main(String[]args)
    {
        int []arr = {2,34,54,67,87,65,43,1123,34,11,23,455};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int count:arr)
        {
            if(count>first)
            {
                second=first;
                first=count;
            }
            else if(count>second && count!=first)
            {
                second= count;
            }
        }
        System.out.println("second largest nummber in array : "+ second);
        System.out.println(Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

        System.out.println(Arrays.stream(arr).boxed().sorted().skip(arr.length - 2).findFirst().get());
    }
}

