package June_pratice_2026;

public class test_missing {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 12, 18, 25};
       System.out.println("missing muber");
       for(int i = 0 ;i<arr.length-1;i++)
       {
           for(int j = arr[i]+1;j<arr[i+1];j++)
           {
               System.out.print( " " +j+ "");
           }
       }
    }
}
/*  for (int i =0;i<arr.length-1;i++)
* {
* for(j=arr[i]+1 ; j<arr[i+1];j++)
* {
* System.out.print(j+" ")}}*/