package DSA.String.method.regix;

public class format {
    public static void main(String[]args) {
        String a = "during  %s! testing in @#$% progress";
        String rs = String.format(a,"QA","1222");
        System.out.println(rs);
    }
}
