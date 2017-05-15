package nasserKhosravi.designpattern.behavioral.observer.participants.observer;

import nasserKhosravi.designpattern.behavioral.observer.participants.obseverable.PopulationObserverAble;

/**
 * Created by Nasser on 5/2/2017
 */
public class ApartmentObserver extends ObserverPopulation {

    private int population;
    private static final int FACTOR = 40;
    public ApartmentObserver(PopulationObserverAble theSubject){
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

        return "You need "+result+" Apartment";
    }
}
