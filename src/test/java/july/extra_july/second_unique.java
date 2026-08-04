package july;

public class second_unique {
    public static void main(String[] args) {
        String st = "deeksha";
        int count = 0;
        char result = ' ';

        for (char c : st.toCharArray()) {
            if (st.indexOf(c) == st.lastIndexOf(c)) {   // appears only once
                count++;
                if (count == 2) {                        // second unique one
                    result = c;
                    break;
                }
            }
        }

        System.out.println("Second unique character: " + result);

    }
}
