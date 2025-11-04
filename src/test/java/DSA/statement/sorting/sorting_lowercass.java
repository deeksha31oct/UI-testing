package DSA.statement.sorting;

public class sorting_lowercass {
    public static void main(String[]args) {
        String a = "KADDGashypa#$%123 deeksha!@ auto@#mat1223@#$";
        String r = "";
        for(int i = 0;i<a.length();i++)
        {
            char ch = a.charAt(i);
            if(Character.isLowerCase(ch))
            {
                r+= ch;
            }
        }
        System.out.println(r);
    }
}
