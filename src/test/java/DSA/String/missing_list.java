package DSA.String;

public class missing_list {
    public static void main(String[]args)
    {
        int ms [] = {10,20,30,40};
        for(int i = 0;i<ms.length;i++)
        {
            int j = i+1;
            if(j<ms.length && ms[i]!=ms[j])
            {
                for(int k =ms[i]+1;k<ms[j];k++)
            {
                System.out.println(k);
            }
        }
    }
}}
