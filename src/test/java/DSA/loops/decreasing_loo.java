package DSA.loops;

public class decreasing_loo {
    public static void main(String[]args)
    {
        int k = 1;
        for(int i = 0;i<10;i++)
        {
            for(int j = 1;j<=10-i;j++)
            {
                System.out.print(k);
                System.out.print("\t");
                k++;
            }
            System.out.println("");
        }

    }
}
