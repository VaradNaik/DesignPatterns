package facade;

public class RacquetMaker {

    private Racquet tennis;
    private Racquet squash;

    public RacquetMaker(){
        tennis = new TennisRacquet();
        squash = new SquashRacquet();
    }

    public void createTennisRacquet(){
        tennis.buildRacquet();
    }

    public void createSquashRacquet(){
        squash.buildRacquet();
    }
}
