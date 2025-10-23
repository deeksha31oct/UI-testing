package DSA.String.method;

public class compare_to_string {
    public static void main(String[]args)
    {
        String a = "selction ho jayega";
        String b = "bas java pr focus krna he fir to ho jayega";
        System.out.println(a.compareTo(b));
        System.out.println(a.compareToIgnoreCase(b));
        System.out.println(b.compareTo(a));
        System.out.println("a".compareTo("Z"));

        char ch = 'A';
        int unicode = ch;  // implicit conversion from char to int
        System.out.println(unicode);
    }
}
