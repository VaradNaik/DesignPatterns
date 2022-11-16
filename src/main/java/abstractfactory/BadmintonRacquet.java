package abstractfactory;

public class BadmintonRacquet extends SportsItem{

    public void createSportsItem(){
        this.weight = 100;
        System.out.println("badminton racquet created");
    }
}
