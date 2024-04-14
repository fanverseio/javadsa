package RecursionExercises;

public class SimpleRecursion {

    public static void main(String[] args) {
        count(5);
        System.out.println();

        count2(5);
        System.out.println();
        count3(5);
    }

    static void count(int n){
        if (n <= 0){
            return;

        }
        count(n-1);
        System.out.print(n + " ");
    }

    static void count2(int n){
        if (n <= 0){
            return;
        }
        System.out.print(n + " ");
        count2(n-1);
    }

    static void count3(int n){

        if (n <= 0){
            return;
        }
        System.out.print(n + " ");
        count3(n-1);
        System.out.print(n + " ");
    }



}
