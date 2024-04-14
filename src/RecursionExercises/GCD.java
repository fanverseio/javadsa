package RecursionExercises;

public class GCD {
    public static void main(String[] args) {

        System.out.println(gcd(48,18));
        System.out.println(gcd(60,48));
    }

    public static int gcd(int x, int y){
        if (x<0 || y < 0){
            return -1;
        }
        if (y == 0){
            return x;
        }
        return gcd(y,x%y);
    }
}
