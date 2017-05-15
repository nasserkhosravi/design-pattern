package nasserKhosravi.designpattern.creational.singletone;

/**
 * Created by Naser on 5/12/2017
 */
public class SingleTone {

    private int anInt;

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public int getAnInt() {
        return anInt;
    }

    private static SingleTone ourInstance = new SingleTone();

    public static SingleTone getInstance() {
        return ourInstance;
    }

    private SingleTone() {
        anInt=1;
    }
}
