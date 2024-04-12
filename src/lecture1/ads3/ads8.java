package lecture1.ads3;

import java.util.Scanner;

    public class ads8 {

        public static void generateSequences(int n, int k, int[] sequence, int index) {
            if (index == n) {

                for (int i = 0; i < n; i++) {
                    System.out.print(sequence[i] + " ");
                }
                System.out.println();
                return;
            }


            for (int i = 1; i <= k; i++) {
                sequence[index] = i;
                generateSequences(n, k, sequence, index + 1);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] sequence = new int[n];
            generateSequences(n, k, sequence, 0);
        }
    }

