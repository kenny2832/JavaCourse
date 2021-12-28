package OtherTasks;

public class InvertedTriangle {

    public static void main(String[] args) {

        System.out.println("-----------------------------");
        for(int x=5;x>=1;x--)
        {
            for(int y=1;y<=x;y++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
