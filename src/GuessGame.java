import java.util.Scanner;

public class GuessGame {
    private int targetNumber;

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think of a number between 0 and 9");
        targetNumber = (int) (Math.random() * 10);

        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        int guessp1, guessp2, guessp3;
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        while (true) {
            System.out.println("Number to guess is " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();
            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);
            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);
            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over.");
                break; // game over, so break out of the loop
            } else {
                // we must keep going because nobody got it right!
                System.out.println("Players will have to try again.");
            }
        } // end loop
    } // end method
}
