package DSA.interview;

public class even_odd_array {
    public static void main(String[]args)
    {
        int a [] ={2,6,97,34,13,65,24,56,35,225,7665,3334,788,343,222,4223,1121,3431,121};
      System.out.println("even number :");
      for(int num : a)
      {
          if(num%2==0)
          {
              System.out.print(" "+num+" ");
          }
      }
        System.out.println("\n odd number ");
      for(int num : a )
      {
          if(num%2 !=0)
          {
              System.out.print(" "+num+" ");
          }
      }
    }
}
