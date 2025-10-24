package DSA.array.program;

public class sum_array {
    public static void main(String[]args) {
        int[] arr = {2, 3, 5, 33, 64, 76, 35, 787, 35};
    int sum = 0 ;
    for(int s :arr)
    {
        sum += s;
    }
        System.out.println("sum : "+ sum);
    }
}
