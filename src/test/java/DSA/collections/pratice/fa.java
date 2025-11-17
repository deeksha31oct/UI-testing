package DSA.collections.pratice;

public class fa {
    public static void main(String[]args){
    String s = "rajkumar raj kumar deeksha deeksha ";
        s = s.replaceAll(" ", "");
    while(!s.isEmpty())
    {
        char c = s.charAt(0);
        int var = s.replaceAll(String.valueOf(c),"").length();
        System.out.println("count "+String.valueOf(c)+ " time "+ (s.length()-var));
       s=  s.replaceAll(String.valueOf(c),"");
    }
}
}
