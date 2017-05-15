package nasserKhosravi.designpattern.creational.abstractfactory.participants;

/**
 * Created by Naser on 5/11/2017
 */
public class DrinkFactory {

    public static Drink getDrink(DrinkAbstractFactory factory){
        return factory.create();
    }
}
