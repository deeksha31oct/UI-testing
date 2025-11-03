package DSA.collections.List.ArrayList;

import java.util.ArrayList;

public class Fab_series_with_arrayList
{
    public static void main (String[]args)
    {
        int a = 10;
        ArrayList <Integer>w = new ArrayList<>();
        w.add(0);
        w.add(1);
        for(int i = 2;i<a;i++)
        {
int next = w.get(i-1)+w.get(i-2);
w.add(next);
        }
        System.out.println(w);
    }

}
