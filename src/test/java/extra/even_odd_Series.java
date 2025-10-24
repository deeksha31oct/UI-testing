package extra;

public class even_odd_Series {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 8, 79, 335, 654, 323656, 5653, 66779, 323, 454, 667, 7554};
        System.out.println("even :");
        for (int num : a) {

            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n odd :");
        for (int num : a) {
            if(num % 2 != 0) {
                System.out.print(" "+num+" ");

            }
        }
    }
        }


