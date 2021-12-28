package OtherTasks;

public class MethodVarargs {

    public static void main(String[] args) {

        int sum = sum(1, 2, 3, 4);
        System.out.println(sum);
    }

    public static int sum(int... varargs) { // A variable argument is represented by (...) three dots
//        int[] varargs = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < varargs.length; i++)
            sum += varargs[i];

        return sum;
    }
}