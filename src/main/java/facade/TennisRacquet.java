package facade;


public class TennisRacquet extends Racquet {

    public void buildRacquet(){
        System.out.println("tennis racquet built");
        this.setWeight(300);
    }
}
