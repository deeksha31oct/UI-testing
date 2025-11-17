package DSA.collections.pratice;

public class vowel {
    public static void main(String[]args)
    {
        String a = "letter check is it showing correct or not";
        int vo = 0;int cons =0;
        a = a.toLowerCase();
        for(char ch : a.toCharArray())
        {
            if("aeiou".indexOf(ch)!=-1)

            vo++;

        else if (Character.isLetter(ch))

                cons++;


        }
        System.out.println("vowel "+ vo + "\n oon "+cons);
    }
}
