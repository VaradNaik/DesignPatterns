package abstractfactory;

public class SquashRacquet extends SportsItem{

    public void createSportsItem(){
        this.weight = 175;
        System.out.println("squash racquet created");
    }
}
