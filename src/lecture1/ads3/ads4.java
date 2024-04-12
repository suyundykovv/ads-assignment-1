package lecture1.ads3;

public class ads4 {

    public static int sumOfPowers(int base, int n) {
        if (n == 0) {
            return 1;
        } else {
            return (int) Math.pow(base, n) + sumOfPowers(base, n - 1);
        }
    }

    public static void main(String[] args) {
        int base = 4;
        int n = 3;
        int result = sumOfPowers(base, n);

        // Print the breakdown of the sum
        System.out.print(base + "^0");
        for (int i = 1; i <= n; i++) {
            System.out.print(" + " + base + "^" + i);
        }
        System.out.println(" = " + result);
    }
}
