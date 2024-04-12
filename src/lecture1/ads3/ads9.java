package lecture1.ads3;

public class ads9 {
    public static void printPermutations(char[] str, int start) {
        if (start == str.length - 1) {
            System.out.println(new String(str));
        } else {

            for (int i = start; i < str.length; i++) {
                swap(str, start, i);
                printPermutations(str, start + 1);
                swap(str, start, i);
            }
        }
    }

    private static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static void main(String[] args) {
        String input = "IOX";
        char[] str = input.toCharArray();
        printPermutations(str, 0);
    }
}



