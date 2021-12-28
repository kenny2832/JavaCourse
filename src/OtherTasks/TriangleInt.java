package OtherTasks;

public class TriangleInt {

    /*
        54321
        5432
        543
        54
        5
     */

    public static void main(String[] args) {

        System.out.println("-------------------------------");
        for(int x=1 ;x<=5 ;x++)
        {
            for(int y=5 ;y>=x ;y-- )
            {
                System.out.print(y);
            }
            System.out.println();
        }

    }
}
