package OtherTasks.StringBuffer;

import java.util.*;

public class StringBufferDemo {

    public static void main(String[] args) {

        int[] arr = {34, 12, 89, 68};
        System.out.println(toString(arr));
        StringBuilder str = new StringBuilder("fangyongliang");
        String a = str.reverse().toString();
        System.out.println(a);







    }

    public static String toString(int[] arr){
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < arr.length ; i++) {
            if(i==arr.length-1){
                sb.append(arr[i] + "]");
            }else{
                sb.append(arr[i] + ",");
            }
        }
        return sb.toString();
    }

}
