package OtherTasks.Collection;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

    public static void main(String[] args) {

        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();

        collectionDemo2(c1,c2);

    }

    public static void collectionDemo2(Collection c1, Collection c2) {

        c1.add("abc1");
        c1.add("bbc2");
        c1.add("abc3");

        c2.add("abc1");
        c2.add("bbc4");
        c2.add("abc5");

        //c1.addAll(c2);
        //c1.removeAll(c2);
        //System.out.println(c1.containsAll(c2));
        c1.retainAll(c2);

        System.out.println("c1 = " + c1);


    }

    public static void collectionDemo(Collection coll) {

        coll.add("itcast1");
        coll.add("itcast2");
        coll.add("itcast3");

        coll.remove("itcast2");
        //coll.clear();
        System.out.println(coll.size());;

        //System.out.println(coll);
    }

}
