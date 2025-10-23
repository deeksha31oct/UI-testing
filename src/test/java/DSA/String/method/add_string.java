package DSA.String.method;

import java.util.Locale;

public class add_string {
    public static void main (String[]args)
    {

        String a = "selction ho jayega";
        String b = "bas java pr focus krna he fir to ho jayega";
       //print to add two string in lowercase
        a = a.trim().toLowerCase();
        b = b.trim().toLowerCase();
    String c= a+ " " + b;
    System.out.println(c);

    //print to add two string with uppdercase
        a = a.trim().toUpperCase();
        b=b.trim().toUpperCase();
        String d = a+ " "+b;

        // print to add two string with one is upperccase and second string is lower case
        a  = a.trim().toUpperCase();
        b= b.trim().toLowerCase();
        String e = a+ " " + b;
        System.out.println(d);
        System.out.println(e);
    }
}
