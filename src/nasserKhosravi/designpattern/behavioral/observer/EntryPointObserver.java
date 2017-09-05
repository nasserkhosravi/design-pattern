package nasserKhosravi.designpattern.behavioral.observer;

import nasserKhosravi.designpattern.behavioral.observer.participants.City;

/**
 * Created by Naser on 5/9/2017
 * we have a subject as population that every change in population CHANGE city's requirement
 * the requirement consist of  Apartment and Urban open space
 */
public class EntryPointObserver {

    public static void run(){
        City tehran=new City("tehran");
        tehran.setPopulation(300);

        System.out.println(tehran.getRequirements());

        tehran.setPopulation(200);

        System.out.println(tehran.getRequirements());

    }

}
