package july;

public class test_2 {
    public static void main (String []args)
    {
        String e = "motivaationDDEEKSH23667@%^&&**";
        StringBuilder sb = new StringBuilder();
        for(char ch : e.toCharArray())
        {
            if(!Character.isUpperCase(ch))
            {
               sb.append(Character.toLowerCase(ch));
            }
            else
            {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
