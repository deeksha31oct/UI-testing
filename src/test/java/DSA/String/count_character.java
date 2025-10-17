package DSA.String;

import java.util.HashMap;
import java.util.Map;

public class count_character {
    public static void main(String[]args)
    {
        String count ="Hornback electronic mobility";
        Map<Character,Integer> cu = new HashMap<>();
        for(char c :count.toCharArray())
        {
            //skip space in the string
            if (c == ' ')continue;
            cu.put(c,cu.getOrDefault(c,0)+1);
        }
        //print all counting character
        for(Map.Entry<Character,Integer>en:cu.entrySet())
        {
System.out.println(en.getKey()+ ":" + en.getValue());
//System.out.println(count.length());
//System.out.println(count.subSequence(3,8));
        }
    }
}
