package abstractfactory;

public class RacquetFactory extends AbstractFactory{

    public SportsItem getSportsItem(String racquetType){
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
