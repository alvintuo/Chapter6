package PasswordCracker;
import java.util.Random;

public class Decoder {

    private int attempts = 0;
    private String sc;

    public Decoder(String secret) {
        sc = secret;
    }

    public char getMatch(char input) {

        while (true) {
            attempts++;

            String alphabet = "abcdefghijklmnopqrtstuvwxyz1234567890";
            Random rdm = new Random();
            char randomChar = alphabet.charAt(rdm.nextInt(37));
            char secretChar = sc.charAt(RunDecoder.charIndex);

            if (randomChar == secretChar) {
                return randomChar;
            }

        }

    }

    public int getAttempts() {

        return attempts;

    }

}