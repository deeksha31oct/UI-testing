package extra;

public class constant_vowels {
    public static void main(String[]args) {
        String a = "rajkumar kewat";
        int v = 0; int c= 0;
        a=a.toLowerCase();

        for(char cc : a.toCharArray())
        {

        if ("aeiou".indexOf(cc) !=-1)
        v++;
        else if (Character.isLetter(cc))
            c++;
        }
        System.out.println("vowels:"+ v+ "const:"+ c) ;
    }

    }
