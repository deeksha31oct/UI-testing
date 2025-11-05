package DSA.collections.set.Hasgset;

import java.util.HashSet;

public class hasgset {
    public static void main(String[]args) {

        HashSet<String>hs = new HashSet<>();
        hs.add("deeeku");
        hs.add("peeku");
        hs.add("teeku");
        hs.add("meeku");
        hs.add("deeeku");
        hs.add("peeku");
        hs.add("teeku");
        hs.add("meeku");
hs.add("cheeku");
        System.out.println(hs.contains("deeeku"));
        hs.remove("meeku");
        System.out.println(hs.size());


}}