package RecursionExercises;

public class Power {

    public static void main(String[] args) {

        System.out.println(power(3,2));
        System.out.println(power(4,4));



    }
   public static int power(int x,int n){
        if (x == 0){
            return -1;
        }
        if (n == 0){
            return 1;
        }
        return x*power(x,n-1);

    }
}
