package EX66;

public class CountFlips {

    /*
     *   6.6 Using the Coin class defined in Chapter 5, write a program called CountFlips whose main
     *   method flips a coin 100 times and counts how many times each side comes up. Print the results.
     */

    public static void main(String[] args) {

        int heads = 0;
        int tails = 0;
        Coin coin = new Coin();

        for (int i = 0; i < 100; i++) {
            coin.flip();
            if ((coin.toString()).equals("Heads")) {
                heads++;
            }
            else if ((coin.toString()).equals("Tails")) {
                tails++;
            }
            else {
                System.out.print("ERROR, STOPPING PROGRAM...");
                System.exit(0);
            }
        }

        System.out.println("The number of heads in 100 flips were: " + heads + " and the number of tails were: " + tails);

    }

}
