package DSA.array.program;

public class count_ev_od {
    public static void main(String[]args)
    {
        int a[]= {11,121,31,41,5,122,1331,44,23,24,25};
        int even =0,odd=0;
        for(int ctt:a)
        {
        if(ctt%2==0)
            even++;
        else
            odd++;
        }
        System.out.print("even:"+ even+"\n"+"odd "+odd);
    }
}
