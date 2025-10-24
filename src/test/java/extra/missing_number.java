package extra;

public class missing_number {
    public static  void main(String[]args)
    {
        int a[] = {2,4,9,14,16,19};
        for(int i = 0;i<a.length;i++)
        {
            int k = i+1;
            if(k<a.length && a[i]!=a[k])
            {
                for(int j = a[i]+1;j<a[k];j++)
                {
System.out.println(j);
                }
            }
        }
    }

}
