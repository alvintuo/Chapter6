package EX67;

public class StarsC {

    public static void main(String[] args) {

        final int MAX_ROWS = 10;

        for (int row = 1; row <= MAX_ROWS; row++) {

            for (int space = 0; space < row; space++) {
                System.out.print(" ");
            }

            for (int star = 10; star >= row; star--)
                System.out.print("*");

            System.out.println();
        }

    }

}
