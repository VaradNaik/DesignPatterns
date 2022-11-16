package abstractfactory;

public class FactoryGenerator {

    public AbstractFactory getFactory(String typeOfSport){
        if(typeOfSport.equalsIgnoreCase("racquet")){
            return new RacquetFactory();
        }
        if(typeOfSport.equalsIgnoreCase("ball")){
            return new BallFactory();
        }
        return null;
    }
}
