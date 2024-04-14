package RecursionExercises;

public class SumOfNumbers {
    public static void main(String[] args) {

        int res = sumOfNumbers(55);
        System.out.println(res);
    }

    public static int sumOfNumbers(int n){
        if ( n == 0){
            return 0;
        }

        if(n<10){
            //System.out.println(n);
            return n;
        }
//        int p = sumOfNumbers(n/10);
//        int m = sumOfNumbers(n%10);
//        System.out.println(p + " | " + m);
        return sumOfNumbers(n/10) +  sumOfNumbers(n%10);
    }

}
