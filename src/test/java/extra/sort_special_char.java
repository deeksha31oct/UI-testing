package extra;

public class sort_special_char {
    public static void main(String[]args)
    {
        String a = "Kashypa#$%123 deeksha!@ auto@#mat1223@#$";
        String sp ="";
        for(int i =0;i<a.length();i++)
        {
            char ch = a.charAt(i);
            if(!Character.isLetterOrDigit(ch))
            {
                sp+= ch;
            }
        }
        System.out.println(sp);
    }
}
