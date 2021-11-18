package EX65;

// PairOfDice Class source: https://math.hws.edu/javanotes/c5/ex1-ans.html

public class PairOfDice {

    private int die1; // Number showing on the first die.
    private int die2; // Number showing on the second die.

    public PairOfDice() {
        roll(); // Call the roll() method to roll the dice.
    }

    public void roll() {
        die1 = (int)(Math.random() * 6) + 1;
        die2 = (int)(Math.random() * 6) + 1;
    }

    public int getDie1() {
        return die1;
    }

    public void setDie1(int value) {
        if (value < 1 || value > 6)
            throw new IllegalArgumentException("Illegal dice value " + value);
        die1 = value;
    }

    public int getDie2() {
        return die2;
    }

    public void setDie2(int value) {
        if (value < 1 || value > 6)
            throw new IllegalArgumentException("Illegal dice value " + value);
        die2 = value;
    }

    public int getTotal() {
        return die1 + die2;
    }

    public String toString() {
        if (die1 == die2)
            return "double " + die1;
        else
            return die1 + " and " + die2;
    }

}
