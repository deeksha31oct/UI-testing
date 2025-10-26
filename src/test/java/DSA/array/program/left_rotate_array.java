package DSA.array.program;

public class left_rotate_array {
    public static void main(String[]args)
    {
        int arrary []={1,2,3,4,5,6,7,8,9,10};
        int first = arrary[0];
        for(int i = 0;i<arrary.length-1;i++)
        {
            arrary[i]=arrary[i+1];
        }
        arrary[arrary.length-1]=first;
        System.out.println("left roation after first time :");
        for(int nn:arrary)System.out.print(" "+nn+" ");
    }
}
