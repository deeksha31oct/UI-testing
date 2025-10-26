package DSA.interview;

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
    }
}
