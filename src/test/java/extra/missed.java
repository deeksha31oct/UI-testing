package extra;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class missed
{
    public static void main (String[]args)
    {
        Scanner s = new Scanner(System.in);
        int[]a = new int[] {10,15,20,25,30};
        missed cat = new missed();
        List<Integer> num = new ArrayList<>();
        for(int i = 0;i<a.length-1;i++)
        {
            int pre = a[i];
            int real = a[i+1];
            for(int j = pre+1 ; j<real ; j++)
            {
                cat.add(j,num);
            }
        }
        System.out.println("missing : "+ num);
    }
  private void add(int j , List<Integer>num)
  {
      num.add(j);
  }
}
