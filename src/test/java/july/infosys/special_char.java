package july.infosys;

public class special_char {
    public static void main(String[]args) {
        String ss = "figoidfj#$&%^%3423949023fjd";
        for(char cc : ss.toCharArray())
        {
            if(Character.isLetter(cc))
            {
                System.out.print(cc);
                //syso(ts.lower(ts.last()))
            }
        }
    }
}
