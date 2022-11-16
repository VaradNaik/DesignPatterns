package decorater;

public class RacquetDecorator implements Racquet{
    Racquet decorateThisRacquet;

    RacquetDecorator(Racquet decorateThisRacquet){
        this.decorateThisRacquet = decorateThisRacquet;
    }

    public void createRacquet(){
        decorateThisRacquet.createRacquet();
    }
}
