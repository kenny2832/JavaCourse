package OtherTasks.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {


        Collection coll = new ArrayList();
        coll.add("abc1");
        coll.add("abc2");
        coll.add("ab");
        coll.add("abc");

        System.out.println(coll);

//        for(Iterator it = coll.iterator();it.hasNext();){
//            //System.out.println(it.next().toString().length());
//            Object object = it.next();
//            String str = (String)object;
//            System.out.println(str);
 //       }


    }
}
