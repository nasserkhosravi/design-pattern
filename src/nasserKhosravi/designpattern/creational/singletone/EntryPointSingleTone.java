package nasserKhosravi.designpattern.creational.singletone;

/**
 * Created by Naser on 5/12/2017
 * we want just one instance from {@link SingleTone}
 */
public class EntryPointSingleTone {

    public static void run(){
        SingleTone singleTone=SingleTone.getInstance();
        System.out.println(singleTone.getAnInt());
        
        singleTone.setAnInt(3);

        singleTone=SingleTone.getInstance();

        System.out.println(singleTone.getAnInt());
    }
}
