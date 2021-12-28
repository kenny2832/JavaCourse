package OtherTasks;

import java.util.Scanner;

public class PrintChartInString {

    public static void main(String[] args) {
        //part 1, one method
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter input: "); // remind user input data
        String  inpputUser = scanner.nextLine();   // inpputUser store date from user input

        for (int i = 0; i < inpputUser.length(); i++) {
            System.out.println(inpputUser.charAt(i));  //what is the data type of output data?
                                                      //what is the data type of output data?
        }                                              // when we use this method ,what data type will be return,
                                                            //the output data is char data type


        //-----------------------------------------------------------/ pres enter this time

        //part2 ,another method
//        String hello = "HEY";
//        System.out.println(hello.charAt(0));
//        System.out.println(hello.charAt(1));
//        System.out.println(hello.charAt(2));








    }

}
