package july.extra_july;

public class missing_number {
    public static void main (String[]args)
    {
        Integer []a = {2,5,9,13,17};
       for(int i =0;i<a.length-1;i++)
       {
         for(int j = a[i]+1;j<a[i+1];j++)
         {
             System.out.print(" "+ j+ " ");
         }
       }
    }
}
