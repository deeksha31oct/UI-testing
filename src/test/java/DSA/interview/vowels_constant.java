package DSA.interview;

public class vowels_constant {
    public static void main(String[]args)
    {
        String a = "letter check is it showing correct or not";
        int ve = 0; int cv = 0;

        a = a.toLowerCase();

        for(char cha : a.toCharArray())
        {
            if("aeiou".indexOf(cha) != -1)
                ve++;
            else if (Character.isLetter(cha))
                cv++;
        }
        System.out.println("vowels : "+ve + "\n comst : "+ cv);
    }
}
