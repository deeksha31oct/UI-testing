package extra;

public class max {
    public static void main(String[]args)
    {
        int a []= {1,3,63,77,354,8773,353,4543};
        int min = a[0];
        for(int c : a)
        {
            if (c<min)min=c;
        }
            System.out.println("min:"+min);
        }
    }

