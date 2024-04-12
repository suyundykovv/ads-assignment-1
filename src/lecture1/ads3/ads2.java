package lecture1.ads3;

public class ads2 {

    public static int sumOfArrayElements(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } else {
            return arr[n - 1] + sumOfArrayElements(arr, n - 1);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int n = 5; // Sum the first 5 elements
        int result = sumOfArrayElements(numbers, n);
        System.out.println("Sum of first " + n + " elements: " + result);
    }
}

