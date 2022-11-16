package abstractfactory;

public class BasketBall extends SportsItem{

    public void createSportsItem(){
        this.weight = 700;
        System.out.println("basketball created");
    }
}
