package DSA.String.method;

public class contain_start_end {
    public static void main(String[]args)
    {
        String a = "selction ho jayega";
        String b = "bas java pr focus krna he fir to ho jayega";
        System.out.println(a.contains("ho"));
        System.out.println(b.contains("pr"));
        //start with character
        System.out.println(b.startsWith("bas"));
        System.out.println(a.contains("se"));

        //end with charater
        System.out.println(a.endsWith("ga"));
        System.out.println(b.endsWith("jayega"));
    }
}
