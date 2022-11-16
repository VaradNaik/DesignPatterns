package observer;

public class BadmintonHeadSize extends Observer{

    public BadmintonHeadSize(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update(){
        System.out.println("badminton headsize updated to " + this.subject.getHeadsize());
    }
}
