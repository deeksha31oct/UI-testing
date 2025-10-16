package DSA;

public class missing_number {
    public static void main(String[]args)
    {
        int at[] = {2,6,10,15,21};

        for(int i = 0; i < at.length; i++)
        {
            int j = i + 1;
            if (j < at.length && at[i] != at[j]) {//1 < 4
                for(int k = at[i] + 1; k < at[j]; k ++) {
                    System.out.println(k);
                    ////missing values .....k
                }
            }
        }
    }
}
