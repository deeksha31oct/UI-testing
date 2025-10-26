package DSA.interview;

public class only_duplicate_number_from_array {
    public static void main(String[]args)
    {
        int array []= {1,1,1,1,2,2,2,3,3,3,3,4,5,6,7,5,78,98,7,6,5,11,12,13};
        System.out.println("duplocates number :");
        for(int i = 0;i<array.length;i++)
        {
            for(int j = i+1;j<array.length;j++)
            {
                if(array[i]==array[j])
                {
                    System.out.print(" "+array[i]+" ");
                }

            }
        }
    }
}
