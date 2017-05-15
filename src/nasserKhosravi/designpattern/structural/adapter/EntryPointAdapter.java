package nasserKhosravi.designpattern.structural.adapter;

import nasserKhosravi.designpattern.creational.abstractfactory.participants.Drink;
import nasserKhosravi.designpattern.structural.adapter.Participants.ISpecialPerson;
import nasserKhosravi.designpattern.structural.adapter.Participants.RegularPerson;
import nasserKhosravi.designpattern.structural.adapter.Participants.RegularToPersonAdapter;
import nasserKhosravi.designpattern.structural.adapter.Participants.SpecialPerson;

/**
 * Created by Naser on 5/13/2017
 * We have two type Person as {@link RegularPerson} and {@link SpecialPerson}
 * Our {@link DrinkService} have {@link DrinkService#getFreeDrink(ISpecialPerson)}
 *
 * Exclusively for SpecialPerson
 * Our RegularPerson has not enough cash for supply drink
 * So we must convert it to SpecialPerson
 */
public final class EntryPointAdapter {

    public static void run(){

        RegularPerson regularPerson=new RegularPerson("n1","f1");
        SpecialPerson specialPerson=new SpecialPerson("n2","f3");

        String resultRegularPerson = DrinkService.getLemonade(50);
        String resultSpecialPerson = DrinkService.getFreeDrink(specialPerson);

        System.out.println("Mr "+regularPerson.getFamily()+" "+resultRegularPerson);
        System.out.println("Mr "+specialPerson.getFamily()+" "+resultSpecialPerson);


        RegularToPersonAdapter regularToPersonAdapter = new RegularToPersonAdapter(regularPerson);
        String result=DrinkService.getFreeDrink(regularToPersonAdapter);

        System.out.println("Mr "+regularPerson.getFamily()+" "+result);

    }
}
