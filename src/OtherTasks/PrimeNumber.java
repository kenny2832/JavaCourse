package OtherTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrimeNumber {

//    public static void main(String[] args) {
//
//        //System.out.println(primeNumber(0));
//
//    }

    public static void main(String[] args){
        String input = "Geeks For Geeks";
        List<Character> arrList = new ArrayList<>();
        for (char c: input.toCharArray()){
            arrList.add(c);
        }
        Collections.reverse(arrList);
        Object[] arr2 = arrList.toArray();
        System.out.println(Arrays.toString(arr2));
        String reverse = "";
        for(int i = 0; i <arr2.length; i++) {
            reverse += arr2[i];
        }
        System.out.println(reverse);
    }

    public static boolean primeNumber(int num){
        if (num < 2)
            return false;
        for (int i = 2; i < num; i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }

}
