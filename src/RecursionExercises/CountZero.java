package RecursionExercises;

public class CountZero {

    public static void main(String[] args) {
        System.out.println(countZero(20406000));
    }

    static int countZero(int x) {
        if (x == 0) {
            return 0;
        } else {
            return ((x % 10 == 0) ? 1 : 0) + countZero(x / 10);
        }
    }

}
