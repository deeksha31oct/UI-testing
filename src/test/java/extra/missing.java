package extra;

public class missing {
    public static void main(String[]args)
    {
        int a[]={2,5,8};
        for(int i = 0;i<a.length-1;i++){

            for(int k = a[i]+1;k<a[i+1];k++)
                {
                    System.out.println(k);
                }
            }
        }
    }

