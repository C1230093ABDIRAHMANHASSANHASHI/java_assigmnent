import java.util.Scanner;

public class plaindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word, reverse = "";

        System.out.print("enter the number: ");
        word = input.nextLine();

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if (word.equals(reverse)) {
            System.out.println(word +"it's  palindrome.");
        } else {
            System.out.println(word + " it's Not  palindrome.");
        }





    }
}
