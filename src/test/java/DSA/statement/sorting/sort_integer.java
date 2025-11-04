package DSA.statement.sorting;

public class sort_integer {
    public static void main(String[]args) {
        String a = "Kashypa#$%123 deeksha!@ auto@#mat1223@#$";
        String r = "";
    for(int i =0;i<a.length();i++)
    {
        char c= a.charAt(i);
        if(Character.isDigit(c))
        {
            r +=c;
        }
    }
        System.out.println(r);
    }

}
