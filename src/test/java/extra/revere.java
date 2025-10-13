package extra;

public class revere
{
    public static void main (String[]args) {
    int [] re = new int []{2,6,45,23,235,1};
    int max = re[0];
    for(int i = 0 ;i<re.length;i++)
    {
        if(re[i]<max)
        {
            max= re[i];
        }
    }
    System.out.println("out: " +max);
    }}