package factory;

public class MainClient {

    public static void main(String[] args){
        RacquetFactory racquetFactory = new RacquetFactory();
        Racquet tennisRacquet = racquetFactory.getRacquet("TENNIS");
        tennisRacquet.buildRacquet();
        System.out.println(tennisRacquet.weight);
    }
}
