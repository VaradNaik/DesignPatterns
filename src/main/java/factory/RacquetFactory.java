package factory;

public class RacquetFactory {

    public Racquet getRacquet(String racquetType){
        if(racquetType.equalsIgnoreCase("Tennis")){
            return new TennisRacquet();
        }
        if(racquetType.equalsIgnoreCase("Squash")){
            return new SquashRacquet();
        }
        if(racquetType.equalsIgnoreCase("Badminton")){
            return new BadmintonRacquet();
        }
        return null;
    }
}
