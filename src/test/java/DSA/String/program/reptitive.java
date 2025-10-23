package DSA.String.program;

public class reptitive {
    public static void main(String[]args)
    {
        String a = "dddkkkkwqwwwrrrrwerqqweeeh";
        while (!a.isEmpty())
        {
            int newLength = a.replaceAll(String.valueOf(a.charAt(0)), "").length();
            System.out.println("Character : " + String.valueOf(a.charAt(0)) +  " size : " + (a.length() - newLength));
                a = a.replaceAll(String.valueOf(a.charAt(0)), "");
        }

        //starting name letter is captial
        String aa = "hello";
        String bb = "java";
        //replace  with first charatwr - capti
        System.out.println(aa.replaceFirst(String.valueOf(aa.charAt(0)), String.valueOf(aa.charAt(0)).toUpperCase()));
    }
}
