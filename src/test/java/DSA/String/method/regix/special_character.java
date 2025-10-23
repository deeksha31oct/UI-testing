package DSA.String.method.regix;

public class special_character {
    public static void main(String[]args) {
        String a = "@#$%^during,testing,@#$%^ $%^in,QA@#$%^& progress,deeksha,rajkumar #$%^&kewat";
        System.out.println(a.replaceAll("\\s+",""));
        System.out.println(a.replaceAll("\\,",""));
        System.out.println(a.replaceAll("[^a-zA-Z0-9]",""));
        System.out.println(a.replaceAll("a-z","A-Z"));
        a = a.replaceAll("\\s+","").replaceAll("\\,","").replaceAll("[^a-zA-Z0-9]","");

        System.out.println(a);



    }
}
