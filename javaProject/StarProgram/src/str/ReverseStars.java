package str;

import java.util.Scanner;

public class ReverseStars {
    public static void main(String[] args) {

        System.out.println("Please enter the amount for collums you would like in the star: ");

        Scanner input = new Scanner(System.in);

        // R = Rows C = Collums
        int num = input.nextInt();
        num++;
        for (int r = 1; r <= num; r++) {
            for (int c = 1; c <= num - r; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
