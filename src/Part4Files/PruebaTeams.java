package Part4Files;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaTeams {


    public static void main(String[] args) {
        ArrayList<Teams> hola = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

       // hola.add(new Teams("Barcelona",1,0,1));
       // hola.add(new Teams("Madrid",1,0,1));

        hola.get(0).toWin();
        System.out.println(hola.get(0));

        System.out.println("Enter the name, wins, losses, games");
        String line = sc.nextLine();
        for (int i = 0; i < hola.size(); i++) {
            if (hola.get(i).getHomeTeam().equalsIgnoreCase("Barcelona")){

                hola.get(i).toWin();
                break;
            }
            String[] team = line.split(",");
            var name = team[0];
            var wins = Integer.parseInt(team[1]);
            var losses = Integer.parseInt(team[2]);
            var games = Integer.parseInt(team[3]);
           // hola.add(new Teams(name,wins,  losses, games));
        }



            for (Teams obj:hola){
                System.out.println(obj);
            }

    }


}
