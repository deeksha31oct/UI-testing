package july.extra_july;

public class even_odd {
    public static void main (String[]args)
    {
        Integer []a= {2,1,5,3,7,4,8,5,1,12,14,15,18,10,22,34,65,66,78,77};
        for(int i =0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                System.out.print(" even : "+ i);
            }else{System.out.print(" \n odd : "+ i);}
        }
    }
}
