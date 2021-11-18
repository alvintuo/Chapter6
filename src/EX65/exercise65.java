package EX65;

import jdk.internal.util.xml.impl.Pair;

public class exercise65 {
    /*
     *  6.5 Using the PairOfDice class from PP 4.9, write a program that rolls a pair of dice 1000
     *  times, counting the number of box cars (two sixes) that occur.
     */

    public static void main(String[] args) {

        int box = 0;

        PairOfDice die = new PairOfDice();
        PairOfDice die2 = new PairOfDice();

        for (int i = 0; i < 1000; i++) {
            die.roll();
            die2.roll();

            int val1 = die.getDie1();
            int val2 = die2.getDie2();

            if (val1 == val2) {
                box++;
            }


        }

        System.out.println("Two Six-Rolls happened: " + box + " times out of 1000 rolls!");

    }

}
