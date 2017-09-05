package nasserKhosravi.designpattern.behavioral.observer.participants;

import nasserKhosravi.designpattern.behavioral.observer.participants.observer.ApartmentObserver;
import nasserKhosravi.designpattern.behavioral.observer.participants.observer.UrbanOpenSpaceObserver;
import nasserKhosravi.designpattern.behavioral.observer.participants.obseverable.PopulationObserverAble;

/**
 * Created by Naser on 5/2/2017
 */

public class City {
    private String name;
    private PopulationObserverAble subject;
    private UrbanOpenSpaceObserver urbanOpenSpaceObserver;
    private ApartmentObserver apartmentObserver;

    public City(String name) {
        this.name = name;

        subject=new PopulationObserverAble();
        apartmentObserver=new ApartmentObserver(subject);
        urbanOpenSpaceObserver =new UrbanOpenSpaceObserver(subject);
    }


    public void setPopulation(final int population){
        subject.setPopulation(population);
        subject.notifyObservers();
    }

    public String getRequirements(){
        return apartmentObserver.report() +"\n"+urbanOpenSpaceObserver.report();
    }

    public String getName() {
        return name;
    }


}
