package Arrays;

public class SearchInArray {

    public int searchInArray(int[] intArray, int valueToSerch){
        int res = 0;
        for (int i = 0; i < intArray.length;i++){
            if (intArray[i] == valueToSerch){
                res =  i;
            } else {
                res  = -1;
            }
        }

        return res;
    }

}
