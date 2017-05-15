package nasserKhosravi.designpattern.behavioral.templatemethode.participants;

/**
 * Created by Naser on 5/12/2017
 */
public abstract class Animal {

    protected abstract void wakeUp();
    protected abstract void eat();
    protected abstract void work();
    protected abstract void sleep();

    public final void doCycle()
    {
        wakeUp();
        eat();
        work();
        eat();
        sleep();
    }

}
