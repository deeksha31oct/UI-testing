package DSA.array.program;

public class maximum {
    public static void main(String[]args)
    {
        int [] arr = {2,3,5,33,64,76,35,787,35};
        int max = arr[0]; int min =arr[0] ;
        for(int num : arr)
        {
            if(max<num)max = num;
            if(min>num)min=num;
        }
        System.out.println("max: "+max);
        System.out.println("min: "+min);
    }
}
