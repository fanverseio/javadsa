package RecursionExercises;

public class ReverseNumber {
    public static void main(String[] args) {
        int res = reverseNumRec(12533);
        System.out.println(res);
    }

    public static int reverseNumRec(int n) {
        if (n == 0) {
            return 0;
        }

        if (n < 10) {
            return n;
        }

        return reverseNumRec(n % 10) * base(n) + reverseNumRec(n / 10);

    }

    private static int base(int n) {
        if (n < 10) {
            return 1;
        }
        return 10 * base(n / 10);

    }

}
