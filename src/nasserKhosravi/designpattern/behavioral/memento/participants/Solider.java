package nasserKhosravi.designpattern.behavioral.memento.participants;

/**
 * Created by Naser on 5/9/2017
 * this known as originator
 */
public class Solider {

    private String name;
    private int weight ;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public Solider(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public WeightSnapShot takeWightSnapShot(){
        return new WeightSnapShot(weight);
    }

    public void restoreWight(WeightSnapShot weightSnapShot){
        weight=weightSnapShot.getWeight();
    }
}
