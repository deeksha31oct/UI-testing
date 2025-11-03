package DSA.collections.List.ArrayList;

import java.util.ArrayList;

public class add_arraylist {
    public static void main (String[]args)
    {
        ArrayList<String> al = new ArrayList<>();
        al.add("deeku");
        al.add("raju");
        al.add("kALU");
        al.add("bhalu");
        al.add("chalu");
        al.add("nalu");
        System.out.println(al);
        al.set(2,"nalu");
        al.set(4,"null");
        System.out.println(al);
        al.set(0,"deeksha");
        al.set(4,"bholu ko dekho");
        System.out.println(al);
        al.get(4);
        al.get(3);
        System.out.println(al);
        al.size();
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        al.size();
        System.out.println(al);


    }
}
