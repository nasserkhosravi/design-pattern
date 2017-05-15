package nasserKhosravi.designpattern.structural.flyweight;

/**
 * Created by Naser on 5/12/2017
 *
 * We want prevent from creating same instance
 *
 * This pattern is a little like SingleTone and we can call it MultiTone
 */
public class EntryPointFlyWeight {

    public static void run(){

        Tv tv30=TVFactory.getTv(30);
        Tv tv50=TVFactory.getTv(50);
        Tv tv30One=TVFactory.getTv(30);
    }
}
