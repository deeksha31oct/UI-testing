package DSA.array.program;

public class sorted_array {
    public static void main(String[]args)
    {
        int []array = {2,34,54,23,3,4,5,6,7,8,9};
        boolean sorted = true;
        for(int i =0;i<array.length-1;i++)
        {
            if(array[i]>array[i+1])
            {
                sorted= false;
                break;
            }

        }
        System.out.println("sorted:"+ sorted);
    }
}
