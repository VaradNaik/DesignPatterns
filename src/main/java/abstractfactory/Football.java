package abstractfactory;

public class Football extends SportsItem {
    public void createSportsItem() {
        this.weight = 500;
        System.out.println("football created");
    }
}
