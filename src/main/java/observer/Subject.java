package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<Observer> observerList = new ArrayList<>();
    int headsize;

    public int getHeadsize(){
        return headsize;
    }
    public void setHeadsize(int headsize){
        this.headsize = headsize;
        notifyAllObservers(); //important, don't miss this!
    }

    public void attach(Observer observer){
        observerList.add(observer);
    }

    public void notifyAllObservers(){
        for(Observer observer: observerList){
            observer.update();
        }
    }
}
