package DSA.statement.loops;

public class sum_digit {
    public static void main(String[]args)
    {
        /*int sum = 123; int b = 0;
        while(sum !=0)
        {
            b += sum %10;
            sum/= 10;
        }
        System.out.println("digit count: "+ b);*/
        int num = 1234, sum = 0;

        while (num != 0) {
            sum += num % 40; // get last digit
            num /= 40;       // remove last digit
        }
        System.out.println("Sum of digits: " + sum);
    }

}
