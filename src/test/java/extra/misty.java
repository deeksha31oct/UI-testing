package extra;

public class misty {
    public static void main(String[]args) {
        Integer []a = {2,7,9,18};
        for(int i = 0;i<a.length;i++)
        {
            int j = i+1;
            if(j<a.length && a[i]!=a[j])
            {
                for(int k = a[i]+1;k<a[j];k++)
                {
                    System.out.println(k);
                }
            }
        }

    }
}
