package nasserKhosravi.designpattern.behavioral.observer.participants.observer;

import nasserKhosravi.designpattern.behavioral.observer.participants.obseverable.PopulationObserverAble;

/**
 * Created by Naser on 5/2/2017
 */

public class UrbanOpenSpaceObserver extends ObserverPopulation{

    private int population;
    private static final int FACTOR = 100;

    public UrbanOpenSpaceObserver(PopulationObserverAble theSubject){
        theSubject.register(this);
    }

    @Override
    public void updatePopulation(int population) {

        this.population = population;
    }

    @Override
    public String report() {
        float result = (float) population / FACTOR;
        if (result == 0){
            result=1;
        }

        return "You need "+result+" Urban Open Space";
    }

}
