package DSA.collections.set;

import java.util.HashSet;

public class matching {
    public static void main(String[]args)
    {
        var ht = new HashSet<Integer>();
        ht.add(2);
        ht.add(3);
        ht.add(6);
        ht.add(9);
        for(int i=0;i<=10;i++)
        {
            if(ht.contains(i))
            {
                System.out.println("fount"+i);
            }
            else{
                System.out.println("not found : "+ i);}
        }
    }

}
