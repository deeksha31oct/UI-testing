
package DSA.collections.pratice;

public class prime_table {
    public static void main(String[] args) {
        int limit = 33;

        for (int num = 2; num <= limit; num++) {   // loop through 2 to 33
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}