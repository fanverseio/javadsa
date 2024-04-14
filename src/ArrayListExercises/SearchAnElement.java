package ArrayListExercises;

import java.util.ArrayList;

public class SearchAnElement {

    public boolean searchAnElement(ArrayList<String> arrayList, String element) {
        boolean hasElement = false;

        for (String item : arrayList) {
            if (item.equals(element)) {
                hasElement = true;
            } else {
                hasElement = false;
            }
        }
        return hasElement;
    }

}
