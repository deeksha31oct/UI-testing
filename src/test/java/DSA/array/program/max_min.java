package DSA.array.program;

public class max_min {
    public static void main(String[]args)
    {
        int []a = {1,4,6,3,7,37,85,324,5,85,33};
        int max = a[0];
        int min = a[0];
        for(int num : a)
        {
           if(num>max)max= num;
           if(num<min)min=num;

        }
        System.out.println("maximium : "+ max);
        System.out.println("mini: "+ min);
    }
}
