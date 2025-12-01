package DSA.collections.pratice;

public class prime {
    public static void main(String[] args) {
        int num = 33;
        boolean isPrime = true ;

        for (int op = 2; op <= Math.sqrt(num); op++) {
          if(num%op ==0 )
          {isPrime = false;
          break ;
          }
            System.out.println(isPrime);
        }
    }
}
