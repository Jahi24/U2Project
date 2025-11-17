public class Roshambo {
    private static boolean rockCheck(String pick){
        String small = pick.toLowerCase();
        return small.indexOf("r") == 0;
    }

    private static boolean paperCheck(String pick){
        String small = pick.toLowerCase();
        return small.indexOf("p") == 0;
    }

    private static boolean scissorsCheck(String pick){
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
}
