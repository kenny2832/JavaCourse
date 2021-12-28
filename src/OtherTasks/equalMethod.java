package OtherTasks;

public class equalMethod {

    public static void main(String[] args) {

        String str = "123 456";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                System.out.println("true");
            else
                System.out.println("false");
        }

    }

}
