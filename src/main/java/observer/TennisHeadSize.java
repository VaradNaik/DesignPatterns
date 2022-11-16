package observer;

public class TennisHeadSize extends Observer{

    public TennisHeadSize(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update(){
        System.out.println("tennis headsize updated to " + this.subject.getHeadsize());
    }
}
