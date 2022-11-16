package decorater;

public class Client {

    public static void main(String[] args){
        Racquet tennis = new TennisRacquet();
        tennis.createRacquet();

        Racquet wilsonTennisRacquet = new WilsonRacquetDecorator(new TennisRacquet());
        wilsonTennisRacquet.createRacquet();
    }
}
