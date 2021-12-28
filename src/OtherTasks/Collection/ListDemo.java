package OtherTasks.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List list = new ArrayList();

        list.add(new Student("wangcai1",21));
        list.add(new Student("wangcai2",22));
        list.add(new Student("wangcai3",23));

        System.out.println(list);

//        list.add(1, new Student("wangwu",38));
//        list.set(1, new Student("xiaoming", 42));
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(((Student)list.get(i)).name + " " + ((Student)list.get(i)).age);
//        }

//        for (Iterator it = list.iterator();it.hasNext();) {
//            Object object = it.next();
//            Student stu = (Student) object;
//            System.out.println(stu.name + " " + stu.age);

//        }




    }

}
