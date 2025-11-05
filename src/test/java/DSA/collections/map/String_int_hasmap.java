package DSA.collections.map;

import java.util.HashMap;

public class String_int_hasmap {
    public static void main(String[]args)
    {
        var hi = new HashMap<String,Integer>();
        hi.put("deeksha",30);
        hi.put("raju",32);
        hi.put("mansi",32);
hi.put("nisi",33);
hi.put("monali",27);
for(String i :hi.keySet())
{
    System.out.println("keys : "+i +" "+  hi.get(i));
}
    }
}
