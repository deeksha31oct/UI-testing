package DSA.array.program;

public class left_rotate
{
    public static void main(String[]args)
    {
        int av []= {2,3,4,5,6,7,8};
        int rotate = av[0];
        for(int i = 0;i<av.length-1;i++)
        {
            av[i]=av[i+1];
        }
        av[av.length-1]=rotate;
        System.out.println("left roration :");
        for(int n:av) System.out.print(" "+n+" ");
    }
}
