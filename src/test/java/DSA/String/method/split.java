package DSA.String.method;

public class split {
    public static void main(String[]args)
    {
        String s = "split ,krna ,he string ko, taki , hum paragraph , ko ache se , pdh , payege";
        String[] sp = s.split(",");
        for(String S  : sp)
        {
        System.out.println(S);
    }
    String split = "dekho , ho , gya , ab aa jayega , testing krna , ache se ";
        String []ss = split.split(",");
        for(String sss : ss)
        {
            System.out.println( sss);
        }
    }
}
