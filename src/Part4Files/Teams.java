package Part4Files;

public class Teams {

    private String homeTeam, awayTeam;
    private int homePoints, wins, losses, games;

    public Teams(String homeTeam){
        this.homeTeam = homeTeam;

    }

    @Override
    public String toString() {
        return "Team: " + homeTeam + " Wins "+ wins+ " Losses " + losses + " Games " + games;
    }

    public void toWin(){
        wins++;
        games++;
    }

    public String getHomeTeam(){
        return homeTeam;
    }

    public void toLose(){
        losses++;
        games++;
    }


}
