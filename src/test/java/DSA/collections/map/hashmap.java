package DSA.collections.map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class hashmap {
    public static void main(String[]args)
    {
        HashMap<String,String>hs = new HashMap<>();
        hs.put("deeksha","QA engineer");
        hs.put("rajkumar","design engineer");
        hs.put("mansi","Hr ");
        hs.put("nishith","management");
        hs.put("monali","technical writter");
        hs.put("ronak ","busniss");
        hs.put("geetanjalii","housewife");
        hs.put("deeksha","hosuwife");
        System.out.println(hs);
        System.out.println(hs.get("mansi"));
        hs.remove("deeksha");
        System.out.println(hs);
        hs.put("deeksha","automation QA engineer");
        System.out.println(hs);
        hs.put("deeksha","api testing ");
        System.out.println(hs);
        for(String i : hs.keySet())
        {
            System.out.println(i);
        }
        System.out.println(hs);
        for(String i : hs.values())
        {
            System.out.println(i);
        }
    }
}
