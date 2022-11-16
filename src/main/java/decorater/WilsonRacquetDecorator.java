package decorater;

public class WilsonRacquetDecorator extends RacquetDecorator{

    public WilsonRacquetDecorator(Racquet decorateThisRacquet){
        super(decorateThisRacquet);
    }

    public void createRacquet(){
        decorateThisRacquet.createRacquet();
        createWilsonRacquet();
    }

    public void createWilsonRacquet(){
        System.out.println("wilson racquet created");
    }
}
