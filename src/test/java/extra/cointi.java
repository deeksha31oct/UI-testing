package extra;

public class cointi {
    public static void main(String[]args) {
        String a = "happy birthday one two three four";
        a = a.replaceAll(" ", "");
    System.out.println(a);
    while(!a.isEmpty())
    {
        char c = a.charAt(0);
        int nn = a.replaceAll(String.valueOf(c),"").length();
        System.out.println("counting : "+ String.valueOf(c)+ " repat : "+ (a.length()-nn));
    a = a.replaceAll(String.valueOf(c),"");
    }
    }
}
