package DSA.interview;

public class max_min {
    public static void main(String[]args)
    {
        int []a = {2,534,76,1,56,2322,55};
        int max = a[0];
        int min = a[0];
        for(int num:a)
        {
          if(num>max)max=num;
          if(num<min)min=num;
        }
        System.out.println("maximum:"+ max);
        System.out.println("minimum : "+ min);
    }
}
