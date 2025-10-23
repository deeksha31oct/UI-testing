package DSA.String.method.regix;

public class split_comma {
    public static void main(String[]args)
    {
        String a = "during,testing,in,QA progress,deeksha,rajkumar kewat";
        String[]b = a.split("[,]+");
        for(String c :b)
        {
            System.out.println(c);
        }
    }
}
