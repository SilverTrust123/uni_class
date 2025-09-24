package B11221009;
public class CrapsTest {
    public static void main(String[] args) {
        Craps crapsGame = new Craps();
        int totalWins = 0;
        int totalRolls = 0;
        int numGames = 10000;
        for (int i = 0; i < numGames; i++) {
            int result = crapsGame.play();
            if (result > 0) {
                totalWins++;
            }
            totalRolls += Math.abs(result);
        }
        double winRate = (double) totalWins / numGames;
        double averageRolls = (double) totalRolls / numGames;
        System.out.println("Winning Rate: " + winRate);
        System.out.println("Average Rolls per Game: " + averageRolls);
    }
}