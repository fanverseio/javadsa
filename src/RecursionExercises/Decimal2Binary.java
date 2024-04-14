package RecursionExercises;

public class Decimal2Binary {
    public static void main(String[] args) {
        System.out.println(dec2bin(5));
    }

    public static int dec2bin(int n){
        if ( n == 0)
            return 0;

      return n%2 + 10*dec2bin(n/2);
    }

}
