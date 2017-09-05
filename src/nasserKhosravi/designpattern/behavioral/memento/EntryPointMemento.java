package nasserKhosravi.designpattern.behavioral.memento;

import nasserKhosravi.designpattern.behavioral.memento.participants.Solider;
import nasserKhosravi.designpattern.behavioral.memento.participants.WeightHistory;
import nasserKhosravi.designpattern.behavioral.memento.participants.WeightSnapShot;

/**
 * Created by Naser on 5/9/2017
 * we have a solider we want record his weight and we want back his weight
 */
public class EntryPointMemento {

    public static void run(){
        Solider solider=new Solider("S1",55);
        WeightHistory weightHistory=new WeightHistory();

        weightHistory.add(solider.takeWightSnapShot());
        solider.setWeight(75);
        System.out.println("Soldier Weight is: "+solider.getWeight());

        WeightSnapShot weightSnapShot0=weightHistory.get(0);
        solider.restoreWight(weightSnapShot0);
        System.out.println("Soldier Weight is: "+solider.getWeight());
    }

}
