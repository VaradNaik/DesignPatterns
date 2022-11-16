package abstractfactory;

public class MainClient {

    public static void main(String[] args){
        FactoryGenerator factoryGenerator = new FactoryGenerator();

        AbstractFactory racquetFactory = factoryGenerator.getFactory("racquet");

        SportsItem tennisRacquet = racquetFactory.getSportsItem("tennis");
        tennisRacquet.createSportsItem();

        SportsItem badmintonRacquet = racquetFactory.getSportsItem("badminton");
        badmintonRacquet.createSportsItem();
    }
}
