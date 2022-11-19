package strategy;

public class SportsPerson {
    SportsStrategy sportsStrategy;

    MindGamesStrategy mindGamesStrategy;
    public SportsPerson(SportsStrategy sportsStrategy,MindGamesStrategy mindGamesStrategy){
        this.sportsStrategy = sportsStrategy;
        this.mindGamesStrategy = mindGamesStrategy;
    }

    public String executeStrategy(){
        mindGamesStrategy.playMindGames();
        return sportsStrategy.playingStrategy();
    }
}
