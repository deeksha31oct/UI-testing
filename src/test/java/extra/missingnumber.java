package extra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class missingnumber
{
public  static void main (String[]args) {
for(int i =2;i<90;i++)
{
    boolean isprime = true;
    for(int j = 2;j<i/2;j++)
    {
        if(i%j==0)
        {
            isprime = false;
            break;
        }
    }
    if (isprime)
    {
        System.out.print(i+" ");
    }
}
}
}

