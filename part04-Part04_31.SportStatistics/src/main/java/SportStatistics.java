
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SportStatistics {
    // wrapper class
    private static class SportStatisticsObject {
        private String homeTeam;
        private String visitingTeam;
        private int homeTeamPoints;
        private int visitingTeamPoints;

        public SportStatisticsObject(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {
            this.homeTeam = homeTeam;
            this.visitingTeam = visitingTeam;
            this.homeTeamPoints = homeTeamPoints;
            this.visitingTeamPoints = visitingTeamPoints;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();
        ArrayList<SportStatisticsObject> dataCollection = readFile(file);

        System.out.println("Team: ");
        String teamInput = scan.nextLine();
        Map<String, Integer> gamesStatus = checkGamesStatusByTeamInput(dataCollection, teamInput);

        System.out.println("Team: " + teamInput);
        System.out.println("Games: " + gamesStatus.get("gamesPlayed"));
        System.out.println("Wins: " + gamesStatus.get("wins"));
        System.out.println("Losses: " + gamesStatus.get("losses"));
    }

    // methods
    private static ArrayList<SportStatisticsObject> readFile(String file) {
        ArrayList<SportStatisticsObject> dataCollection = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                dataCollection.add(treatReadLine(row));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return dataCollection;
    }

    private static SportStatisticsObject treatReadLine(String row) {
        String[] data = row.split(",");
        SportStatisticsObject SportsStatsObj = new SportStatisticsObject(data[0], data[1], Integer.valueOf(data[2]),
                Integer.valueOf(data[3]));
        return SportsStatsObj;
    }

    private static Map<String, Integer> checkGamesStatusByTeamInput(ArrayList<SportStatisticsObject> playedGamesList,
            String teamInput) {

        Map<String, Integer> gamesStatus = new HashMap<String, Integer>();
        Integer gamesPlayed = 0;
        Integer wins = 0;
        Integer losses = 0;

        for (SportStatisticsObject game : playedGamesList) {

            if (game.homeTeam.equals(teamInput)) {
                // abstraction needed
                gamesPlayed++;
                if (getHomeTeamWon(game)) {
                    wins++;
                } else {
                    losses++;
                }
            }
            if (game.visitingTeam.equals(teamInput)) {
                // abstraction needed
                gamesPlayed++;
                if (getVisitingTeamWon(game)) {
                    wins++;
                } else {
                    losses++;
                }
            }
        }
        gamesStatus.put("gamesPlayed", gamesPlayed);
        gamesStatus.put("wins", wins);
        gamesStatus.put("losses", losses);

        return gamesStatus;
    }

    private static Boolean getHomeTeamWon(SportStatisticsObject game) {
        return game.homeTeamPoints > game.visitingTeamPoints;
    }

    private static Boolean getVisitingTeamWon(SportStatisticsObject game) {
        return game.visitingTeamPoints > game.homeTeamPoints;
    }
}
