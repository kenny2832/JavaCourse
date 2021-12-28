package OtherTasks.Collection;
import java.util.LinkedList;
public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList link = new LinkedList();

        link.addFirst("abc1");
        link.addFirst("abc2");
        link.addFirst("abc3");

        //System.out.println(link.getFirst());
        //System.out.println(link.getFirst());

        //System.out.println(link.removeFirst());
        //System.out.println(link.removeFirst());

        //System.out.println(link);

        while (!link.isEmpty()){
            System.out.println(link.removeLast());
        }




    }

}
