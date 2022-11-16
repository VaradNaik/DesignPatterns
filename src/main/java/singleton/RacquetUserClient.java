package singleton;

public class RacquetUserClient {

    public static void main(String[] args){
        Racquet.hitTheBall();
        Racquet.getRacquet().hitTheBall();
    }
}
