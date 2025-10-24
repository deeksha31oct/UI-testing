package DSA.interview;

public class reptive_char {
    public static void main(String[]args)
    {
        String ch = "one two three four five and six and seven and eight and nine and ten and eleven";
    while(!ch.isEmpty())
    {
        char carry = ch.charAt(0);
        int value = ch.replaceAll(String.valueOf(carry),"").length();
        if(carry==' ')
        {
            ch = ch.replaceFirst(" ","");
            continue;
        }
        System.out.println("count : "+ String.valueOf(carry)+ " size : "+ (ch.length()-value));
        ch = ch.replaceAll(String.valueOf(carry),"");
    }
    }
}
