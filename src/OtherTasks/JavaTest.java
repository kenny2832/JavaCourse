package OtherTasks;

import java.util.Arrays;

public class JavaTest {

    public static void main(String[] args) {

        String str = "Freedom Mortgage";
        //String str1 = "elements is stable But in case of unordered streams";

        System.out.println(stringModifies(str));
        //System.out.println(stringModifies(str1));

    }

    public static String stringModifies(String str) {

        String[] strArray = str.split("[^a-zA-Z]");
        String newStr = "";
        String midStr = "";
        int count;
        for (int i = 0; i < strArray.length; i++) {
            midStr = strArray[i].substring(1,strArray[i].length() - 1);
            count = countsOfUniqueChar(midStr);
            newStr += "" + strArray[i].charAt(0) + count + strArray[i].charAt(strArray[i].length() - 1)
                    + nonAlphabetic(str).charAt(i);
        }
        return newStr;

    }

    public static int countsOfUniqueChar(String str) {

        String newStr;
        if (str.isEmpty()){
            newStr = "";
        }else{
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            newStr = "" + charArray[0];
            for (int i = 1; i < charArray.length; i++) {
                if (charArray[i] != charArray[i - 1]){
                    newStr += charArray[i];
                }

            }

        }return newStr.length();

    }

    public static String nonAlphabetic(String str) {

        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))){
                newStr += str.charAt(i);
            }
        }
        newStr += ' ';

        return newStr;
    }
}
