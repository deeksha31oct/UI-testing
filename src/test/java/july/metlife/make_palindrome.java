package july.metlife;

import java.util.*;

public class make_palindrome {
    public static void main(String[] args) {
        String s = "deeksha";

        // Step 1: Reverse
        String rev = new StringBuilder(s).reverse().toString();

        // Step 2: Check
        if (s.equals(rev)) {
            System.out.println("Already palindrome: " + s);
        } else {
            // Step 3: Make it — add reverse at end
            String made = s + rev.substring(1);
            System.out.println("Not palindrome. Made: " + made);
        }
    }
}