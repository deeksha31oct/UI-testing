package DSA.array.program;

public class array_max_min
{
    public static void main(String[]args)
    {
        int a[] = {24,244,235,2355,3434,5443};
        int max = a[0] , min = a[0];
        for(int array :a)
        {
            if(array>max)max = array;
            if(array<min)min = array;
        }
        System.out.println("maximum:"+max);
        System.out.println("\n minimum : "+ min);
    }
}
