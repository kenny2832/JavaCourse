package OtherTasks;

import java.util.Arrays;
import java.util.Random;

public class RandomCharArray {

    public static void main(String[] args) {

         /*
        Create a char array
        The array has a random length between 2 and 22 (inclusive)
        The array should only have random capital letters.
        Print the array.
        Note: There is no test case provided for this assignment in the Tests class. You can test it by yourself.
     */


        Random num = new Random();
        int lengthOfRandom = num.nextInt(21) + 2;
        char[] charArray = new char[lengthOfRandom];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (num.nextInt('Z' - 'A' + 1) + 'A');
        }
        System.out.println(Arrays.toString(charArray));

    }

}
