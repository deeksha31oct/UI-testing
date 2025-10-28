package extra;

public class count {
    public static void main(String[]args)
    {
        String a = "one three four five";
        a = a.replaceAll(" ","");
        System.out.println(a);
    while(!a.isEmpty())
    {
        char cc= a.charAt(0);
        int da = a.replaceAll(String.valueOf(cc),"").length();
        System.out.println("co : "+ String.valueOf(cc)+" repate : "+ (a.length()-da));
       a = a.replaceAll(String.valueOf(cc),"");
    }
    }
}
