package singleton;

public class Racquet {

    public static volatile Racquet racquet = null;

    private Racquet(){

    }

    public static Racquet getRacquet(){
        if(racquet == null){
            synchronized (Racquet.class){
                if(racquet == null){
                    racquet = new Racquet();
                }
            }
        }
        return racquet;
    }

    public static void hitTheBall(){
        System.out.println("racquet hits the ball after this method is called");
    }
}
