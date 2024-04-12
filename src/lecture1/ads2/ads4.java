package lecture1.ads2;

public class ads4 {

    public static int findMax(int[] arr, int low, int high) {
        if (low == high) {
            return arr[low];
        } else {
            int mid = (low + high) / 2;
            int leftMax = findMax(arr, low, mid);
            int rightMax = findMax(arr, mid + 1, high);
            return Math.max(leftMax, rightMax);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {4, 1, 7, 3, 9, 2};
        int max = findMax(numbers, 0, numbers.length - 1);
        System.out.println("Maximum element: " + max);
    }
}

