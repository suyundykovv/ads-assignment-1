package lecture1.ads2;

public class ads1 {

    public static int sumOfSquares(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * n + sumOfSquares(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int result = sumOfSquares(number);
        System.out.println("Sum of squares of first " + number + " integers: " + result);
    }
}

