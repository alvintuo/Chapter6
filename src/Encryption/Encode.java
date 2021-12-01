package Encryption;
import java.util.Scanner;

public class Encode {

    public Encode() {}

    public static String encodeMessage (String sc, int num) {
        int maxCol = (int)((1.0 * sc.length())/num + 0.5);
        int numSpaces = (maxCol * num) - sc.length();
        for (int i = 0; i < numSpaces; i++) {
            sc += " ";
        }

        String s = sc.toLowerCase();
        String result = "";
        for (int row = 0; row < num; row++) {
            for (int col = 0; col < s.length(); col += num) {
                int index = (row + col) % s.length();
                result += sc.charAt(index);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("Enter secret message:");
        Scanner string = new Scanner(System.in);
        String secret = string.nextLine();

        System.out.println("Enter number of rows:");
        Scanner num = new Scanner(System.in);
        int rows = num.nextInt();

        Encode message = new Encode();
        String str = message.encodeMessage(secret, rows);

        System.out.println("Encrypted result:");
        System.out.println(str);

    }

}