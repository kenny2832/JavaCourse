package OtherTasks;

public class Reverse {

    public static void main(String[] args) {

        String text = "How do you print an equilateral triangle?";
        System.out.println(text);
        StringBuilder str = new StringBuilder(text);
        String strReverse = str.reverse().toString();
        System.out.println(strReverse);
        String reverseText = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            reverseText = ch + reverseText;
        }
        System.out.println(reverseText);


        String[] textArray = reverseText.split(" ");
        for (int i = 0; i < textArray.length; i++) {
            System.out.print(textArray[textArray.length - i - 1]);
            System.out.print(" ");
        }
        System.out.println();




    }

}
