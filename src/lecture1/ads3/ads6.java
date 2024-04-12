package lecture1.ads3;

import java.util.Scanner;

    public class ads6 {

        public static void reverseStringSequence(int n) {
            if (n > 0) {
                Scanner scanner = new Scanner(System.in);
                char[] str = scanner.nextLine().toCharArray(); // Read string as char array
                reverseStringSequence(n - 1); // Recursive call for remaining strings
                System.out.println(new String(str)); // Print the current string after recursive calls
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            reverseStringSequence(N);
        }
    }

