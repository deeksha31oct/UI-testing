package DSA.collections.List.ArrayList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class String_array
{
public static void main(String[]args)
{
    String a = "happy birthday";
    //string to integer)
//    String b = Stream.of(a.toCharArray()).map(s -> String.valueOf(s)).sorted(Comparator.reverseOrder()).collect(Collectors.joining(""));
    String b = a.chars().mapToObj(s -> (char) s).sorted(Comparator.reverseOrder()).map(String::valueOf).collect(Collectors.joining());
    System.out.println(b);
}
}
