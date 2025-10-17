package DSA.String;

public class missing_array {
    public static  void main(String[]args)
    {
        int a []= {23,34,45,54,55,65};
        for (int i = 0 ; i<a.length;i++)
        {
            int j = i+1;
            if (j<a.length     && a[i]!=a[j])
            {
                for(int k= a[i]+1;k<a[j];k++)
                {
                    System.out.println(k);
                }
            }
        }
    }
}
