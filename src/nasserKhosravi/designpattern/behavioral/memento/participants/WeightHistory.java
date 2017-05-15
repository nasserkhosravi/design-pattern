package nasserKhosravi.designpattern.behavioral.memento.participants;

import java.util.ArrayList;

/**
 * Created by Naser on 5/9/2017
 * this known as CareTaker
 */
public class WeightHistory {

    private ArrayList<WeightSnapShot> list=new ArrayList<>();

    public void add(WeightSnapShot weightSnapShot){
        list.add(weightSnapShot);
    }

    public WeightSnapShot get(int position){
        return list.get(position);
    }
}
