package Arrays;

public class MiddleArray {

    public static int[] middle(int[] array){

        if (array.length<2){
            return new int[0];
        }


      int start = 1;
      int end = array.length-1;
      int [] middleArray = new int[array.length-2];
      for (int i = start;i<end;i++){
          middleArray[i-1] = array[i];
      }
        return middleArray;
    }
}
