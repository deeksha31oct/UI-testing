package DSA.String;

import java.util.HashMap;
import java.util.Map;

public class count_code {
    public static void main(String[]args)
    {
        {
            String counting = "i can join immidieadtly with 15 days in hyderbad location";
            Map<Character,Integer> mp = new HashMap<>();
            for(char c :counting.toCharArray())
            {
                if(c== ' ')continue;
                mp.put(c,mp.getOrDefault(c,0)+1);
            }
            for(Map.Entry<Character,Integer>ent:mp.entrySet())
            {
                System.out.println(ent.getKey()+":"+ent.getValue());
            }

        }
    }
}
