package game;

import java.util.Scanner;

public class RockPaperScissor {

    // At a time 2 people play RPS
    // we take 1st player turn
    // Then second player turn
    static int turn = 0;

    public static void main(String[] args) {
        // 1st player turn

        play(turn);
        winner();
    }

    private static void winner() {

        if (input.equals("R") && input2.equals("P")) {
            System.out.println("Player 2 Wins");
        }

        if (input.equals("P") && input2.equals("R")) {
            System.out.println("Player 1 Wins");
        }

        if (input.equals("P") && input2.equals("S")) {
            System.out.println("Player 2 Wins");
        }

        if (input.equals("S") && input2.equals("P")) {
            System.out.println("Player 1 Wins");
        }

        if (input.equals("Scissors") && input2.equals("Rock")) {
            System.out.println("Player 2 Wins");
        }

        if (input.equals("Rock") && input2.equals("Scissors")) {
            System.out.println("Player 1 Wins");
        }
    }

    static String input;
    static String input2;
    static Scanner scanner = new Scanner(System.in);

    private static void checkInput() {

        if (input.equals("R")) {
            System.out.println("Valid Input");

        } else if (input.equals("P")) {
            System.out.println("Valid Input");

        } else if (input.equals("S")) {
            System.out.println("Valid Input");

        } else {
            System.out.println("Invalid Input");
            input = scanner.nextLine();
            checkInput();
        }

    }

    private static void checkInput2() {
        if (input2.equals("R")) {
            System.out.println("Valid Input");

        } else if (input2.equals("P")) {
            System.out.println("Valid Input");

        } else if (input2.equals("S")) {
            System.out.println("Valid Input");

        } else {
            System.out.println("Invalid Input");
            input2 = scanner.nextLine();
            checkInput2();
        }
    }

    private static void play(int turn) {

        if (turn == 0) {
            System.out.println("Enter answer for Player 1 : ");
            input = scanner.nextLine();
            checkInput();
            turn = 1;
        }

        if (turn == 1) {
            System.out.println("Enter answer for Player 2 : ");
            input2 = scanner.nextLine();
            checkInput2();
        }

        if (input.equals(input2)) {
            System.out.println("Same Input");
            play(turn);
        }

    }
}
