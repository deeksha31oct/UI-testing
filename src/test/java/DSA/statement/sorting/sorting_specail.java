package DSA.statement.sorting;

public class sorting_specail {public static void main(String[]args) {
    String a = "Kashypa#$%123 deeksha!@ auto@#mat1223@#$";
    String r = "";
    for(int i =0;i<a.length();i++)
    {
        char ch= a.charAt(i);
        if(!Character.isLetterOrDigit(ch))
        {
            r +=ch;
        }
    }
    System.out.println(r);
}

}
