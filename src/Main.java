import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play rock, paper, scissors!");
        System.out.print("(Your Move): ");
        String move = scan.nextLine();
        System.out.println(Roshambo.check(move));
    }
}