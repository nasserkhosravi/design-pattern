package nasserKhosravi.designpattern.behavioral.observer.participants.observer;

import nasserKhosravi.designpattern.behavioral.observer.interfces.ReportAble;

/**
 * Created by Naser on 5/2/2017
 */
public abstract class ObserverPopulation implements ReportAble{

    public abstract void updatePopulation(int population);

}
