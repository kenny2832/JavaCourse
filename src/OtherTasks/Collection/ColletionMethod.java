package OtherTasks.Collection;

import org.w3c.dom.ls.LSOutput;

import java.sql.Array;
import java.util.*;
import java.util.concurrent.Callable;

public class ColletionMethod {

    public static void main(String[] args) {

    //converting array to list
//        Integer[] array = {3, 20, 14, 36, 90, 41};
//        List<Integer> list = new ArrayList<>(Arrays.asList(array));
//        System.out.println(Arrays.toString(array));
//        List<Integer> list = Arrays.asList(array);
//        System.out.println(list);
//        list.add(90);

    //converting list to array
//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(60);
//        list.add(33);
//        list.add(95);
//        list.add(6);
//        System.out.println(list);
//        Integer[] array = list.toArray(new Integer[0]);
//        System.out.println(Arrays.toString(array));

        //convert array into set
//        Integer[] array = {3, 20, 14, 36, 90, 41, 3};
//        Set<Integer> set = new HashSet<>(Arrays.asList(array));
//        System.out.println(set);

        //convert set into array
//        Set<Integer> set = new HashSet<>();
//        set.add(50);
//        set.add(33);
//        set.add(100);
//        set.add(9);
//        set.add(72);
//        System.out.println(set);
//        Integer[] array = set.toArray(new Integer[0]);
//        System.out.println(Arrays.toString(array));


        //converting list into set
//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(60);
//        list.add(33);
//        list.add(95);
//        list.add(6);
//        list.add(10);
//        Set<Integer> set = new HashSet<>(list);
//        System.out.println(set);

        //converting set into list
        Set<Integer> set = new HashSet<>();
        set.add(50);
        set.add(33);
        set.add(100);
        set.add(9);
        set.add(72);
        set.add(100);
        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);

    }

}
