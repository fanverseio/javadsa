package RecursionExercises;

public class NumberOfSteps {

    public static void main(String[] args) {
        System.out.println(numberOfSteps(238));
    }

    static int numberOfSteps(int num){
       return func(num,0);
    }

    private static int func(int num, int steps) {
        if (num == 0){
            return steps;
        }

        if (num %2 == 0){
            return (func(num/2,steps+1));
        }
        return func(num-1,steps+1);
    }

}
