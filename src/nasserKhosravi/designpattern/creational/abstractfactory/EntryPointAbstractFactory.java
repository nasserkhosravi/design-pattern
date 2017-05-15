package nasserKhosravi.designpattern.creational.abstractfactory;

import nasserKhosravi.designpattern.creational.abstractfactory.participants.ColaFactory;
import nasserKhosravi.designpattern.creational.abstractfactory.participants.Drink;
import nasserKhosravi.designpattern.creational.abstractfactory.participants.DrinkAbstractFactory;
import nasserKhosravi.designpattern.creational.abstractfactory.participants.DrinkFactory;

/**
 * Created by Naser on 5/9/2017
 * We have {@link DrinkFactory} and with
 * {@link DrinkFactory#getDrink(DrinkAbstractFactory)} we can order a drink
 * But we must specific which {@link DrinkAbstractFactory} must provide our drink
 *
 */
public class EntryPointAbstractFactory {

    public static void run(){
        Drink cola= DrinkFactory.getDrink(new ColaFactory());

        System.out.println(cola.toString());

    }

}
