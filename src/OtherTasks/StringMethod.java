package OtherTasks;

public class StringMethod {

    public int sumLimit(int a, int b) {
        int sum = a + b;
        int numOfSum = String.valueOf(sum).length();
        int numOfA = String.valueOf(a).length();
        if(numOfSum == numOfA){
            return sum;
        }else{
            return a;
        }
    }

}


