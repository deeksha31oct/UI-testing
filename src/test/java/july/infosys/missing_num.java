package july.infosys;

public class missing_num
{
    public static void main(String[]args) {
        Integer []a = {3,6,10};
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=a[i]+1;j<a[i+1];j++)
            {
                System.out.println(" count "+j + " ");
            }
        }
    }
}
