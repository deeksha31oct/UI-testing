package DSA.String;

import java.util.HashMap;
import java.util.Map;

public class counting {
public static void main(String[]args)
{
    String count = "count character and automation testing is very important";
    Map<Character,Integer>CI = new HashMap<>();
    for(char c : count.toCharArray())
    {
       //skip space
       if(c== ' ')continue;
        CI.put(c , CI.getOrDefault(c,0)+1);
    }
    for(Map.Entry<Character,Integer>ent : CI.entrySet())
    {
        System.out.println(ent.getKey()+":"+ent.getValue());
    }
}
}
