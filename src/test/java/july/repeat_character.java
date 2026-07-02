package july;

public class repeat_character {
    public static void main(String[] args) {
        String word = "deeksha";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (word.indexOf(c) != word.lastIndexOf(c)) {   // c repeats somewhere
                int j = i + 1;
                while (j < word.length() && word.charAt(j) == c) {
                    j++;                                    // skip the whole run of c
                }
                System.out.println(j < word.length()
                        ? "Answer: " + word.charAt(j)
                        : "Nothing after it");
                break;
            }
        }
    }
}