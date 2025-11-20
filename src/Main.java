import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play rock, paper, scissors!");
        Roshambo.unfairGame();
        System.out.println();
        System.out.println("Did you want to play fair?");
        String request = scan.nextLine();
        if (Roshambo.yesCheck(request)) {
            Roshambo.fairGame();
        }
        System.out.println("Goodbye! I had fun!");
    }
}