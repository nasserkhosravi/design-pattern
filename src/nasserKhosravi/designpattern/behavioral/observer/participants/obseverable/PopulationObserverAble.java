package nasserKhosravi.designpattern.behavioral.observer.participants.obseverable;

import nasserKhosravi.designpattern.behavioral.observer.participants.observer.ObserverPopulation;

import java.util.ArrayList;

/**
 * Created by Naser on 5/2/2017
 */

public class PopulationObserverAble{

    private ArrayList<ObserverPopulation> list=new ArrayList<>();
    private int p;

    public void setPopulation(int population){
        this.p = population;
    }


    public void register(ObserverPopulation o) {
        list.add(o);
    }


    public void unregister(ObserverPopulation o) {
        list.remove(o);
    }


    public void notifyObservers() {
        for (ObserverPopulation b:list){
            b.updatePopulation(p);
        }
    }
}
