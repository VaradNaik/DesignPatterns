package facade;

public class Client {

    public static void main(String[] args){

        RacquetMaker racquetMaker = new RacquetMaker();

        racquetMaker.createTennisRacquet();
        racquetMaker.createSquashRacquet();
    }
}
