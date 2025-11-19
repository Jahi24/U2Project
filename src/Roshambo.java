import java.util.Objects;
import java.util.Scanner;

public class Roshambo {
    public static boolean rockCheck(String pick) {
        String small = pick.toLowerCase();
        return small.indexOf("r") == 0;
    }

    public static boolean paperCheck(String pick) {
        String small = pick.toLowerCase();
        return small.indexOf("p") == 0;
    }

    public static boolean scissorsCheck(String pick) {
        String small = pick.toLowerCase();
        return small.indexOf("s") == 0;
    }

    public static String check(String pick) {
        String result = "";
        if (rockCheck(pick)) {
            result = "rock";
        }
        if (paperCheck(pick)) {
            result = "paper";
        }
        if (scissorsCheck(pick)) {
            result = "scissors";
        }
        return result;
    }

    public static boolean yesCheck(String pick){
        String small = pick.toLowerCase();
        return small.indexOf("y") == 0;
    }

    public static String cheat(String ans) {
        String result = "";
        if (rockCheck(ans)) {
            result = "paper";
            return result;
        }
        if (paperCheck(ans)) {
            result = "scissors";
            return result;
        }
        if (scissorsCheck(ans)) {
            result = "rock";
            return result;
        }
        return result;
    }

    public static String computerPick(int input){
        String result = "";
        if (input == 1) {
            result = "paper";
            return result;
        }
        if (input == 2) {
            result = "scissors";
            return result;
        }
        if (input == 3) {
            result = "rock";
            return result;
        }
        return result;
    }

    public static void unfairGame() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Your Move: ");
        String move = scan.nextLine();
        String moveReal = Roshambo.check(move);
        if (Objects.equals(moveReal, "")) {
            return;
        }
        String cheatMove = Roshambo.cheat(moveReal);
        System.out.println("I said..." + cheatMove);
        System.out.println(cheatMove + " beats " + moveReal);
        System.out.println("I win! Let's go again!");
        while (!moveReal.equals("")) {
            System.out.print("(Your Move): ");
            move = scan.nextLine();
            moveReal = Roshambo.check(move);
            if (Objects.equals(moveReal, "")) {
                break;
            }
            cheatMove = Roshambo.cheat(move);
            System.out.println("I said..." + cheatMove);
            System.out.println(cheatMove + " beats " + moveReal);
            System.out.println("I win! Let's go again!");
        }
        System.out.println("What?");
    }

    public static void fairGame() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Best 2 out of 3? or \nBest 3 out of 5?");
        System.out.print("Type \"1\" for the first option and \"2\" for the second option.");
        int selection = scan.nextInt();
        if (selection == 1) { // 2:3 RPS game
            int myScore = 0;
            int yourScore = 0;
            for (int i = 0; (myScore != 2 || yourScore != 2); i++){
                int random = (int) ((Math.random() * 2) + 1);
                String myPick = Roshambo.computerPick(random);
                System.out.print("Your Move: ");
                String move = scan.nextLine();
                String yourPick = Roshambo.check(move);
                if (myPick == yourPick){
                    System.out.println("Same thing, go again!");
                } else if (myPick.equals("rock") && yourPick.equals("scissors")){
                    System.out.println(myPick + " beats " + yourPick + "!");
                }
            }
        } else if (selection == 2){ // 3:5 RPS game

        }
    }
}
