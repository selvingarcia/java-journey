package Part4Files;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class TeamMain {
    public static void main(String[] args) {

        ArrayList<Teams> teams = new ArrayList<>();
         String homeTeam, awayTeam;
         int homePoints, awayPoints;
        try(Scanner sc = new Scanner(Paths.get("data_team.csv"))){
            while (sc.hasNextLine()){
                int wins=0, losses=0, games=0;
                boolean home = false, away = false;
                String line = sc.nextLine();
                if(line.isBlank())continue;
                String[] data = line.split(",");
                homeTeam = data[0].trim();
                awayTeam = data[1].trim();
                homePoints = Integer.parseInt(data[2]);
                awayPoints = Integer.parseInt(data[3]);

                for (int i = 0; i < teams.size(); i++) {
                    if (teams.get(i).getHomeTeam().equalsIgnoreCase(homeTeam)){
                        if (homePoints>awayPoints)teams.get(i).toWin();
                        else if (awayPoints>homePoints) teams.get(i).toLose();
                        home=true;
                    }
                    if (teams.get(i).getHomeTeam().equalsIgnoreCase(awayTeam)) {
                        if (awayPoints>homePoints)teams.get(i).toWin();
                        else if (homePoints>awayPoints)teams.get(i).toLose();
                        away=true;
                    }

                }
                if (!home) {
                    Teams a = new Teams(homeTeam);
                    if (homePoints>awayPoints) {
                        a.toWin();
                        teams.add(a);
                    } else if (awayPoints>homePoints) {
                        a.toLose();
                        teams.add(a);
                    }
                }
                if (!away){
                    Teams a = new Teams(awayTeam);
                    if (awayPoints>homePoints) {
                        a.toWin();
                        teams.add(a);
                    } else if (homePoints>awayPoints) {
                        a.toLose();
                        teams.add(a);
                    }
                }
            }//end while
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        for (Teams obj: teams){
            System.out.println(obj);
        }
    }
}
