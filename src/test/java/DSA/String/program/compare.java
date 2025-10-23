package DSA.String.program;

public class compare {
    public static void main(String[]args) {
        String a = "why not";
   String b = "Why Not";
   String c = " ho jayega ";
   String d = "hey , how are you , khana khakr jana , ok ";
   System.out.println(a.compareToIgnoreCase(b));
   System.out.println(a.compareTo(b));
   System.out.println(a.concat( c));
   System.out.println(a.length());
   System.out.println(a.substring(2,6));
   System.out.println(a.split(a));
   String []e = d.split(",");
   for(String f :e) {
       System.out.println(f);
   }
   System.out.println(a.replace("not","yes"));
    }
}
