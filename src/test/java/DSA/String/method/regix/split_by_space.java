package DSA.String.method.regix;

public class split_by_space {
    public static void main(String[]args)
    {
        String a = "during testing in QA progress";
        String []b = a.split(" ");
        for(String s : b)
        {
System.out.println(s);
        }

    }
}
