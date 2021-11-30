package PasswordCracker;
import java.util.Scanner;

public class RunDecoder {

    public static int charIndex = 0;

    public static void main(String[] args) {

        System.out.println("Enter secret password:");
        Scanner sc = new Scanner(System.in);
        String secret = sc.nextLine();
        String password = "";

        Decoder decoder = new Decoder(secret);

        for (int i = 1; i <= secret.length(); i++) {

            char secretChar = secret.charAt(charIndex);
            System.out.println("Digit " + (charIndex + 1) + " matched!");
            password += decoder.getMatch(secretChar);
            charIndex++;

        }

        System.out.println("The password was decoded!");
        System.out.println("The password is: " + password);
        System.out.println("It took " + decoder.getAttempts() + " attempts to decode!");
    }

}