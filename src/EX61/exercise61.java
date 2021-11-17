package EX61;

import java.util.Scanner;

public class exercise61 {

    /*
     * 6.1 Design and implement an application that reads an integer value and prints the sum of all
     * even integers between 2 and the input value, inclusive. Print an error message if the input value
     * is less than 2. Prompt accordingly.
     */

    public static void main(String[] args) {

        System.out.println("Enter an integer:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;

        if (input < 2) {
            System.out.println("ERROR!!!");
            System.exit(0);
        }

        for (int i = 2; i < input; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("The sum of all evens up to " + input +" is: " + sum);

    }

}
