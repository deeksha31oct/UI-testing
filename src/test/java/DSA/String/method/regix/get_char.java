package DSA.String.method.regix;

public class get_char {
    public static void main(String[]args) {
        String a = "during testing in QA progress";
        char [] b = {'1','2','4','6','8','1','9'};
        System.out.println(b);
        a.getChars(4,15,b,6);
        System.out.println(b);
    }
}
