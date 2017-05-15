package nasserKhosravi.designpattern.creational.abstractfactory.participants;

/**
 * Created by Naser on 5/10/2017
 */
public class ColaFactory implements DrinkAbstractFactory{
    @Override
    public Drink create() {
        return new Cola();
    }
}
