package lecture2.ads2;

import java.util.HashSet;
import java.util.Set;

    public class ads1 {

        public static void findUniquePairs(int[] arr, int targetSum) {
            Set<Integer> seen = new HashSet<>();
            Set<Pair> pairs = new HashSet<>();

            for (int num : arr) {
                int complement = targetSum - num;
                if (seen.contains(complement)) {
                    Pair pair = new Pair(num, complement);
                    pairs.add(pair); // Add pair only if not already present
                } else {
                    seen.add(num);
                }
            }

            // Print the unique pairs
            for (Pair pair : pairs) {
                System.out.println(pair.num1 + " + " + pair.num2 + " = " + targetSum);
            }
        }

        // Helper class to represent a pair of numbers (for easier set operations)
        static class Pair {
            int num1;
            int num2;

            Pair(int num1, int num2) {
                this.num1 = num1;
                this.num2 = num2;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Pair pair = (Pair) o;
                // Order of numbers in the pair doesn't matter
                return (num1 == pair.num1 && num2 == pair.num2) || (num1 == pair.num2 && num2 == pair.num1);
            }

            @Override
            public int hashCode() {
                return num1 + num2; // Simple hash code based on sum of numbers
            }
        }

        public static void main(String[] args) {
            int[] arr = {2, 7, 11, 15, 5, 3, 9};
            int targetSum = 10;
            findUniquePairs(arr, targetSum);
        }
    }

