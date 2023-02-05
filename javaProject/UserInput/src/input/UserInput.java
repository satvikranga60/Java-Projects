package input;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter a line of characters: ");
        // String line = input.nextLine();
        // System.out.println("You entered: " + line);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a integer: ");
        int num = input.nextInt();
        System.out.println("You entered " + num);

    }

}
