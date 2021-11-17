package EX63;

public class exercise63 {

    /*
     *  6.3 Design and implement an application that produces a multiplication table, showing the
     *  results of multiplying the integers 1 through 12 by themselves.
     */

    public static void main(String[] args) {

        for (int x = 1; x < 13; x++) {
            for (int i = 1; i < 13; i++) {
                System.out.println(x * i);
            }
        }

    }

}
