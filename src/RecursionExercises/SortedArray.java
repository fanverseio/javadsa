package RecursionExercises;
import java.util.Arrays;


public class SortedArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 6 };
        int[] arr1 = { 1, 2, 5, 4, 6 };
        System.out.println("Method 1: "+sortedArrayRecursive(arr, 0));
        System.out.println("Method 2: "+sortedArrayRecursive(arr1, 0));
        System.out.println("Method 3: "+sortedArrayRecursive2(arr1, 0));
        System.out.println("Method 4: "+sortedArrayRecursive3(arr1));
        System.out.println("Method 5: "+sortedArrayRecursive4(arr1));
        System.out.println("Method 5: "+sortedArrayRecursive4(arr));

    }

    static boolean sortedArrayRecursive(int[] num, int i) {
        if (num.length == 1) {
            return true;
        }

        if (i == num.length - 1) {
            return true;
        }

        return num[i] < num[i + 1] && sortedArrayRecursive(num, i + 1);

    }

    static boolean sortedArrayRecursive2(int[] num, int i) {
        if (num.length == 1) {
            return true;
        }

        if (i == num.length - 1) {
            return true;
        }

        if (num[i] > num[i + 1]) {
            return false;
        }

        return sortedArrayRecursive(num, i + 1);
    }

    static boolean sortedArrayRecursive3(int[] num) {
        if (num.length <= 1) {
            return true;
        }

        if (num[0] > num[1]) {
            return false;
        }

        return sortedArrayRecursive3(Arrays.copyOfRange(num, 1, num.length));
    }


    static boolean sortedArrayRecursive4(int[] num){
        return sortedMethod(num,0);
    }

    private static boolean sortedMethod(int[] num, int i) {
        if (i == num.length-1 || num.length<=1){
            return true;
        }
        if (num[i]>num[i+1]){
            return false;
        }
        return sortedMethod(num,i+1);
    }


    static boolean sortedArrayIterative(int[] num) {

        for (int i = 1; i < num.length; i++) {
            if ((num[i] - num[i - 1]) <= 0) {
                return false;
            }
        }
        return true;

    }
}
