package observer;

public class Client {

    public static void main(String[] args){
        Subject subject = new Subject();
        new TennisHeadSize(subject);
        new BadmintonHeadSize(subject);

        subject.setHeadsize(270);
        subject.setHeadsize(300);
    }
}
