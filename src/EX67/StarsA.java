package EX67;

/*
 *   6.7 Create modified versions of the Stars program (found in your textbook) to print the
 *   following patterns. Create a separate program to produce each pattern. Hint: Parts b, c, and d
 *   require several loops, some of which print a specific number of spaces.
 */

public class StarsA {

    public static void main(String[] args) {
        final int MAX_ROWS = 10;

        for (int row = 1; row <= MAX_ROWS; row++) {
            for (int star = 10; star >= row; star--)
                System.out.print("*");

            System.out.println();
        }

    }

}
