package extra;
import java.util.Scanner;

public class fabnacco_1 {

    public static void fav(int n) {

        int a = 0;
        int b = 1;

        if (n == 1) {
            System.out.println(a);
            return;
        }

        if (n == 2) {
            System.out.println(b);
            return;
        }

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println(b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fav(n);
    }
}