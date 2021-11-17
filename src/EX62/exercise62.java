package EX62;

import java.util.Scanner;

public class exercise62 {

    /*
     *  6.2 Design and implement an application that reads a string from the user and prints it one
     *  character per line.
     */

    public static void main(String[] args) {

        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int length = input.length();

        for (int i = 0; i < length; i++) {
            System.out.println(input.charAt(i));
        }

    }

}
