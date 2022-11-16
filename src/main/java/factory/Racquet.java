package factory;

public abstract class Racquet {
    int weight;

    abstract void buildRacquet();

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
