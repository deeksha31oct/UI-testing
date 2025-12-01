package DSA.interview;

public class vowels_constant {
    public static void main(String[]args) {
        String a = "letter check is it showing correct or not";
    int vo = 0;int co =0;
    for(char ct:a.toCharArray())
    {
        if("aeiou".indexOf(ct)!=-1)
            vo++;
        else if(Character.isLetter(ct))
            co++;
    }
        System.out.println("vowel : "+vo +"\n"+"constan :"+co);
    }
}
