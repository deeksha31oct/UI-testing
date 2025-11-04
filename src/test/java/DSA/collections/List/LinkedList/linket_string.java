package DSA.collections.List.LinkedList;

import java.util.LinkedList;

public class linket_string {
    public static void main (String[]args)
    {
        var lk= new LinkedList<String>();
        lk.add("ram");
        lk.add("shyam");
        lk.add("sita");
        lk.add("geeta");
        lk.add("reeta");
        lk.add("fita");
        System.out.println(lk);
        lk.removeFirst();
        System.out.println(lk);
        lk.addLast("long");
        lk.addFirst("fisrting");
        System.out.println(lk);

    }
}
