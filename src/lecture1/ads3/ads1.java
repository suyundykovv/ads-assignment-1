package lecture1.ads3;

public class ads1 {

    public static int sumOfSquares(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * n + sumOfSquares(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int result = sumOfSquares(n);

        // Print the breakdown of the sum
        System.out.print("1^2");
        for (int i = 2; i <= n; i++) {
            System.out.print(" + " + i + "^2");
        }
        System.out.println(" = " + result);
    }
}

