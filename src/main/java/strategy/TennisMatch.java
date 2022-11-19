package strategy;

public class TennisMatch {

    public static void main(String[] args){
        SportsPerson varad = new SportsPerson(new DefensiveStategy(),new ShowSwag());

        System.out.println(varad.executeStrategy());

        SportsPerson rachith = new SportsPerson(new AttackingStrategy(), new Sledging());

        System.out.println(rachith.executeStrategy());
    }
}
