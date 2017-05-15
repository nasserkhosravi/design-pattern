package nasserKhosravi.designpattern.creational.abstractfactory.participants;

/**
 * Created by Naser on 5/10/2017
 */
public abstract class Drink {

    public abstract String howToMakeIt();

    @Override
    public String toString() {
        return "This is a drink and make it in this way: "+howToMakeIt();
    }
}
