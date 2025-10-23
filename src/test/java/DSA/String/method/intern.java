package DSA.String.method;

public class intern {
    public static void main(String[]args) {
        String a = new String("during testing in QA progress");
        String b = "during testing in QA progress";
        System.out.println(a==b);

        String c = a.intern();
        System.out.println(b==c);
    }
}
