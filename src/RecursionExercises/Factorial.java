package RecursionExercises;

public class Factorial {

    public static void main(String[] args) {
        Factorial cal = new Factorial();
        int res = cal.factorial(3);
        System.out.println(res);

    }

    public int factorial(int n ){
        if (n == 1 || n == 0){
            return 1;
        }
        return n * factorial(n -1);
    }

}
