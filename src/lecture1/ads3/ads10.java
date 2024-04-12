package lecture1.ads3;

public class ads10  {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        ads10 checker = new ads10();
        int[] testCases = {1, 2, 4, 8, 16, 31, 64};

        for (int num : testCases) {
            boolean result = checker.isPowerOfTwo(num);
            System.out.println(num + ": " + result);
        }
    }
}