import java.util.Scanner;

public class Roshambo {
    public static boolean rockCheck(String pick){
        String small = pick.toLowerCase();
        return small.indexOf("r") == 0;
    }

    public static boolean paperCheck(String pick){
        String small = pick.toLowerCase();
        return small.indexOf("p") == 0;
    }

    public static boolean scissorsCheck(String pick){
        String small = pick.toLowerCase();
        return small.indexOf("s") == 0;
    }

    public static String check(String pick){
        String result = "";
        if (rockCheck(pick)){
            result = "rock";
        }
        if (paperCheck(pick)){
            result = "paper";
        }
        if (scissorsCheck(pick)){
            result = "scissors";
        }
        return result;
    }
    public static String cheat(String ans){
        String result = "";
        if (ans == "rock"){
            result = "paper";
        }
        if (ans == "paper"){
            result = "scissors";
        }
        if (ans == "scissors"){
            result = "rock";
        }
        return result;
    }
    public static void unfairGame(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Your Move: ");
        String move = scan.nextLine();
        String moveReal = Roshambo.check(move);
        String cheatMove = Roshambo.cheat(moveReal);
        System.out.println("I said..." + cheatMove);
        System.out.println(cheatMove + " beats " + moveReal);
        System.out.println("I win! Let's go again!");
        while (Roshambo.rockCheck(moveReal) || Roshambo.paperCheck(moveReal) || Roshambo.scissorsCheck(moveReal)) {
            System.out.print("(Your Move): ");
            move = scan.nextLine();
            moveReal = Roshambo.check(move);
            System.out.println("I said..." + cheatMove);
            System.out.println(cheatMove + " beats " + moveReal);
            System.out.println("I win! Let's go again!");
        }
    }
}
