package DSA.collections.List.LinkedList;

import java.util.LinkedList;

public class linked_list {
    public static void main(String[]args)
    {
        LinkedList<Integer>lk = new LinkedList<>();
        lk.add(1);
    lk.add(2);
        lk.add(3);
        lk.add(4);
        lk.add(5);
        lk.add(6);
        lk.addFirst(100);
        lk.addLast(100);
        System.out.println(lk);
        lk.removeLast();
        System.out.println(lk);

    }
}
