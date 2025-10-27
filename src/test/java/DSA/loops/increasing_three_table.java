package DSA.loops;

public class increasing_three_table {
    public static void main(String[]args)
    {
        int k = 3;
        for(int i = 1;i<10;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j*k+"\t");

            }
            System.out.println(" ");
        }
    }
}
