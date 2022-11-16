package abstractfactory;

public class TennisRacquet extends SportsItem{

    public void createSportsItem(){
        this.weight = 300;
        System.out.println("tennis racquet created");
    }
}
