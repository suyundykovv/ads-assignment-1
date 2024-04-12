package lecture1.ads2;

public class ads2 {

    public static int sumOfPowers(int base, int n) {
        if (n == 0) {
            return 1; // Base case: b^0 = 1
        } else {
            return (int) Math.pow(base, n) + sumOfPowers(base, n - 1); // Recursive case: b^n + sum of powers up to (n-1)
        }
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 4;
        int result = sumOfPowers(base, exponent);
        System.out.println("Sum of powers of " + base + " up to exponent " + exponent + ": " + result);
    }
}

