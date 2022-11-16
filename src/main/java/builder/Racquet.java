package builder;

public class Racquet {

    private final int weight;
    private final String company;
    private final double headsize;
    private final String color;
    private final String nameOfRacquet;
    private final String ownerName;
    private final int price;

    private Racquet(RacquetBuilder racquetBuilder){
        this.nameOfRacquet = racquetBuilder.nameOfRacquet;
        this.company = racquetBuilder.company;
        this.headsize = racquetBuilder.headsize;
        this.ownerName = racquetBuilder.ownerName;
        this.weight = racquetBuilder.weight;
        this.price = racquetBuilder.price;
        this.color = racquetBuilder.color;
    }

    public int getWeight(){
        return weight;
    }

    public String getCompany() {
        return company;
    }

    public double getHeadsize() {
        return headsize;
    }

    public String getColor() {
        return color;
    }

    public String getNameOfRacquet() {
        return nameOfRacquet;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getPrice() {
        return price;
    }
    public static class RacquetBuilder{
        private int weight;
        private String company;
        private double headsize;

        private String color;
        private String nameOfRacquet;
        private String ownerName;
        private int price;

        public RacquetBuilder(int weight, String company, double headsize){
            this.weight = weight;
            this.company = company;
            this.headsize = headsize;
        }

        public RacquetBuilder color(String color){
            this.color = color;
            return this;
        }
        public RacquetBuilder nameOfRacquet(String nameOfRacquet){
            this.nameOfRacquet = nameOfRacquet;
            return this;
        }

        public RacquetBuilder ownerName(String ownerName){
            this.ownerName = ownerName;
            return this;
        }

        public RacquetBuilder price(int price){
            this.price = price;
            return this;
        }
        public Racquet build(){
            return new Racquet(this);
        }
    }

}
