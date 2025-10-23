package DSA.String.method.regix;

public class replace_all_space {
    public static void main(String[] args) {
        String a = "during      testing in QA progress";
        System.out.println(a.replaceAll("\\s", ""));
    }
}