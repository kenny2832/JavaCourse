package OtherTasks;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] intArray1 = {1,5,9,10,30,45,88,100};
        int[] intArray2 = {5,30,11};


        boolean isContained = true;
        for (int i : intArray2) {
            int index = Arrays.binarySearch(intArray1,i);
            if (index < 0){
                isContained = false;
                break;
            }
        }
        System.out.println("intArray2 is contained in intArray1: " + isContained);
    }

}
