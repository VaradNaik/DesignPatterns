package factory;

public class BadmintonRacquet extends Racquet{

    public void buildRacquet(){
        System.out.println("Badminton Racquet built");
        this.setWeight(100);
    }
}
