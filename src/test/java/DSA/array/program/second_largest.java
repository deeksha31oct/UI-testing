package DSA.array.program;

public class second_largest {
    public static void main(String[]args)
    {
        int a[]= {2,3,4,5,6,7,8,9,11};
        int second = Integer.MIN_VALUE;
        int FIRST = Integer.MIN_VALUE;
        for(int c :a)
        {
            if(c>FIRST)
            {
                second=FIRST;
                FIRST=c;
            } else if (c>second && c!=FIRST) {
second=c;
            }
        }
        System.out.println("sec larger :"+second);

    }}
