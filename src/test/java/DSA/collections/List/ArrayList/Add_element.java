package DSA.collections.List.ArrayList;

import java.util.ArrayList;

public class Add_element {
    public static void main(String[]args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(5);
        num.add(6);
        System.out.println(num);
       System.out.println(num.get(0));
       num.set(2,300);
       System.out.println(num);

        System.out.println(num.size());
num.remove(3);
System.out.println(num);
    }
}
