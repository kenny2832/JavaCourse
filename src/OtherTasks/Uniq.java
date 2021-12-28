package OtherTasks;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Uniq {

    public static void main(String[] args) {

        String str = "adadcecfg";  //adffsss
        char[] charArray = str.toCharArray();

        Arrays.sort(charArray);
        String newStr = "" + charArray[0];
        for (int i =1; i < str.length(); i++) {
            if (charArray[i] != charArray[i - 1]){
                newStr += charArray[i];
        }
        }
        System.out.println(newStr);


    }
}
