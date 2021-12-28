package OtherTasks;

public class MultiplicationTable {

    /*
        1*1=1
        1*2=2   2*2=4
        1*3=3   2*3=6   3*3=3
        1*4=4   2*4=8   3*4=12  4*4=16
        1*5=5   2*5=10  3*5=15  4*5=20  5*5=25

     */

    public static void main(String[] args) {

        System.out.println("------------------------");
        for(int x=1;x<=9;x++)
        {
            for(int y=1;y<=x;y++)
            {
                System.out.print(y+"*"+x+"="+y*x+"\t");
            }
            System.out.println();
        }
    }
}
