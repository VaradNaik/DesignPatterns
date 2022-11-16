package builder;

public class RacquetClient {

    public static void main(String[] args){
        Racquet aeroProDrive = new Racquet.RacquetBuilder(300,"babolat",100.00)
                .nameOfRacquet("aero pro drive")
                .build();
        System.out.println(aeroProDrive.getWeight());
    }
}
