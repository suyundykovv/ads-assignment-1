package lecture1.ads3;

import java.util.Scanner;

    public class ads5 {

        public static void reverseSequence(int n) {
            if (n > 0) {
                Scanner scanner = new Scanner(System.in);
                int num = scanner.nextInt();
                reverseSequence(n - 1);
                System.out.print(num + " ");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            reverseSequence(N);
        }
    }

