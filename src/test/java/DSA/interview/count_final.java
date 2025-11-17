package DSA.interview;

public class count_final {

        public static void main(String [] args)
        {
        String a = "count how much  number are repetitive";
        a = a.replaceAll(" ","");
        while(!a.isEmpty())
        {
            char ch = a.charAt(0);
        int nn = a.replaceAll(String.valueOf(ch),"").length();
            System.out.println("count:"+ String.valueOf(ch)+" repead : "+ (a.length()-nn));
            a= a.replaceAll(String.valueOf(a),"");
        }

    }
    }