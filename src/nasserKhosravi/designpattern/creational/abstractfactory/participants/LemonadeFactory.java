package nasserKhosravi.designpattern.creational.abstractfactory.participants;

/**
 * Created by Naser on 5/10/2017
 */
public class LemonadeFactory implements DrinkAbstractFactory{

    @Override
    public Drink create() {
        return new Lemonade();
    }

}
