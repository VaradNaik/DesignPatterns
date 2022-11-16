package abstractfactory;

public class BallFactory extends AbstractFactory{

    public SportsItem getSportsItem(String sportName){
        if(sportName.equalsIgnoreCase("basketball")){
            return new BasketBall();
        }
        if(sportName.equalsIgnoreCase("football")){
            return new Football();
        }
        return null;
    }
}
