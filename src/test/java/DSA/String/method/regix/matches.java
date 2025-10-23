package DSA.String.method.regix;

public class matches {
    public static void main(String[]args)
    {
        String regex = "deeksha kar legi .kesi bi. deeksha ne kha tha ho jayega .";
        System.out.println("deeksha".matches(regex));
        System.out.println(regex.matches("rajkumar"));
    }
}
