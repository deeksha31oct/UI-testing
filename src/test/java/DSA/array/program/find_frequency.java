package DSA.array.program;

public class find_frequency
{
    public static void main(String[]args) {
        int array[] = {2, 3, 4, 2, 3, 4, 2, 3, 4, 2, 3, 4,4,4,4};
        boolean[] vis = new boolean[array.length];
    for(int i = 0;i< array.length;i++)
    {
        if(vis[i])continue;
        int count = 1;
        for(int j=1;j< array.length;j++)
        {
            if(array[i]==array[j])
            {
                vis[j]=true;
                count++;
            }
        }
        System.out.print(array[i]+" repated : "+ count+" times "+",");
    }

    }
}
