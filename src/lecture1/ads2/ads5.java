package lecture1.ads2;

public class ads5  {

    public static int sumOfFirstN(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumOfFirstN(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int result = sumOfFirstN(number);
        System.out.println("Sum of first " + number + " positive integers: " + result);
    }
}

