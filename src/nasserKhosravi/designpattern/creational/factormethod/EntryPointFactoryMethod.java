package nasserKhosravi.designpattern.creational.factormethod;

import nasserKhosravi.designpattern.creational.factormethod.participants.Medal;
import nasserKhosravi.designpattern.creational.factormethod.participants.MedalFactory;

/**
 * Created by Naser on 5/9/2017
 *
 * We have a game and we want grant medal based on player's score
 */
public class EntryPointFactoryMethod {

    public static void run(){

        Medal willBeSilver = MedalFactory.getByScore(120);
        Medal willBeBronze = MedalFactory.getByScore(90);
        Medal wilBeGold = MedalFactory.getByScore(250);

        willBeSilver.printMessageScore();
        willBeBronze.printMessageScore();
        wilBeGold.printMessageScore();
    }

}
