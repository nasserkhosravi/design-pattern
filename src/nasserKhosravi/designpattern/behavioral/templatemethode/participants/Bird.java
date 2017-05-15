package nasserKhosravi.designpattern.behavioral.templatemethode.participants;

/**
 * Created by Naser on 5/12/2017
 */
public class Bird extends Animal {

    @Override
    protected void wakeUp() {
        System.out.println("method wakeUp "+this.getClass().getSimpleName()+" call");
    }

    @Override
    protected void eat() {
        System.out.println("method eat "+this.getClass().getSimpleName()+" call");
    }

    @Override
    protected void work() {
        System.out.println("method work "+this.getClass().getSimpleName()+" call");
    }

    @Override
    protected void sleep() {
        System.out.println("method sleep "+this.getClass().getSimpleName()+" call");
    }

}
