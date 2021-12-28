package OtherTasks;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {

        String text = "1 15 7 64 41 8 10 91 2";

        System.out.println(text);
        String[] textArray = text.split(" ");

        int[] intArray = new int[textArray.length];
        for (int i = 0; i < textArray.length; i++) {
            intArray[i] = Integer.parseInt(textArray[i]);
        }

        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length ; j++) {
                if (intArray[i] > intArray[j]){
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                 }
            }
        }
        System.out.println(Arrays.toString(intArray).replace("[","").replace("]","").
                replace(",",""));


        String original = "1345268749";
        char[] chars = original.toCharArray();
        System.out.println(Arrays.toString(chars));
        for (int i = 0; i < chars.length ; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] > chars[j]){
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        String sorted = new String(chars);
        System.out.println(sorted);

        for (int i = 0; i < chars.length - 1 ; i++) {
            for (int j = 0; j < chars.length -1 -i ; j++) {
                if (chars[j] > chars[j+1]){
                    char temp = chars[j];
                    chars[j] = chars[j+1];
                    chars[j+1] = temp;
                }
            }

        }
        //String sorted = new String(chars);
        System.out.println(sorted);

        }
    }





