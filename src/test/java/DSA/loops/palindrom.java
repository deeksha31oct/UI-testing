package DSA.loops;

public class palindrom
{
    public static void main(String[]args) {
        String ss = "deeksha";
        String re = "";
        for (int i = ss.length() - 1; i >= 0; i--) {
            re = re + ss.charAt(i);
        }
        if (ss.equals(re))
        {
            System.out.println("yes");}
        else{
            System.out.println("not");}
    }
}
