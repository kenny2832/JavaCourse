package OtherTasks;

public class armstrongNumber {

    public static void main(String[] args) {

        int sum = 0;
        int digit;
        int temp;
        int number = 408;
        temp = number;
        while(temp >0){
            digit = temp %10;
            sum = sum + (digit*digit*digit);
            temp = temp /10;
        }
        if(number==sum)
            System.out.println(number + " is an armstrong number");
        else
            System.out.println(number + " is not an armstrong number");

    }

}
